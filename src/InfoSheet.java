import java.util.Scanner;

public class InfoSheet
{
	static Scanner userInput = new Scanner(System.in);
	
	private int age = 0;
	private String fName = "Daniel";
	
	
	public InfoSheet(int ageIn, String NameIn) {
		this.age = ageIn;
		this.fName = NameIn;
		
	}

	public int getAge()
	{
		return age;
	}
	
	public String getFName()
	{
		return fName;
	}
	

	

	public static void main(String[] args)
	{
		System.out.println("Type in an age: ");
		int ageIn = userInput.nextInt();
		System.out.println("Type in name:");
		String NameIn = userInput.next();
	
		
		InfoSheet person = new InfoSheet(ageIn, NameIn);
		
		System.out.println("Hello, " + person.getFName() + ", " + "you are " + person.getAge() + " years old."); 
	}
	
			
}