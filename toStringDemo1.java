class Box
{
    int width;
    int height;
    int depth;
}

public class toStringDemo1
{
    public static void main(String[] args)
	{
        Box obj = new Box();
        System.out.println(obj);
		System.out.println(obj.hashCode()); //whenever an object is created a unique id is assigned
		System.out.println(obj.getClass());
    }
}