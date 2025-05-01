import java.util.*;       // For List, Map, etc.
import java.io.*;         // For InputStream, File, etc.
import java.net.*;        // For WebSocket, Socket, etc.
public class client {
    public static void main(String[] args) throws IOException{
           Socket s = new Socket("localhost", 4999);    //Initiates a TCP connection to a server at localhost:4999.
           
           PrintWriter pr=new PrintWriter(s.getOutputStream());    //Creates a PrintWriter object to send data to the server.
           pr.println("is it working?");    //Sends a message to the server.
           pr.flush();    //Flushes the PrintWriter to ensure all data is sent to the server.

           InputStreamReader in=new InputStreamReader(s.getInputStream());    //Creates an InputStreamReader to read data from the client.
           BufferedReader br=new BufferedReader(in);    //Creates a BufferedReader to read text from the InputStreamReader.
           String str=br.readLine();    //Reads a line of text from the client.
           System.out.println("server says: "+str);
    }
}
