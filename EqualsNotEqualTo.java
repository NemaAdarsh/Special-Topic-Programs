class EqualsNotEqualTo
{
	public static void main(String args[])
	{
		String s1 = "Hello";
		String s2 = new String(s1);
		System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
		System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
		String s3=s1;
		System.out.println(s1 + " == " + s2 + " -> " + (s1 == s3));
	}
}

//s2 is not creating a reference to s1 its a new object thats why s1==s2 is false and the last one is true