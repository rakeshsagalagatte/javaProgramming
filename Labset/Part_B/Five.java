import java.io.Thread;

public class Five {
 
    public static void main(String args[])
   {
         Thread[] t= new Thread[5];
        /* Thread t2 = new Thread();
         Thread t3 = new Thread();
         Thread t4 = new Thread();
         Thread t5 = new Thread();  */
         for(int i=1;i<6;i++)
         {
             t[i] = new Thread();
              t[i].setPriority(i);
         }
        /* t1.setPriority(1);
         t2.setPriority(2);
         t3.setPriority(3);
         t4.setPriority(4);
         t5.setPriority(5); */
         try{
           t[4].sleep(1000);
           t[5].sleep(1000);
         }
         catch (Exception ex)
         {
            System.out.println(ex);
         }
         for(int i=1;i<6;i++)
         {
            System.out.println(" Thread " + i + "  is  " + T[i].isAlive());
         } 
         
   }  
}