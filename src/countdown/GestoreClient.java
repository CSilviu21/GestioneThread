/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countdown;
/**
 *
 * @author Silviu 5D
 */
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
     * @param args the command line arguments
     */
public class GestoreClient {
     public static void main (String[] args)
     {
         
         try {
             Client cli=new Client(InetAddress.getLocalHost(), 2000);
             String str=cli.leggi();
             
         } catch (UnknownHostException ex) {
             Logger.getLogger(GestoreClient.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
    
}
