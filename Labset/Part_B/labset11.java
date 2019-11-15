import java.util.*;
class MulThread implements Runnable
{
    Thread t;
    String name;
    static String last;
    MulThread(String n, int p)
    {
        name=n;
        t= new Thread(this,name);
        t.setPriority(p);
        System.out.println("\n Current thread = "+t);
        t.start();
    }
    public void run()
    {
        System.out.println(name+" Started ");
        
        try
        {
               if(t.getName().equals("One") || (t.getName().equals("Two")))
               {
                   System.out.println("\n Thread "+t.getName()+" going to sleep");
                   Thread.sleep(1500);
               }
               for(int i=1;i<=5;i++)
               {
                  System.out.println(name+":"+i);
                  Thread.sleep(100);
               }
        }
        catch(InterruptedException e)
        {
            System.out.println("\n Child Thread Interrupted ");
        }
        last=name;
        System.out.println(name+" Exitted ");
    }
}

class labset11
{
    public static void main(String args[])
    {
        int p[]=new int[5];
        int temp;
        Scanner k= new Scanner(System.in);
         
        for(int i=0;i<5;i++)
        {
            System.out.print("\n Enter Priority of Thread :");
             p[i]=k.nextInt();
        }
        
        
        
        
        for(int i=0;i<=4;i++)
        {
            for(int j=i+1;j<=4;j++)
            {
                if(p[i]<p[j])
                {
                    temp=p[i];
                    p[i]=p[j];
                    p[j]=temp;
                }
            }
        }
        
        for(int i=0;i<5;i++)
        {
            System.out.print("\nPriority of Thread :"+(i+1)+" "+p[i]);
        }
        
        System.out.println("\n Thread one and two has highest priority so they are going to sleep");
        MulThread m1 = new MulThread("One",p[0]);
        MulThread m2 = new MulThread("Two",p[1]);
        MulThread m3 = new MulThread("Three",p[2]);
        MulThread m4 = new MulThread("Four",p[3]);
        MulThread m5 = new MulThread("Five",p[4]);

        
        try
        {
            Thread.sleep(500);
        }
        catch(InterruptedException e)
        {
            System.out.println("\n Main Thread Interrupted ");
        }
        
        System.out.println("Child Thread One = "+m1.t.isAlive());
        System.out.println("Child Thread Two = "+m2.t.isAlive());
        System.out.println("Child Thread Three = "+m3.t.isAlive());
        System.out.println("Child Thread Four = "+m4.t.isAlive());
        System.out.println("Child Thread Five = "+m5.t.isAlive());
        
        try
        {
            m1.t.join();
            m2.t.join();
            m3.t.join();
            m4.t.join();
            m5.t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("\n Main Thread Interrupted ");
        }
        
        System.out.println("Child Thread One = "+m1.t.isAlive());
        System.out.println("Child Thread Two = "+m2.t.isAlive());
        System.out.println("Child Thread Three = "+m3.t.isAlive());
        System.out.println("Child Thread Four = "+m4.t.isAlive());
        System.out.println("Child Thread Five = "+m5.t.isAlive());
        
        
        System.out.println("\n Long Lasting Thread is "+MulThread.last);
    }
}

