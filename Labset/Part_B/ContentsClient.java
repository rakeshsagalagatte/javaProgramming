 import java.net.*;
import java.io.*;
public class ContentsClient   
{
  public static void main( String args[ ] ) throws Exception
  {
   //  Socket sock = new Socket( "192.168.195.", 3000);
  Socket sock = new Socket( "127.0.0.1", 3000);
// reading the file name from keyboard. Uses input stream
     System.out.print("Enter the file name");
     BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
     String fname = keyRead.readLine();
                                         
// sending the file name to server. Uses PrintWriter
     OutputStream  ostream = sock.getOutputStream( );
     PrintWriter pwrite = new PrintWriter(ostream, true);
     pwrite.println(fname);            
// receiving the contents from server.  Uses input stream
     InputStream istream = sock.getInputStream();
     BufferedReader socketRead = new BufferedReader(new InputStreamReader(istream));
 
// reading line-by-line from server through socket
     String str;
     while((str = socketRead.readLine())  !=  null) 
     { 
         System.out.println(str);          
     } 
     pwrite.close();
     socketRead.close(); 
     keyRead.close();
  }
}
