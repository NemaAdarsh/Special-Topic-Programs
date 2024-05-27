public class Exception5
{
	public static void main(String[] args)
	{
		try
		{
			int result = 10 / 0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Caught Arithmetic Exception: " + ae.getMessage());
		
			try
			{
				//nested try-catch block inside the catch block
				String str = null;
				int length= str.length();
			}
			catch(NullPointerException npe)
			{
				System.out.println("Caught Null Pointer Exception: " + npe.getMessage());
			}
		}
		catch(Exception e)
		{
			System.out.println("Caught Exception: " + e.getMessage());
		}
	}
}