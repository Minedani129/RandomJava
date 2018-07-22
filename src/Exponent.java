import java.util.Scanner;

public class Exponent
{
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Type in a number: ");
		if (userInput.hasNextInt())
		{
			int num = userInput.nextInt();
			System.out.println(num + " Squared = " + Exp(num));
		}
		else
		{
			System.out.println("Type in a number next time");
		}
	}
	
	public static int Exp(int a)
	{
		return a * a;
	}
}