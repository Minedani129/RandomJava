/*
 * This program finds a random number
 * This program uses an if statement and math.randon()
 * 
 * First, a variable is created and assigned to a random number between 0 and 100
 * It then prints out the number
 * Then, the if statement checks if the number is >, <, or ==, then it prints out the message.
 *
 */
 



public class RandomNum
{
	public static void main(String[] args) 
	{
		int randInt = (int) (Math.random() * 101);
		
		System.out.println("The random number is " + randInt);
		
		if (randInt < 50)
		{
			System.out.println("The number is less than 50");
		}
		else if (randInt > 50) {
			System.out.println("The number is bigger than 50");
		} else if (randInt == 50) {
		
			System.out.println("The number is equal to 50");
		} else {
			System.out.println("Nothing happened");
		}
	}
}
