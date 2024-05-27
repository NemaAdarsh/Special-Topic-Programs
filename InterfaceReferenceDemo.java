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
    int priorVal;

    public int getNext()
	{
        priorVal = val;
        val = val + 2;
        return val;
    }

	public void reset()
	{
        val = start;
        priorVal = start - 2;
    }

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

class ByThrees implements Series
{
    int start, val;
  
    public int getNext()
	{
        val = val + 3;
        return val;
    }
   
    public void reset()
	{
        val = start;
    }

    public void setStart(int x)
	{
        start = x;
        val = x;
    }
}

public class InterfaceReferenceDemo
{
    public static void main(String[] args)
	{
        // Series s = new Series();    //Error: Series is abstract; cannot be instantiated
        Series s;           //Series reference variable
        ByTwos ob1 = new ByTwos();
        s = ob1;
        for (int i = 0; i < 3; i++)
		{
            System.out.println("Next ByTwo value is " + s.getNext());
			System.out.println("Previous value is " + ob1.getPriorValue());  //OK
			//System.out.println("Previous value is " + s.getPriorValue());  //Error
        }
        System.out.println();
        s = new ByThrees();
        for (int i = 0; i < 3; i++)
		{
            System.out.println("Next ByThree value is "+ s.getNext());
        }   
    }
}