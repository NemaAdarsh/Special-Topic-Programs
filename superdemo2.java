class base
{
	int i;
	base()
	{
	
	}
	base(int i)
	{
		System.out.println("Base class parameterized constructor");
		this.i = i;
		System.out.println("i = " + i);
	}
}

class child extends base
{
	int j;
	child(int i, int j)
	{
		super(i);
		this.j = j;
		System.out.println("Child class parameterized constructor");
		System.out.println("i = " + i + " j = " + j);
	}
}

class superdemo2
{
	public static void main(String args[])
	{
		child cobj = new child(10, 20);
	}
}