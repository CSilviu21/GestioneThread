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
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
     * @param args the command line arguments
     */

public class Server 
    {
        ServerSocket ss;
        
        public Server(int porta)
        {
            try {
                ss=new ServerSocket(porta);
                System.out.println("Server in Ascolto");
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    public void inAscolto()
    {
            try {
                Socket so = ss.accept();
                System.out.println("Connessione avvenuta");
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
