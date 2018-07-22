/*
 * This code uses Scanner to receive input
 * The user types in a char (the grade)
 * It uses a switch statement to find what message to print
 * If it is not a,b,c,d, then it will default to "Needs immediate improvement"
 */

// Scanner class
import java.util.Scanner;


public class grade
{
	
	// Create scanner object
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		// Define variable
		String grades = null;
		
		// Prompts user with message
		System.out.println("What grade did you get: ");
		
		// Check if the input is a string/character
		if (userInput.hasNextLine())
		{
			// Set the variable to the input
			 grades = userInput.nextLine();
		}
		// Else prompt user with message
		else {
			System.out.println("Type in a grade next time");
		}
		
		// Switch statement to check if the grade is A,B,C,D in lower or upper case
		// Defaults to "Needs Immediate Improvement" if none of the cases are called
		
		switch(grades)
		{
		case "A":
		case "a":
			System.out.println("Great job");
			break;
		case "b":
		case "B":
			System.out.println("Good job");
			break;
		case "c":
		case "C":
			System.out.println("Satisfactory");
			break;
		case "d":
		case "D":
			System.out.println("Needs improvement");
			break;
		
		default:
			System.out.println("Needs immediate improvement");
		}
		
			
	}
}