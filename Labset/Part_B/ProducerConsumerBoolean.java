//import java.lang.Thread;
//import java.lang.Runnable;

class Producer implements Runnable{

   Queue q;
   Thread T;
   Producer(Queue q)
   {
   this.q=q;
    T = new Thread(this, "Producer");
     T.start();
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
 Thread T;
  Consumer(Queue q)
  {
     this.q=q;
     T = new Thread(this,"Consumer");
      T.start();
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
    boolean value=false;
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
          this.n=n;
           value = true;
          System.out.println("put" + n);
         
          notify();
       }
    }
    
    synchronized int get()
    {
       while(!value)
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
        return n;
    }
    
    
}

class ProducerConsumerBoolean
{
   public static void main(String args[])
   {
      System.out.println("Press Ctrl+c to stop");
      Queue q = new Queue();
      Producer P= new Producer(q);
      Consumer C = new Consumer(q);
      
   }
}
