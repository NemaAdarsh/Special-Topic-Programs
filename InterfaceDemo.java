/*interface A
{
    void doSomething();
}

interface B
{
    void doSomething();
}

class MultipleImpl implements A, B
{
    @Override
    public void doSomething()
	{
        System.out.println("Doing something");
    }
}*/

interface Series
{
    int getNext();          //return next number in series
    void reset();           //restart
    void setStart(int x);   //set starting value
}

class ByTwos implements Series
{
    int start;
    int val;
    ByTwos()
	{
        start = 0;
        val = 0;
    }
	//Implement the methods specified by series
	//Not specifying the methods public results in compile time error
    @Override
    public int getNext()
	{
        val = val + 2;
        return val;
    }

	@Override
    public void reset()
	{
        val = start;
    }
    @Override
    public void setStart(int y)
	{
        start = y;
        val = y;
    }
}

class ByThrees implements Series
{
    int start, val;
    @Override
    public int getNext()
	{
        val = val + 3;
        return val;
    }
    @Override
    public void reset()
	{
        val = start;
    }
    @Override
    public void setStart(int x)
	{
        start = x;
        val = x;
    }
}

public class InterfaceDemo
{
    public static void main(String[] args)
	{
        ByTwos ob1 = new ByTwos();
        for (int i = 0; i < 5; i++)
		{
            System.out.println("Next value is "+ob1.getNext());
        }
        System.out.println("Resetting");
        ob1.reset();
        for (int i = 0; i < 5; i++)
		{
            System.out.println("Next value is "+ob1.getNext());
        }
        System.out.println("\nStarting at 100");
        ob1.setStart(100);
        for (int i = 0; i < 5; i++)
		{
            System.out.println("Next value is "+ob1.getNext());
        }

		ByThrees ob2=new ByThrees();
        for(int i=0;i<5;i++)
		{
            System.out.println("Next value is "+ob2.getNext());
        }
        ob2.reset();
        System.out.println("Resetting");
        for(int i=0;i<5;i++)
		{
            System.out.println("Next value is "+ob2.getNext());
        }      
        System.out.println("Starting at 100");
        ob2.setStart(100);
        for(int i=0;i<5;i++)
		{
            System.out.println("Next value is "+ob2.getNext());
        }
    }
}