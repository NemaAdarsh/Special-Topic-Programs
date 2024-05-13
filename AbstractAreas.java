abstract class Figure  //for abstract class we cannot create an object, abstract classes cannot be instantiated.
{
    double dim1;
    double dim2;
    Figure(double a, double b)
	{
        dim1 = a;
        dim2 = b;
    }
    //abstract public double findArea();
    abstract double findArea();
	void display()
	{
		System.out.println("Inside Display");
	}
}

class Rectangle extends Figure 
{
    Rectangle(double a, double b)
	{
        super(a, b);
    }
    
    double findArea() 
	{
        System.out.println("Inside Rectangle Area");
        return dim1 * dim2;
    }
}

class Triangle extends Figure
{
	Triangle(double a, double b)
	{
        super(a, b);
    }
    
    double findArea()
	{
        System.out.println("Inside Triangle Area");
        return dim1 * dim2 * 0.5;
    }
}

public class AbstractAreas
{
    // Figure f=new Figure();        //Error: Figure is abstract, cannot be instantiated
    public static void main(String[] args)
	{
        //Figure figRef=new Figure();
        Figure figRef;
        Rectangle r = new Rectangle(2, 3);
        figRef = r;
        System.out.println("Area= " + figRef.findArea());
		figRef.display();
        Triangle t = new Triangle(2, 3);
        figRef = t;
        System.out.println("Area= " + figRef.findArea());
		figRef.display();
    }
}