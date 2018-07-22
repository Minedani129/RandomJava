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