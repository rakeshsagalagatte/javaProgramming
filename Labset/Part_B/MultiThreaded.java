import java.lang.Thread;
import java.lang.Runnable;

class Producer implements Runnable{

   Queue q;
   Producer(Queue q)
   {
   this.q=q;
     new Thread(this, "Producer").start();
   }
   public void run()
   {
     int i=0;
     while(true)
        q.put(i++);
   }
}

class Consumer implements Runnable{

 Queue q;
  Consumer(Queue q)
  {
     this.q=q;
     new Thread(this,"Consumer").start();
     
  }
  public void run()
  {
     while(true)
        q.get();
  }
}

class Queue
{
    int n;
    boolean value=true;
    synchronized void put(int n)
    {
       while(value)
       {
          try{
           wait();
          }
          catch (InterruptedException I)
          {
              System.out.println("Exception is Handled : " + I);
          }
          System.out.println("put" + n);
          value = false;
          notify();
       }
    }
    
    synchronized void get()
    {
       while(! value)
       {
            try{
              wait();
            }
            catch(InterruptedException I)
            {
                 System.out.println("Exception is Handled : " + I);
            }
            
            System.out.println("got " + n );
            value = false;
            notify();
       }
    }
    
    
}

class ProducerConsumerBoolean
{
   public static void main(String args[])
   {
      Queue q = new Queue();
      Producer P= new Producer(q);
      Consumer C = new Consumer(q);
   }
}
