public class OperatorsDemoL
{
    public static void main(String[] args)
	{
        // Logical Operators
        boolean logicalAnd = (true && false);
        boolean logicalOr = (true || false);
        boolean logicalNot = !true;

        // Bitwise Operators
        int bitwiseAnd = 5 & 3;
        int bitwiseOr = 5 | 3;
        int bitwiseXor = 5 ^ 3;

        // Assignment Operators
        int x = 10;
        x += 5; // Equivalent to x = x + 5

		// Displaying Logical, Bitwise, and Assignment Operator Output
        System.out.println("\nLogical, Bitwise, and Assignment Operators Output:");
        System.out.println("Logical AND: " + logicalAnd); //false
        System.out.println("Logical OR: " + logicalOr); //true
        System.out.println("Logical NOT: " + logicalNot); //false
        System.out.println("Bitwise AND: " + bitwiseAnd); //1
        System.out.println("Bitwise OR: " + bitwiseOr); //7
        System.out.println("Bitwise XOR: " + bitwiseXor); //6
        System.out.println("Assignment Operator (x += 5): " + x); //15
	}
}