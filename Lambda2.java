interface mathop
{
	int operation(int a);
}

public class Lambda2
{
	public static void main(String[] args)
	{
		mathop negate = (int a) -> a * -1;
		System.out.println("Negative of 6 = " + negate.operation(6));
	}
}