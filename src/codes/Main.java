package codes;

public class Main 
{
	public static void main(String[] args) 
	{
		int min = 0;
		int max = 10;
		
		double min2 = 0.0;
		double max2 = 10.0;
	
		int input = Utilities.errorTrap(min, max);
		System.out.println(input);
		double input2 = Utilities.errorTrap(min2, max2);
		System.out.println(input2);
		
		System.out.println(Utilities.digitAt(12345,2));
	}
	

}
