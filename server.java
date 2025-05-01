import java.util.*;       // For List, Map, etc.
import java.io.*;         // For InputStream, File, etc.
import java.net.*;        // For WebSocket, Socket, etc.
public class server {
    public static void main(String[] args) throws IOException{
           ServerSocket ss = new ServerSocket( 4999);    //Binds the server to port 4999 and starts listening for clients.
              Socket s = ss.accept();    //Accepts a connection from a client. The server will block until a client connects.
              System.out.println("client connected successfully");    //Prints a message indicating that a client has connected.

            InputStreamReader in=new InputStreamReader(s.getInputStream());    //Creates an InputStreamReader to read data from the client.
            BufferedReader br=new BufferedReader(in);    //Creates a BufferedReader to read text from the InputStreamReader.
            String str=br.readLine();    //Reads a line of text from the client.
            System.out.println("client says: "+str);    //Prints the message received from the client..

            PrintWriter pr=new PrintWriter(s.getOutputStream());    //Creates a PrintWriter object to send data to the server.
            pr.println("yes, it is working");    //Sends a message to the client.
            pr.flush(); 
    } 
}