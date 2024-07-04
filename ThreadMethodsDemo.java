public class ThreadMethodsDemo extends Thread
{
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Thread methods demo");
			try
			{
				System.out.println("Thread is going to sleep");
				ThreadMethodsDemo.sleep(2000);
				System.out.println("Thread wakeup");
			}
			catch(InterruptedException e)
			{
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		ThreadMethodsDemo de = new ThreadMethodsDemo();
		
		System.out.println("getstate1 " + de.getState());
		de.start();
		
		System.out.println("getstate2 " + de.getState());
		System.out.println("getstate3 " + de.getState());
		System.out.println("getstate4 " + de.getState());
		System.out.println("Thread name " + de.getName());
		System.out.println("Thread priority " + de.getPriority());
		System.out.println("getstate5 " + de.getState());
	}
}