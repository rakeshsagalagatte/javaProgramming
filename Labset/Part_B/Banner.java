import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Banner extends Applet implements Runnable,ActionListener{
	String msg;
	boolean flag;
	Thread T = null;
	TextField Text;
	Rectangle r = new Rectangle(10,7);
	Font f;
   public void init()
   {   
	   f = new Font("monospace",Font.ITALIC,25);
	   Text = new TextField(10);
	   Text.setBounds(r);
	   Text.setLocation(300, 400);
	   Button B = new Button("SUBMIT");
	   B.setBackground(Color.magenta);
	   T = new Thread(this,"Banner");
	   B.addActionListener(this);
	   add(B);
	   add(Text);
   }
   
   public void actionPerformed(ActionEvent ae) {
	   msg = Text.getText().toString();
	   
   }
   
   public void start() {
	   if(msg==null)
		   msg = " Message not found ";
	   msg+=msg;
	   flag = false;
	   T.start();   
   }
   public void run()
   {
	   char c;
	   for(;;)
	   {
		  try {
			  repaint();
			  T.sleep(250);
			  c=msg.charAt(0);
			  msg = msg.substring(1, msg.length());
			  msg += c;
              if(flag)
            	  break;
		  }catch (InterruptedException e) {
			// TODO: handle exception
			  System.out.println("Exception Handled : " + e);
		}
		  
	   }
   }
   public void stop() {
	   flag=true;
	   T=null;
   }
   
   public void paint(Graphics g) {
	   g.setFont(f);
	   setBackground(Color.darkGray);
	   g.setColor(Color.WHITE);
	   g.drawString(msg, 800, 200);
   }
}

/*
 * <html>
 * 
 * <applet code="Banner.class" height=5000 width=5000>
 *  
 * </applet>
 * </html>
 */
