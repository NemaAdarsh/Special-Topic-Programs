import java.util.*;
public class Lambda5
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		list.add("Ankit");
		list.add("Mayank");
		list.add("Johnny");
		list.add("Jodha");
		
		list.forEach(
			(n) -> System.out.println(n)
		);
	}
}