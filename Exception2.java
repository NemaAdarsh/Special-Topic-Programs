public class Exception2
{
	public static void main(String[] args)
	{
		try
		{
			int a = 5, b = 0;
			int res = a / b;
			System.out.println("Integer Division " + a + "/" + b + "=" + res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Displaying user defined message");
			System.out.println("Divide by 0 error");
			System.out.println();
			System.out.println("Displaying description of exception");
			System.out.println(e);
			System.out.println();
			System.out.println("Displaying stack trace");
			e.printStackTrace(System.out);
		}
	}
}