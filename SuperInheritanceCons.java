class P
{
    public P()
    {
        System.out.println("P constructor called");
    }
}

class M extends P
{
    public M()
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