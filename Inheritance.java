class A{
    void methodA()
    {
        System.out.println("Class A method");
    }
}

class B extends A{
    void methodB()
    {
        System.out.println("Class B method");
    }
}

class C extends B{
    void methodC()
    {
        System.out.println("Class C method");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        C obc = new C();
        obc.methodA();
        obc.methodB();
        obc.methodC();
        
        B obb = new B();
        obb.methodA();
        obb.methodB();
        //obb.methodC(); we will get error because class b cannot invoke anything from class b

    }
}



