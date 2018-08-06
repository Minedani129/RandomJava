/*
 * This program gets info from the user and prints it out from the screen.
 * This would've been much simpler if I haven't used classes, but I just learned it so I 
 * decided to use one.
 * This program uses the scanner class.
 */


// Imports class needed to receive user input
import java.util.Scanner;

// Here I create the class
public class InfoSheet
{
	
	// Create Scanner object
	static Scanner userInput = new Scanner(System.in);
	
	
	//declare fields
	private int age = 0;
	private String Name = "Daniel";
	
	
	// Constructor Method. Initializes variables.
	public InfoSheet(int ageIn, String NameIn) {
		this.age = ageIn;
		this.Name = NameIn;
		
	}
	
	
	// Return functions to get values.
	public int getAge()
	{
		return age;
	}
	
	public String getFName()
	{
		return Name;
	}
	

	
	//Main function
	public static void main(String[] args)
	{
		//Prompt user for input
		System.out.println("Type in an age: ");
		int ageIn = userInput.nextInt();
		System.out.println("Type in name:");
		String NameIn = userInput.next();
	
		// Initialize object in InfoSheet.
		InfoSheet person = new InfoSheet(ageIn, NameIn);
		
		
		//Print out variables in a nice message.
		System.out.println("Hello, " + person.getFName() + ", " + "you are " + person.getAge() + " years old."); 
	}
	
			
}