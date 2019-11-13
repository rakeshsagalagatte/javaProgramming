import java.net.*;
import java.io.*;
public class ContentsServer   
{
  public static void main(String args[]) throws Exception
  {                           
// establishing the connection with the server
     ServerSocket sersock = new ServerSocket(3000);
     System.out.println("Server ready for connection");
     Socket sock = sersock.accept();    // binding with port: 4000
     System.out.println("Connection is successful ");
                                                                                                 
// reading the file name from client
     InputStream istream = sock.getInputStream( );
     BufferedReader fileRead =new BufferedReader(new InputStreamReader(istream));
     String fname = fileRead.readLine( );
     System.out.println(fname);
 
     FileReader fr=new FileReader(fname);
     BufferedReader contentRead = new BufferedReader(fr) ;
    
// keeping output stream ready to send the contents
     OutputStream ostream = sock.getOutputStream( );
     PrintWriter pwrite = new PrintWriter(ostream, true);
// reading line-by-line from file   
     String str;
try{
     while((str = contentRead.readLine()) !=  null) 
     {
	pwrite.println(str); // sending each line to client through socket
     }
}
catch(IOException e)
{
 pwrite.println(" EXIT");
}
// closing network sockets     
     sock.close();  
     sersock.close();      
     pwrite.close(); 
     fileRead.close(); 
     contentRead.close();
     System.out.println("Connection Terminated");
  
  }
}

