interface Series
{
    int getNext();
    void reset();
    void setStart(int x);
}

class ByTwos implements Series
{
    int start;
    int val;
    int priorVal;
    @Override
    public int getNext()
	{
        priorVal = val;
        val = val + 2;
        return val;
    }
	@Override
    public void reset()
	{
        val = start;
        priorVal = start - 2;
    }
    @Override
    public void setStart(int x)
	{
        start = x;
        val = x;
        priorVal = x - 2;
    }
   //Return the previous value. This method is not defined by Series
    int getPriorValue()
	{
        return priorVal;
    }
}

public class InterfaceDemo2
{
    public static void main(String[] args)
	{
        ByTwos ob = new ByTwos();
        
        for(int i = 0; i < 5; i++)
		{
            System.out.print("Next value is " + ob.getNext());
            System.out.println(" Previous value is " + ob.getPriorValue());
        }
    }
}