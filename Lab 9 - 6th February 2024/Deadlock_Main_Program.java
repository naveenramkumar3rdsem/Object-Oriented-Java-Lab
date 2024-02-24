class A
{
	synchronized void foo(B b)
	{
		System.out.println(Thread.currentThread().getName()+" is accessing A.foo()");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("A interrupted.");
		}
		System.out.println("Trying to access B.last()");
		b.last();
	}
	synchronized void last()
	{
		System.out.println("Inside A.last()");
	}
}
class B
{
	synchronized void bar(A a)
	{
		System.out.println(Thread.currentThread().getName()+" is accessing B.foo()");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("B interrupted.");
		}
		System.out.println("Trying to access A.last()");
		a.last();
	}
	synchronized void last()
	{
		System.out.println("Inside B.last()");
	}
}
class Deadlock_Main_Program implements Runnable
{
	A a=new A();
	B b=new B();
	Deadlock_Main_Program()
	{
		Thread.currentThread().setName("MainThread");
		Thread t=new Thread(this, "RacingThread");
		t.start();
		a.foo(b);
		System.out.println("Back in main thread.");
	}
	public void run()
	{
		b.bar(a);
		System.out.println("Back in other thread");
	}
	public static void main(String args[])
	{
		new Deadlock_Main_Program();
	}
}



	
