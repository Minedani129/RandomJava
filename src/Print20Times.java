/*
 * This program gets a message from the user and prints it 20 times
 * This program uses the Scanner class
 * This program demonstrates the use of a for loop
 * 
 * The program receives input from the user, then, the if statement checks if it is a string.
 * If yes, the input is stored in the variable MSG
 * The for loop prints MSG twenty times.
 *
 */

import java.util.Scanner;


public class Print20Times
{
	static Scanner userInput = new Scanner(System.in);
	
	
	public static void main(String[] args)
	{
		String msg = "N/A";
		
		System.out.println("Type in a message: ");
		
		if (userInput.hasNextLine())
		{
			msg = userInput.nextLine();
		}
		else
		{
			System.out.println("Type in words next time");
		}
		
		
		for (int i = 0; i < 20; i++)
		{
			System.out.println(msg);
		}
	}
}