
package javaapplication5;

/**
 *
 * @author Luiz
 */
import java.util.Scanner;
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean run = true;
       String username = "user1";
       String password = "123";
       Scanner entrada = new Scanner(System.in);
       
       while(run){
           System.out.print("Username:");
           String user = entrada.nextLine();
           System.out.print("Password:");
           String passwd = entrada.nextLine();
           
           if(user.equals(username) && passwd.equals(password)){
               run = false;
               System.out.println("|------------------|");
               System.out.println("|Logado com sucesso|");
               System.out.println("|------------------|");
           }else{
               System.out.println("|----------------------------|");
               System.out.println("| Usuário ou senha invalidos |");
               System.out.println("|----------------------------|");
           }
       }
    }
    
}
