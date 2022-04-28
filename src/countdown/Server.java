package countdown;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

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
