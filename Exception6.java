public class Exception6
{
	public static void main(String[] args)
	{
		int choice = 2;
		try
		{
            switch (choice)
			{
                case 1:
                    System.out.println("Normal return from try");
                    break;
                case 2:
                    System.out.println(2/0);
                    break;
                case 3:
					System.out.println("This case uses return in switch");
                    return;
                case 4:int a[]={1};
                    System.out.println(a[1]);
                    break;
            }
		}
		catch(ArithmeticException e)
		{
            System.out.println("Exception caught:Divide by zero");
        }
        
		finally
		{
            System.out.println("Finally");
            System.out.println("");
        }
    }
}