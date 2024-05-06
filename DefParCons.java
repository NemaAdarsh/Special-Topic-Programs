class A
{
    public A()
    {
        System.out.println("A constructor (default) called");
    }

    public A(String type)
    {
        System.out.println("A constructor (parameterized) called");
    }
}

class B extends A
{
    public B()
    {
        System.out.println("B constructor called");
    }
}

public class DefParCons
{
    public static void main(String[] args) {
        B ob = new B();
        //B obb = new B("adarsh"); will give error so we cannot take string parameter
    }
}