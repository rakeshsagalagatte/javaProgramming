class producer implements Runnable
{
	Queue q;
	Thread t;
	producer(Queue q)
	{
		this.q=q;
		t=new Thread(this,"Producer");
		t.start();
	}
	public void run()
	{
			int i=0;
			while(true)
			{
				q.put(++i);			
			}
	}
}
class Consumer implements Runnable
{
	Queue q;
	Thread t;
	Consumer(Queue q)
	{
		this.q=q;
		t=new Thread(this,"Consumer");
		t.start();
	}
	public void run()
	{
		int i;		
		while(true)
		{
			i=q.get();
			System.out.println("Element = "+i);	
		}
	}	
}
class Queue
{
	int n;	
	boolean flag=false;
	Queue()
	{}
			/*void put(int val)
			{
				n=val;
				System.out.println("Put  :  "+n);
			}
			int get()
			{		
				return n;
			}*/
		//}
		
	
			synchronized void put(int val)
			{
				while(flag)
				{
					try{
						wait();					
					}
					catch(InterruptedException e){
						System.out.println("Exception occured");
					}
				}
				n=val;
				flag=true;
				System.out.println("Put  :  "+n);
				notify();
			}
			synchronized int get()
			{
				while(!flag)
				{
					try{
						wait();
					}
					catch(InterruptedException e)
					{
						System.out.println("Exception in sync get");
					}
				}
				flag=false;
				notify();
				return n;
			}
		
	}

class ProducerConsumerProblem
{
	public static void main(String [] args)
	{
		Queue q=new Queue();
		new producer(q);
		new Consumer(q);
		System.out.println("Ctrl+C to exit");
	}
}


		
		
		
