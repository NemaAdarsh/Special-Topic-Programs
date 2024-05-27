interface A
{
    void doSomething();
}

interface B
{
    void doSomething();
}

class MultipleImpl implements A, B
{
    
    public void doSomething()
	{
        System.out.println("Doing something");
    }
}

public class MultipleInterfaceDemo2
{
    public static void main(String[] args)
	{
        A aref;
        B bref;
        MultipleImpl ob = new MultipleImpl();
        aref = ob;
        ob.doSomething();
        bref = ob;
        ob.doSomething();
    }
}