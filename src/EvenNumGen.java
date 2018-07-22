/*
 * This program finds even numbers up to a number specified by the user.
 * This program uses the Scanner class
 * This program uses a while loop to iterate through numbers
 * 
 * This program first receives the input from the user (The max value)
 * then it checks if the input is an integer. If it is, it assigns the value to the variable MAX
 * The while loop iterates through 1 --> MAX.
 * Inside the while loop is an if statement that checks if the number is even. ((i%2) == 0)
 */


import java.util.Scanner;


public class EvenNumGen
{
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Up to how much: ");
		int i = 1;
		int max = 0;
		if (userInput.hasNextInt())
		{
			 max = userInput.nextInt();
		}
		else
		{
			System.out.println("Type in a number next time");
		}
		
		while (i <= max)
		{
			if ((i%2) == 0)
			{
				System.out.println(i);
				i++;
			} else
			{
				i++;
				continue;
				
			}
		}
	}
}
