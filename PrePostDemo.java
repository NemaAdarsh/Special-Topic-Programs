class PrePostDemo

/* 
{
	public static void main(String[] args)
	{
		int i = 3;
		i++;
		// prints 4
		System.out.println(i);
		++i;
		// prints 5
		System.out.println(i);
		// prints 6
		System.out.println(++i);
		// prints 6
		System.out.println(i++);
		// prints 7
		System.out.println(i);
	}
}
*/
//by the time it gets to next instruction the value of i will increment


//better program to understand pre increment and post increment
{
    public static void main(String[] args)
    {
    int i = 5;
    System.out.println(++i);
    System.out.println(i++);
    int a = i%3;
    System.out.println(a);
}}

//int a = 10
//a++++ gives syntax error/unexpected type
//evaluated as 10++,variavle is required to perform ++ operator. performing ++ on 10 is compilation error