public class regionMatches
{
    public static void main(String[] args) {
        String Str1 = new String("Welcome to Java Learning");
        String Str2 = new String("Java Learning");
        String Str3 = new String("JAVA LEARNING");

        System.out.print("Return Value :");
        System.out.println(Str1.regionMatches(11, Str2, 0, 12));

        System.out.print("Return Value :");
        System.out.println(Str1.regionMatches(11, Str3, 0, 12));

        System.out.print("Return Value on ignoring cases :");
        System.out.println(Str1.regionMatches(true, 11, Str3,0, 12));

    }
}

//some change