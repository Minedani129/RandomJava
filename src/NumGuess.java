import java.util.Scanner;

public class NumGuess
{
	static int checkGuess = 0;
	static int rand;
	static Scanner userInput = new Scanner(System.in);
	static int randomNum;
	static int guess;
	public static void main(String[] args)
	{
		int randomNum = randNum();
		while (checkGuess != -1)
		{
			System.out.println("Guess a number between 0 and 10: ");
			if (userInput.hasNextInt())
			{
				int guess = userInput.nextInt();
				checkGuess = checkGuess();
			}
			else
			{
				continue;
			}
		}
				
	}
	
	public static int randNum()
	{
		rand = (int) (Math.random() * 11);
		return rand;
	}
	
	public static int checkGuess()
	{
		if (guess == randomNum)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
}