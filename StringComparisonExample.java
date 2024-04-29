public class StringComparisonExample
{
public static void main(String[] args)
{
String s1 = "Hello";
String s2 = "hello";
String s3 = new String("hello");
String s4 = "World";
System.out.println(s1.equals(s2)); //false
System.out.println(s2.equals(s3)); //true
System.out.println(s1.compareTo(s2)); //72 - 104 = -32
System.out.println(s3.compareTo(s4)); //104 - 87 = 17
}
}