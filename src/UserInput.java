// Import Scanner function from Java.util
import java.util.Scanner;




public class UserInput
{
	// Create class variable that is the scanner
	// static means that only classes can use this variable
	// 1st scanner declares type
	// name of variable is userInput
	// make a new scanner object
	// System.in stands for the keyboard input
	
	// new Scanner(input method)
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		// Prompt user with message
		System.out.println("Type in an integer:");
		
		// If the input is an integer, do the code below
		if (userInput.hasNextLong())
		{
			// set number to the integer typed in
			
			long num = userInput.nextLong();
			
			// print the number out
			System.out.println("You entered " + num);
			
			
		
		// else if the input is not a number
		} else {
			System.out.println("Type in an integer next time");
		}
	}
}