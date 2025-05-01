import java.util.*;       // For List, Map, etc.
import java.io.*;         // For InputStream, File, etc.
import java.net.*;        // For WebSocket, Socket, etc.
public class server {
    public static void main(String[] args) throws IOException{
           ServerSocket ss = new ServerSocket( 4999);    //Binds the server to port 4999 and starts listening for clients.
              Socket s = ss.accept();    //Accepts a connection from a client. The server will block until a client connects.
              System.out.println("client connected successfully");    //Prints a message indicating that a client has connected.
    } 
}