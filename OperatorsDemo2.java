public class OperatorsDemo2
{
    public static void main(String[] args)
	{
        // Arithmetic Operators
        int a = 10, b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        // Relational Operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean greaterThan = (a > b);
        boolean lessThan = (a < b);
		
		// Displaying Arithmetic and Relational Operator Output
        System.out.println("Arithmetic and Relational Operators Output:");
        System.out.println("Sum: " + sum); //15
        System.out.println("Difference: " + difference); //5
        System.out.println("Product: " + product); //50
        System.out.println("Quotient: " + quotient); //3
        System.out.println("Remainder: " + remainder); //0
        System.out.println("Is Equal: " + isEqual); //false
        System.out.println("Is Not Equal: " + isNotEqual); //true
        System.out.println("Greater Than: " + greaterThan); //true
        System.out.println("Less Than: " + lessThan); //false
	}
}