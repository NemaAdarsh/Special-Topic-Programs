import java.nio.charset.Charset;

public class chardemo1
{
	public static void main(String args[])
	{
		String s1 = "Hello World";
		System.out.println(s1);
		
		String s2 = new String("Welcome to JAVA");
		System.out.println(s2);
		
		char char_arr[] = {'S', 'M', 'I', 'L', 'E'};
		String s3 = new String(char_arr);
		System.out.println(s3);
		
		String s4 = new String(char_arr, 1, 2);
		System.out.println(s4);
		
		String s5 = new String(s4);
		System.out.println(s5);
		
		byte[] b_arr = {80, 69, 83, 85};
		String s6 = new String(b_arr);
		System.out.println(s6);
		
		String s7 = new String(b_arr, 1, 3);
		System.out.println(s7);
		
		StringBuffer s_buffer = new StringBuffer("Monday");
		String s8 = new String(s_buffer);
		System.out.println(s8);
		
		StringBuilder s_builder = new StringBuilder("Tuesday");
		String s9 = new String(s_builder);
		System.out.println(s9);
		
		Charset ch = Charset.defaultCharset();
		String s10 = new String(b_arr, ch);
		System.out.println(s10);
		
		String s11 = new String(b_arr, 0, 3, ch);
		System.out.println(s11);
	}
}