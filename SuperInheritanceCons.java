class P
{
    public P()
    {
        System.out.println("P constructor called");
    }
}

class M extends P
{
    public M() //first constructor is invoked thats why p cons is called and the above line is displayed first
    {
        System.out.println("M constructor called");
    }
}

public class SuperInheritanceCons
{
    public static void main(String[] args) {
        M om = new M();

    }
}