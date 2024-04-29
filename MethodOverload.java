class Bird
{
    void fly() //0 param
	{
        System.out.println("Bird is flying");
    }
    
    void fly(int height) //1 param
	{
        System.out.println("Bird is flying "+height+" high");
    }
    
    void fly(String name,int height) //2 param
	{
        System.out.println(name+" is flying "+height+" feet high");
    }
}

public class MethodOverload
{
	public static void main(String[] args)
	{
        Bird bird1 = new Bird();
        bird1.fly();
        bird1.fly(10000);
        bird1.fly("Eagle",10000);
    }
}