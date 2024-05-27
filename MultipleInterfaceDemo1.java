interface InterA
{
    void doSomething();
}

interface InterB
{
    void doSomethingElse();
}

class MultipleInterface implements InterA, InterB
{
    
    public void doSomething()
	{
        System.out.println("Doing something");
    }
   
    public void doSomethingElse()
	{
        System.out.println("Doing something else");
    }
}

public class MultipleInterfaceDemo1
{
    public static void main(String[] args)
	{
        MultipleInterface ob = new MultipleInterface();
        ob.doSomething();
        ob.doSomethingElse();
    }
}