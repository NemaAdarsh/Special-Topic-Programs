public class Exception4
{
	public static void main(String[] args)
	{
		int numer[ ] = {4, 8, 16, 32, 64};
		int denom[ ] = {2, 0, 4};
		try
		{
			for (int i = 0; i < numer.length; i++)
			{
				try
				{
					System.out.println(numer[i] + "/" + denom[i] + "=" + numer[i] / denom[i]);
				}
				catch (ArithmeticException e)
				{
					System.out.println("Divide by zero error");
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound");
		}
	}
}