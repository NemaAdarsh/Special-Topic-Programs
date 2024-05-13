public class FinalVariableExample
{
    // Declaring a final variable
    final int MAX_VALUE = 100;

    public void modifyFinalVariable()
	{
        // Attempting to change the value of a final variable will result in a compilation error
        //MAX_VALUE = 200; // Uncommenting this line will result in an error
    }

    public void displayFinalVariable()
	{
        System.out.println("Max Value: " + MAX_VALUE);
    }

    public static void main(String[] args)
	{
        FinalVariableExample obj = new FinalVariableExample();

        // Calling methods to demonstrate the use of final variable
        obj.modifyFinalVariable(); // This method call will result in a compilation error
        obj.displayFinalVariable(); // This will display the value of the final variable
    }
}