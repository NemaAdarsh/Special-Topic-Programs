public class Exception3
{
	//Try this piece of code: Gives compile time error
	//Exception   ArrayIndexOutOfBoundsException has already been caught
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
				catch (Exception e)
				{
					System.out.println("Generic Exception catch");
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound");
		}
	}
}