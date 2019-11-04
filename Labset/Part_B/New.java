
 class Q
{
	int n;
	boolean valueSet = false;
	synchronized int get()
	{
		while(!valueSet)
		try
		{
			wait();
		}
		catch(InterruptedException e)
		{
			System.out.println("InterruptedException caught"+e);
		}
		System.out.println("Got:" + n);
valueSet = false;
notify();
return n;
	}
	synchronized void put(int n)
	{
		while(valueSet)
		try
		{
			wait();
		}
		catch(InterruptedException e)
		{
			System.out.println("InterruptedException caught");
		}
this.n = n;
valueSet = true;
System.out.println("Put:" + n);
notify();
	}
}
class Producer implements Runnable
{
	Q q;
	Thread t;
	Producer(Q q)
	{
		this.q = q;
		t = new Thread(this,"Producer");
		t.start();
	}
	public void run()
	{
		int i = 0;
		while(true)
		{
			q.put(i++);
		}
	}
}
class Consumer implements Runnable
{
	Q q;
	Thread t;
	Consumer(Q q)
	{
		this.q = q;
		t = new Thread(this,"Consumer");
		t.start();
	}
	public void run()
	{
		while(true)
			q.get();
	}
}
class producer
{
	public static void main(String args[])
	{
		System.out.println("Press Control-C to stop");
		Q q = new Q();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
	}
}

