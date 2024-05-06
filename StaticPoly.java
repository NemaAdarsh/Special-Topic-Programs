class Calculator{
    public int add(int a,int b)
    {
        System.out.println("Two variable version");
        return a+b;
    }

    public int add(int a, int b,int c)
    {
        System.out.println("Three variable version");
        return a+b+c;
    }
}

public class StaticPoly{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("5 + 10 = " + calculator.add(5,10));
        System.out.println("2 + 3 + 4 = " + calculator.add(2,3,4));
    }
}