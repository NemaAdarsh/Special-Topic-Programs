class Constructor2
{
	String languages;
	// constructor accepting single value
	Constructor2(String lang)
	{
		languages = lang;
		System.out.println(languages + " Programming Language");
	}

	public static void main(String[] args)
	{
		// call constructor by passing a single value
		Constructor2 obj1 = new Constructor2("Java");
		Constructor2 obj2 = new Constructor2("Python");
		Constructor2 obj3 = new Constructor2("C");
	}
}