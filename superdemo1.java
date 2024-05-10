class base
{
	void display()
	{
		System.out.println("Base class display");
	}
}

class child extends base
{
	void display()
	{
		System.out.println("Child class display");
	}
	void print()
	{
		super.display();
	}
}

class superdemo1
{
	public static void main(String args[])
	{
		child cobj = new child();
		cobj.display();
		cobj.print();
	}
}