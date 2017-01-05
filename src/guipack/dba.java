// Classe responsável por tratar da parte referente ao banco de dados


// Mais informações sobre o serial: http://www.neilconway.org/docs/sequences/
package guipack;

/**
 *
 * @author Willian
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.ui.RefineryUtilities;

public class dba {
    
    /////////// DECLARAÇÃO DAS VARIÁVEIS E CONSTANTES //////////////////////////
    
    private static final String DRIVER_NAME = "org.postgresql.Driver";
    private static final String usuario = "postgres"; //Nome do usuario
    private static final String senha = "f8j4stop2"; //Senha do usuario
    private static final String url = "jdbc:postgresql://localhost:5432/SolarDB2"; //Endereço do DB
    
    private final String sql1 = "CREATE TABLE SENSORES " +
                      "(ID_SENSOR SERIAL PRIMARY KEY," +             
                      " ID_GRAND INTEGER NOT NULL," +             
                      " ID_TIME BIGINT NOT NULL," +
                      " VALOR REAL NOT NULL)";
    
    private final String sql2 = "CREATE TABLE GRANDEZA " +
                      "(ID_GRAND INTEGER PRIMARY KEY NOT NULL," +
                      " NAME VARCHAR(12) NOT NULL)";
    
    private final String sql3 = "CREATE TABLE TEMPO " +
                      "(ID_TEMPO BIGSERIAL PRIMARY KEY," +
                      " VALTEMPO TIMESTAMP NOT NULL)";
    
    private final String CT1 = "INSERT INTO GRANDEZA (ID_GRAND, NAME) VALUES(1,'TENSAO1')";
    private final String CT2 = "INSERT INTO GRANDEZA (ID_GRAND, NAME) VALUES(2,'TENSAO2')";
    private final String CT3 = "INSERT INTO GRANDEZA (ID_GRAND, NAME) VALUES(3,'TENSAO3')";
    private final String CC1 = "INSERT INTO GRANDEZA (ID_GRAND, NAME) VALUES(4,'CORRENTE1')";
    private final String CC2 = "INSERT INTO GRANDEZA (ID_GRAND, NAME) VALUES(5,'CORRENTE2')";
    private final String CC3 = "INSERT INTO GRANDEZA (ID_GRAND, NAME) VALUES(6,'CORRENTE3')";
    private final String CIR = "INSERT INTO GRANDEZA (ID_GRAND, NAME) VALUES(7,'IRRADIACAO')";
    
    // Defines abaixo
    private final int ID_TENSAO1 = 1;
    private final int ID_TENSAO2 = 2;
    private final int ID_TENSAO3 = 3;
    private final int ID_CORRENTE1 = 4;
    private final int ID_CORRENTE2 = 5;
    private final int ID_CORRENTE3 = 6;
    private final int ID_IRRADIACAO = 7;
    
    private static Connection c;
    ///////////////////////////////////// METODOS ////////////////////////////////////////////
    
    public dba()
    {
        //Connection c = null;
        try{
            
            Class.forName(DRIVER_NAME);
            c = DriverManager.getConnection(url,usuario,senha);
            if(c != null)   JOptionPane.showMessageDialog(null,"Conectado ao banco de dados");
            else{ 
                JOptionPane.showMessageDialog(null,"DB não encontrado/ não existente");
                System.exit(0);
            }
        }catch(SQLException ex){
            ex.printStackTrace();       
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(dba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void create_table(int categoria)
    {
        Statement smt = null;
        
        try{
            
            String utl;
            if(categoria == 1) utl = sql1;
            else if(categoria == 2) utl = sql2;
            else    utl = sql3;
            
            DatabaseMetaData dbm = c.getMetaData();
            ResultSet tbl = dbm.getTables(null,null,utl,null);
            if(tbl.next()){ //Tabela existe
                System.out.println("Tabela existe");
            }else{  //Tabela nao existe -> Necessario cria-la
                
                smt = c.createStatement();
                smt.executeUpdate(utl);
                
                System.out.println("Tabela " +utl+ "criada");
                
                if(categoria == 2){ 
                //Se foi criada a tabela 2, é necessário adicionar todos os sensores disponíveis
                    dba.insertGRANDEZA(CT1);
                    System.out.println(CT1);
                    dba.insertGRANDEZA(CT2);
                    dba.insertGRANDEZA(CT3);
                    dba.insertGRANDEZA(CC1);
                    dba.insertGRANDEZA(CC2);
                    dba.insertGRANDEZA(CC3);
                    dba.insertGRANDEZA(CIR);
                }
                
            }
            
        }catch(SQLException e){
            System.out.println("Erro de SQL:" + e);
        }finally{
            
            try{
                if(smt != null) smt.close();
                
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }           
    }
    
    public void insert_data(int GRDIDX, double VAL_ADC, Timestamp time)
    {
        Statement s = null;
        
        long mdb;
        
     
        
            if(GRDIDX == -1)    System.out.println("Porta inválida!");
            else{
                
                mdb = dba.insertTEMPO(time);
                dba.insertSENSORES(GRDIDX,mdb,VAL_ADC);
                
            }
          
    }
    
    public static void insertGRANDEZA(String query)
    {
        Statement s = null;
        
        try{
           s = c.createStatement();
           s.executeUpdate(query);
                 
        }catch(SQLException Sqlex){}
        catch(Exception Ex){}
        finally{
            
            try{
                
                if(s != null)
                   s.close();
            }catch(SQLException Sql){
                System.out.println("Erro de SQL ao inserir em TEMPO: " + Sql.toString());
            }
        }
    }
    
    public static long insertTEMPO(Timestamp Tmp)
    // Método retorna inteiro, que é referente ao valor do sensor a ser adicionado em SENSORES
    {
        Statement s = null;
        long lg = -1;
        
        try{
        
            s = c.createStatement();
            String query = "INSERT INTO TEMPO(VALTEMPO) VALUES ('" + Tmp + "');";
            s.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
         
            ResultSet keyset = s.getGeneratedKeys();
            if(keyset.next()){  
                lg = keyset.getLong(1);
            }
            
            
        }catch(SQLException Sqlex){
            System.out.println("Erro de SQL ao inserir em TEMPO: " + Sqlex.toString());
        } 
        finally{
            
            try{
                
                if(s != null)
                   s.close();
            }catch(SQLException Sql){
                System.out.println("Erro de SQL ao inserir em TEMPO: " + Sql.toString());
            }
        }
        
        return lg;
    }
    
    
    public static void insertSENSORES(int ID_GRANDEZA, long ID_TIME, double VAL)
    {
         
        Statement s = null;
        
        try{
            
            s = c.createStatement();
            String query = "INSERT INTO SENSORES(ID_GRAND,ID_TIME,VALOR)" +
                            "VALUES("+ID_GRANDEZA+","+ID_TIME+","+VAL+");";
            s.executeUpdate(query);
            
            
        }catch(SQLException Sqlex){}
        catch(Exception Ex){}
        finally{
            
            try{
                
                if(s != null)
                   s.close();
            }catch(SQLException Sql){
                System.out.println("Erro de SQL ao inserir em TEMPO: " + Sql.toString());
            }
        }        
         
    }
    
    public static void query(String Grand, String superior, String inferior)
    {
        Statement s = null;
        
        
        int ID=-1;
        if(Grand == "Tensao1")
            ID = 1;
        else if(Grand == "Tensao2")            
            ID = 2;
        else if(Grand == "Tensao3")
            ID = 3;            
        else if(Grand == "Corrente1")
            ID = 4;            
        else if(Grand == "Corrente2")
            ID = 5;            
        else if(Grand == "Corrente3")
            ID = 6;            
        else if(Grand == "Irradiacao")
            ID = 7;
        
        if(ID != -1)
            {
                String str = null;
                        
                String CARGA = "SELECT G.NAME, S.VALOR, T.VALTEMPO " +
                        " FROM SENSORES S " +
                        "INNER JOIN GRANDEZA G ON " +
                        "(S.ID_GRAND = G.ID_GRAND) " +
                        "INNER JOIN " +
                        "TEMPO T ON (S.ID_TIME = T.ID_TEMPO) " +
                        "WHERE( G.ID_GRAND = " +ID+ " AND " +
                        "T.VALTEMPO >= '" +inferior+ "' AND " +
                        "T.VALTEMPO <= '" +superior+ "');";
                /*
                String CARGA = "SELECT G.NAME, S.VALOR, T.VALTEMPO  FROM SENSORES S   INNER JOIN GRANDEZA G ON "+
                                "(S.ID_GRAND = G.ID_GRAND) INNER JOIN TEMPO T ON (S.ID_TIME = T.ID_TEMPO) "+
                                "WHERE( G.ID_GRAND = 1 AND VALTEMPO > '2016-05-25 00:00:00' AND"+
                                " VALTEMPO < '2016-05-26 00:00:00')";*/
                
               
            try{

                s = c.createStatement();
                ResultSet crp = s.executeQuery(CARGA);
                System.out.println("Vegeta: " +CARGA);
                
                int h=0;
                String[] strd = new String[9999];
                Double[] vald = new Double[9999];
                String[] ts = new String[9999];
                //String jfslkfj = null;
                while (crp.next())
                {
                   //System.out.println("Nome: " +crp.getString(1)+" | Valor: " +crp.getDouble(2)+" | Tempo: " +crp.getTimestamp(3));
                    strd[h] = crp.getString(1);
                    vald[h] = crp.getDouble(2);
                    ts[h] = crp.getString(3);
                    h++;
                }
                //int i=0;
                //for(i=0;i<h;i++) System.out.println("Nome: " +strd[i]+" | Valor: " +vald[i]+" | Tempo: " +ts[i]);
                
                crp.close();
                s.close();
                
                
                
                LineChart_AWT chart = new LineChart_AWT("Gráfico", Grand,vald,ts,h,Grand);
                chart.pack();
                RefineryUtilities.centerFrameOnScreen( chart );
                chart.setVisible( true );
                
            }catch(Exception e){
                System.out.println("Erro: " + e);
            }
    }
        
    }
    
    public static void close(){
        
        try {
            if(c != null) c.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao encerrar banco de dados!");
        }
        
    }
    
    
}
