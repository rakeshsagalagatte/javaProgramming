import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;


public class MouseEvents extends Applet implements MouseListener,MouseMotionListener
{
   String msg=" ";
   int mouseX=0,mouseY=0;
   public void init(){
   
  
   addMouseMotionListener(this);
   addMouseListener(this);
   
   }
   
   public void mouseClicked(MouseEvent me)
   {
     mouseX = 500;
     mouseY = 500;
     msg = "Mouse Clicked ";
     repaint();
   }
   
   public void paint(Graphics G)
   {
     setBackground(Color.red);
     G.drawString(msg,mouseX,mouseY);
   }
   
   public void mouseEntered(MouseEvent me)
   {
      mouseX=500;
      mouseY=500;
      msg = "Mouse Entered at : " + me.getX()  + "," +  me.getY() + " location .";
     showStatus(msg);
   }
   
    public void mouseExited(MouseEvent me)
   {
      mouseX=500;
      mouseY=500;
      msg = "Mouse Exited  at : " + me.getX()  + "," +  me.getY() + " location .";
    showStatus(msg);
   }
   public void mousePressed(MouseEvent me)
   {
     mouseX=me.getX();
      mouseY=me.getY();
      msg = "Mouse clicked at : " + me.getX()  + "," +  me.getY() + " location .";
     showStatus(msg);
   }
   
   public void mouseReleased(MouseEvent me)
   {
      mouseX=me.getX();
      mouseY=me.getY();
      msg = "Mouse up at : " + me.getX()  + "," +  me.getY() + " location .";
     showStatus(msg);
   }
   
   public void mouseDragged(MouseEvent me)
   {
      mouseX=me.getX();
      mouseY=me.getY();
      msg = "Mouse Dragged at : " + me.getX() + "," + me.getY() + " location .";
    showStatus(msg);
   }
   
   public void mouseMoved(MouseEvent me)
   {
      mouseX=me.getX();
      mouseY=me.getY();
      msg = "Mouse moved at : " + me.getX()  + "," +  me.getY() + " location .";
     showStatus(msg);
   }
}
/*

<html>
  <applet code="MouseEvents.class" height=500 width=500>
  
  </applet>
 </html> 

*/


