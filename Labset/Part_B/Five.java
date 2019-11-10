import java.lang.Thread;
import java.lang.*;
public class Five {
 
    public static void main(String args[])
   {
         Thread[] t= new Thread[5];
         for(int i=0;i<5;i++)
         {
             t[i] = new Thread();
              t[i].setPriority(i+4);
         }
         try{
           t[3].sleep(1000);
           t[4].sleep(1000);
         }
         catch (InterruptedException ex)
         {
            System.out.println(ex);
         }
         for(int i=0;i<5;i++)
         {
            System.out.println(" Thread " + i + "  is Alive :  " + t[i].isAlive());
         } 
         
   }  
}
