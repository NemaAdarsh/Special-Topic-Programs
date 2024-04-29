class StaticVariable
{
	static int a = m1();  //static variable
	
	static    //static block
	{
		System.out.println("Inside static block.");
	}
	
	static int m1()  //static method
	{
		System.out.println("From m1");
		return 20;
	}
	
	public static void main(String [] args)  //static method (main!!)
	{
		System.out.println("Value of a: " + a);
		System.out.println("From main");
	}
}