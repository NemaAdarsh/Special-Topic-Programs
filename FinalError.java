class a
{
    final void m1()
    {
        System.out.println("This is a final method");
    }
}

class b extends a
{
    void m1()
    {
        System.out.println("Illegal");
    }
}

public class FinalError{
    public static void main(String[] args) {
        b obj = new b();
        obj.m1();


    }

}