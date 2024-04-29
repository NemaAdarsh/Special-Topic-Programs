class Constructor3
{
	int a;
	boolean b;

    private Constructor3() {
        a = 5;
        b=true;
      }

	public static void main(String[] args)
	{

		// calls default constructor
		Constructor3 obj = new Constructor3();

		System.out.println("Default Value:");
		System.out.println("a = " + obj.a);
		System.out.println("b = " + obj.b);
	}
}