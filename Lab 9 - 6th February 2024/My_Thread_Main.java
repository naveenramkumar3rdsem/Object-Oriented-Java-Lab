class myThread extends Thread
{
	String message;
	int wait_Time;
	myThread(String message, int wait_Time)
	{
		this.message=message;
		this.wait_Time=wait_Time;
	}	
	public void run()
	{
		while(true)
		{
			System.out.println(message);
			try
			{
				Thread.sleep(wait_Time);
			}
			catch(InterruptedException e)
			{
				System.out.println("The thread is interrupted.");
				break;
			}
		}
	}
}

class My_Thread_Main
{
	public static void main(String args[])
	{
		myThread thread1=new myThread("BMS College of Engineering", 10000);
		myThread thread2=new myThread("CSE", 2000);
		thread1.start();
		thread2.start();
		try
		{
			Thread.sleep(30000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread is interrupted");
		}
		thread1.interrupt();
		thread2.interrupt();
	
	}
}