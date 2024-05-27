interface Addable
{
	int add(int a, int b);
}

public class Lambda4
{
	public static void main(String[] args)
	{
		//Lambda expression with return keyword
		Addable ad2 = (int a, int b) ->
		{
			System.out.println("Multiline lambda expression");
			return (a + b);
		};
		System.out.println(ad2.add(250, 250));
	}
}