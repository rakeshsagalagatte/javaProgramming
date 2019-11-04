import java.applet.Applet;
import java.lang.Thread;
import java.awt.event.*;
import java.awt.*;

 /*
    <html>
       <applet code="Banner.class"
                height = 500
                width = 500 >
                <param name=message
                       value=fgsdfjbjhsdfgv >
                       
       </applet>
       
       <input  type="text"
               name="msg"
               value=" "  >
               
               <input type="submit" value="submit" >
               
               </html>                
    */

public class Banner extends Applet implements Runnable
{
    String msg;
    Thread T=null;
    boolean stopflag;
    public void init()
    {
      setBackground(Color.blue);
      setForeground(Color.red);
       T = new Thread(this);
    }
    
    public void run()
    {
       char ch;
       for(;;)
       {
          try{
             repaint();
             T.sleep(250);
             ch = msg.charAt(0);
             msg = msg.substring(1,msg.length());
             msg += ch;
             if(stopflag)
                break;
          }catch (InterruptedException I)
          {
             System.out.println("Exception is Handled : " + I);
          }
       }
    }
    
    public void stop()
    {
     stopflag = true;
     T=null;
    }
    
    public void paint(Graphics g)
    {
      g.drawString(msg,10,30);
    }
    public void start()
    {
      msg = getParameter("message");
      if(msg==null)
        msg = " Message not found ";
      msg +=msg;
     
      stopflag=false;
      T.start();  
    }
      
   
}
