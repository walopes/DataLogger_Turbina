// Willian Americano Lopes
// Programa feito para rodar em OS Windows 64-bit
// Bibliotecas que devem ser incluidas no projeto:
//
// jSSC-2.6.0 (x64)
// 
////////////////////////////////////////////////////////////////////////////////
// Olhar: http://dba.stackexchange.com/questions/13882/database-redesign-opportunity-what-table-design-to-use-for-this-sensor-data-col
package guipack;

//Alguma hora vai dar pau no BD: utilizando long (64-bit) como BIGSERIAL (8-bit)

/**
 * This program reads data from a solar sensor and stores it in a database
 * 
 * @author Willian
 * @version 1.0
 * @since 10/05/2016
 */
public class Principal {
    
    public static void main(String[] Args)
    {
        //Verificar/ Iniciar o banco de dados
        
        
        
        //Iniciar o programa/GUI
        GUITeste Tela = new GUITeste(); //Criar janela
        Tela.setVisible(true); //?, mas sem esse nao aparece na tela
        
        //System.out.println("ACABOOOOOUUUUUUUUUUUUUUUUUU");
        
    }
}
