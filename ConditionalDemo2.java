class ConditionalDemo2
{
	public static void main(String[] args)
	{
		int value1 = 1;
		int value2 = 2;
		int result;
		boolean someCondition = true;
		result = someCondition ? value1 : value2;
		System.out.println(result);
	}
}


//if true then first value will be printed if false then second 