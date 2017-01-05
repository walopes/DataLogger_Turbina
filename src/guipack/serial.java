// Classe destinada a comunicação entre o microcontrolador e o PC/ servidor

package guipack;

/**
 *
 * @author Willian
 * @version 18/05/2016
 */

import static guipack.GUITeste.Corrente1;
import static guipack.GUITeste.Corrente2;
import static guipack.GUITeste.Corrente3;
import static guipack.GUITeste.Irradiacao;
import static guipack.GUITeste.Tensao1;
import static guipack.GUITeste.Tensao2;
import static guipack.GUITeste.Tensao3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import jssc.*;


public class serial {
    
    private final int TAMANHO_PALAVRA = 7; // Tamanho da string a ser enviada pelo ucon
    String s;
    private boolean verificador = true;
    private static final double VCC = 3.0;
    
    private static int TENSAO1 = -1;
    private static int TENSAO2 = -1;
    private static int TENSAO3 = -1;
    private static int CORRENTE1 = -1;
    private static int CORRENTE2 = -1;
    private static int CORRENTE3 = -1;
    private static int IRRADIACAO = -1;

    private static SerialPort Elemento = null;
    
    
    private static Timer timer;
    
    private static final int ID_TENSAO1 = 1;
    private static final int ID_TENSAO2 = 2;
    private static final int ID_TENSAO3 = 3;
    private static final int ID_CORRENTE1 = 4;
    private static final int ID_CORRENTE2 = 5;
    private static final int ID_CORRENTE3 = 6;
    private static final int ID_IRRADIACAO = 7;
    
    // CONSTRUTOR DA CLASSE SERIAL
    // O construtor da classe cria a conexão com os padrões especificados pela GUI e recebe os dados pela porta serial
    public serial(dba Banco, String Porta, int Baud, int T1, int T2, int T3, int C1, int C2, int C3, int Ir){  
     
        //System.out.println(Porta);
        SerialPort Auxiliar = null;
        Auxiliar = new SerialPort(Porta);
        //if(Auxiliar == null)    System.out.println("Nulo");
        
        try {
            
                ///System.out.println("FOGO");

                Auxiliar.openPort(); 
                Auxiliar.setParams(Baud,8,1,0);
                //int mask = Auxiliar.MASK_RXCHAR + Auxiliar.MASK_CTS + Auxiliar.MASK_DSR;
                int mask = SerialPort.MASK_RXCHAR + SerialPort.MASK_CTS + SerialPort.MASK_DSR;//Prepare mask
                Auxiliar.setEventsMask(mask);//Set mask
                serial.reconv(T1,T2,T3,C1,C2,C3,Ir);
                Elemento = Auxiliar;
                
                timer = new Timer(100, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            //Sr1 = new serial(DBA,Porta, Baud,Tensao1,Tensao2,Tensao3,Corrente1,Corrente2,Corrente3,Irradiacao);
                        
                            try {
                                
                                byte buffer[] = Elemento.readBytes(TAMANHO_PALAVRA); //Recebe o que foi enviado pela porta serial
                                s = new String(buffer); //Converte byte para String
                                

                                char[] vetor = s.toCharArray();
                                if(vetor[0] == ';' && vetor[2] == ';') //Para ter sincronização entre o ucon e o programa 
                                    System.out.println(s);
                                    //serial.gerencia_io(Banco,s);

                                } catch (SerialPortException ex) {
                                       System.out.println("Problema na recepção utilizando a porta " + Porta);
                                       //System.out.println(ex);
                                } 
                        }
                    });
                    timer.start();
                
                
        }
        catch (SerialPortException ex){
            //System.out.println(ex);
            System.out.println("Porta não encontrada!");
            JOptionPane.showMessageDialog(null,"Porta serial não encontrada!");
           // serial.close();
           //System.exit(0);
        }
    }    
    
    // Método responsável por realizar a conversão dos valores recebidos do ADC 
    public static void gerencia_io(dba Banco, String str)
    {
        int aux=0, conta=0, ver=-1;
        
        //Pegar o valor do ADC
        aux = Character.getNumericValue(str.charAt(3));
        conta+= aux*1000;
        aux = Character.getNumericValue(str.charAt(4));
        conta+= aux*100;
        aux = Character.getNumericValue(str.charAt(5));
        conta+= aux*10;
        aux = Character.getNumericValue(str.charAt(6));
        conta+= aux;
        double adc = ((double)conta * VCC)/((double)1023);
        
        //Valor referente ao canal que esta enviando a forma de onda
        aux = Character.getNumericValue(str.charAt(1));
        
        //Associacao do canal com a devida tabela/ grandeza que deve ser adicionado
        if(aux == TENSAO1)
            ver = ID_TENSAO1;
        else if(aux == TENSAO2)            
            ver = ID_TENSAO2;
        else if(aux == TENSAO3)
            ver = ID_TENSAO3;            
        else if(aux == CORRENTE1)
            ver = ID_CORRENTE1;            
        else if(aux == CORRENTE2)
            ver = ID_CORRENTE2;            
        else if(aux == CORRENTE3)
            ver = ID_CORRENTE3;            
        else if(aux == IRRADIACAO)
            ver = ID_IRRADIACAO;
        
        //Aquisicao do tempo em que a amostra foi feita (no formato de timestamp)
        java.util.Date date= new java.util.Date();
        Timestamp tmp = new Timestamp(date.getTime());
        
        Banco.insert_data(ver,adc,tmp);
    }
    
    // Passar os valores selecionados na GUI p/ a classe
    public static void reconv(int T1, int T2, int T3, int C1, int C2, int C3, int Ir)
    {
        TENSAO1 = T1;
        TENSAO2 = T2;
        TENSAO3 = T3;
        CORRENTE1 = C1;
        CORRENTE2 = C2;
        CORRENTE3 = C3;
        IRRADIACAO = Ir;
    }
    
    public static void close()
    {
         try {
             if(Elemento != null)  Elemento.closePort();
        } catch (SerialPortException ex) {
            System.out.println("Erro ao encerrar conexão serial!");
        }
        timer.stop();
        //dba.close();
         
    }
    
}
