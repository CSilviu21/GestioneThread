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
import java.net.ServerSocket;

/**
     * @param args the command line arguments
     */
public class GestoreServer {
    
    
    
    
    public static void main (String[] args)
    {
            Server srv = new Server(2000);
            srv.inAscolto();
            
    }
    
}
