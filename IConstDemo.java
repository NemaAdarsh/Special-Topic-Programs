interface IConst
{
    int MIN = 0;
    int MAX = 10;
    String ERRORMSG = "Boundary Error";
}

//Gain Access to constants by implementing IConst
public class IConstDemo implements IConst
{
    public static void main(String[] args)
	{
	    int[] num = new int[MAX];
        for(int i = MIN; i < (MAX + 1); i++)
		{
            if(i >= MAX)
                System.out.print(ERRORMSG);
            else
			{
                num[i] = i;
                System.out.print(num[i] + " ");
            }          
        }
    }  
}