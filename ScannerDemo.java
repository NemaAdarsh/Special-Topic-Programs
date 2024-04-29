import java.util.Scanner;
public class ScannerDemo
{
    public static void main(String[] args)
	{
        String name;
        Scanner input=new Scanner(System.in);       		//Read input from keyboard
        System.out.println("Enter your name");
        name=input.nextLine();
        System.out.println("Name is: "+name);
        
        String workPlace="PESU Bangalore";
        
        Scanner scan=new Scanner(workPlace);          	//Read input from String
        //scan.useDelimiter(","); we can just delete it, it has no use
        System.out.println("Works at: "+scan.next());     
    }
}

//usually delimiters are used to change the default limiter (;) to whatever we want