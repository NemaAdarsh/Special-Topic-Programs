interface input
{
	int count=10;
	void display();
	//default method
	default void print()
	{
		System.out.println("Default implementation of print");
	}
}

class A implements input
{
	public void display()
	{
		System.out.println("Class A's display");
	}
	public void print()
	{
		System.out.println("Class A's print");
	}
}

public class InterfaceDm
{
	public static void main(String[] args)
	{
		A ob = new A();
		ob.display();
		ob.print();
	}
}