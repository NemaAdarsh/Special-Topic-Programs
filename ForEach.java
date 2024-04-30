class ForEach
{
	public static void main(String[] args)
	{
		int arr[] = {12, 13, 14, 15, 16};
		int total = 0;
		
		for(int i: arr)
			total += i;
		
		System.out.println("Total: " + total);
	}
}