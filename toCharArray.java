public class toCharArray 
{
    public static void main(String[] args)
    {
        String s1= "SUPER";
        System.out.println(s1);
        byte[] b_arr = s1.getBytes();
        for (int i = 0; i <b_arr.length;i++)
        {
            System.out.println(b_arr[i]);
        }
        char[] char_arr=s1.toCharArray();
        for (int i = 0; i <char_arr.length;i++)
        {
            System.out.println(char_arr[i]);
        }
        
    }

    
}
