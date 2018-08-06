
public class MultTable
{
	
	public static void main(String [] args)
	{
		//initialize array
		int array[][];
		//specify array size
	    array = new int[10][10];
	    System.out.println("=========================================================");
	    
	    //requires 2 for loops, since array is multi-dimentional
		for (int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				//assign current value to j * i eg. 1 * 1 = 1
				array[i][j] = j * i;
				//print value out eg. | 1 |
				System.out.print("| " + array[i][j] + " ");
				
			}
			//print new line in between rows
			System.out.println("\n");
			
			
		}
		//ending
		System.out.println("=========================================================");
	}
		
}
