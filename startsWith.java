public class startsWith
{
    public static void main(String[] args) {
        String Str1 = new String("Welcome to Java Learning");
        String Str2 = new String("Java Learning");
        String Str3 = new String("JAVA LEARNING");

        System.out.println(Str1.startsWith("Welcome"));
        System.out.println(Str2.endsWith("Learning"));
        System.out.println(Str3.startsWith("Java"));

    }
}