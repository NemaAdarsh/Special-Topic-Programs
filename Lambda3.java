interface mathop
{
	int operation(int a, int b);
}

public class Lambda3
{
	public static void main(String[] args)
	{
		mathop add = (int a, int b) -> a + b;
		System.out.println("2 + 3 = " + add.operation(2, 3));
		mathop subtract = (int a, int b) -> a - b;
		System.out.println("15 - 10 = " + subtract.operation(15, 10));
	}
}