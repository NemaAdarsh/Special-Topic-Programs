//Variable arguments in java is a method that takes a variable number of arguments, Variable Arguments
// in java simplifies the creation of methods that need to take a variable number of arguments.

public class varargs
{
	int defaulPara(int... a)
	{
		int sum = 0;
		for (int i : a)
		{
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		varargs test = new varargs();
		int val1 = 10;
		int val2 = 20;
		int result1 = test.defaulPara();
		int result2 = test.defaulPara(val1);
		int result3 = test.defaulPara(val1, val2);
		int result4 = test.defaulPara(1, 2, 3, 4);
		System.out.println("Resutl1 : " + result1);
		System.out.println("Resutl2 : " + result2);
		System.out.println("Resutl3 : " + result3);
		System.out.println("Resutl4 : " + result4);
	}
}