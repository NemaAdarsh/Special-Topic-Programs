import java.util.Scanner;

class BitOperator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		
		String binary = Integer.toBinaryString(num);
		
		System.out.println("Binary form is :" + binary);
		
		int rShift = num >> 2;
		String rBinary = Integer.toBinaryString(rShift);
		System.out.println(rBinary);
	}
}