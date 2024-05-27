//One interface can extend another interface
interface A
{
    void method1();
    void method2();
}

//B inherits method1() and method2() of A - it adds method3()
interface B extends A
{
    void method3();
}

//This class must implement all of A and B
class MyClass implements B
{
    public void method1()
	{
        System.out.println("Implementation of method1()");
    }
   
    public void method2()
	{
        System.out.println("Implementation of method2()");
    }
  
    public void method3()
	{
        System.out.println("Implementation of method3()");
    }
}

public class InterExtend
{
    public static void main(String[] args)
	{
        MyClass ob = new MyClass();
        ob.method1();
        ob.method2();
        ob.method3();
    }
}