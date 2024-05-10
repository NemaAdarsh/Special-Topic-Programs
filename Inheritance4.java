class A
{
	public void makesound()
	{
		System.out.println("Animal makes a sound");
	}
}

class D extends A
{
	public void makesound()
	{
		System.out.println("Dog barks");
	}
}

class C extends A
{
	public void makesound()
	{
		System.out.println("Cat meows");
	}
}

public class Inheritance4
{
	public static void main(String[] args)
	{
		A od = new D();
		A oc = new C();
		
		od.makesound();
		oc.makesound();
	}
}