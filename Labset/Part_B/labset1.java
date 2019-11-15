import java.util.Scanner;
class Count implements Runnable
{        static String last;
	long c=0;
	boolean running=true;	
	Thread t;
	Count(int p)
	{
		t=new Thread(this);
		t.setPriority(p);
		if(p==8)
		{
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception");
			}
		}
	}
	public void run()
	{
		while(running)
			c++;
	         last = t.getName();		
	}
	public void start()
	{
		t.start();
	}
	public void stop()
	{
		running=false;	
	}
}
class ThreadPriority
{
	public static void main(String [] args)
	{
		Thread a=Thread.currentThread();
		a.setPriority(10);
		Count t1=	new Count(1);
		Count t2=	new Count(3);
		Count t3=	new Count(6);
		Count t4=	new Count(4);
		Count t5=	new Count(8);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		System.out.println("Aliveness of thread t1 =  "+t1.t.isAlive());
		System.out.println("Aliveness of thread t2 =  "+t2.t.isAlive());
		System.out.println("Aliveness of thread t3 =  "+t3.t.isAlive());
		System.out.println("Aliveness of thread t4 =  "+t4.t.isAlive());
		System.out.println("Aliveness of thread t5 =  "+t5.t.isAlive());
		t1.stop();
		t2.stop();
		t3.stop();
		t4.stop();
		t5.stop();
		
		System.out.println("t1 count = "+t1.c);
		System.out.println("t2 count = "+t2.c);
		System.out.println("t3 count = "+t3.c);
		System.out.println("t4 count = "+t4.c);
		System.out.println("t5 count = "+t5.c);
		try{
			t1.t.join();
			t2.t.join();
			t3.t.join();
			t4.t.join();
			t5.t.join();
		}
		catch(InterruptedException e){
			System.out.println("Exception occurred");
		}
		System.out.println("Aliveness of thread t1 =  "+t1.t.isAlive() + "  "  + t1.t.getName());
		System.out.println("Aliveness of thread t2 =  "+t2.t.isAlive() + "  "    + t2.t.getName());
		System.out.println("Aliveness of thread t3 =  "+t3.t.isAlive() +  "  " + t3.t.getName());
		System.out.println("Aliveness of thread t4 =  "+t4.t.isAlive()    +  "  " + t4.t.getName());
		System.out.println("Aliveness of thread t5 =  "+t5.t.isAlive()   +  "  " + t5.t.getName());
		
		System.out.println("Last thread is :  " + Count.last);
	}	
}
