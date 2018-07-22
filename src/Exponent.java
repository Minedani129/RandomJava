/*
 * This program receives an integer/long from the user and squares it
 * This program uses the Scanner class
 */


import java.util.Scanner;


public class Exponent
{
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		System.out.println("Type in a number: ");
		
		if (userInput.hasNextLong())
		{
			// store input in variable
			long num = userInput.nextLong();
			
			//prints the number squared Using the Exp method created below
			System.out.println(num + " Squared = " + Exp(num));
		}
		else
		{
			System.out.println("Type in a number next time");
		}
	}
	
	public static long Exp(long num)
	{
		//return num squared
		return num * num;
	}
}
