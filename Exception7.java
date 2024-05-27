import java.util.*;
import java.io.*;

public class Exception7
{
	public static void main(String[] args)
	{
		Scanner in = null;
		File myFile = null;
		
		try
		{
			myFile = new File("Exception6.java");
			in = new Scanner(myFile);
			in.close();
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println(fnfe); //this fnfe is system predefined message
		}
		finally
		{
			if(in != null)
				in.close();
		}
	}
}