package codes;
import java.util.Scanner;

public class Utilities 
{
	public static int errorTrap (int min, int max)
	{
		Scanner input = new Scanner(System.in); // Create scanner
		
		boolean inputSucess; // Boolean for error trap
		int number = 0;
	
		do
		{
			inputSucess = true; //Reset the boolean to assume the user isn't an idiot and will enter the correct data
		
			//Scanner input = new Scanner(System.in);
				
			try
			{
				number = input.nextInt();
			}
				
			catch (Exception e) //If an error occurs in the try statement, catch all exceptions
			{
				input.nextLine(); //Clear the stream of the user entered data
				inputSucess = false; //Set 'inputSucess' to false so the program will loop back to the prompt
			}
				
			if (number < min || number > max || inputSucess == false) //Test if the data is in the correct rang
			{
				System.out.println("Nope! Invalid data, try agin."); //Informs stupid user that they entered the wrong data
			}
				
		}while (number < min || number > max || inputSucess == false); //Loop back to the prompt if data is incorrect
		
		return number;
	}
	
	public static double errorTrap (double min, double max)
	{
		Scanner input = new Scanner(System.in); // Create scanner
		
		boolean inputSucess; // Boolean for error trap
		double number = 0;
	
		do
		{
			inputSucess = true; //Reset the boolean to assume the user isn't an idiot and will enter the correct data
				
			try
			{
				number = input.nextDouble();
			}
				
			catch (Exception e) //If an error occurs in the try statement, catch all exceptions
			{
				input.nextLine(); //Clear the stream of the user entered data
				inputSucess = false; //Set 'inputSucess' to false so the program will loop back to the prompt
			}
				
			if (number < min || number > max || inputSucess == false) //Test if the data is in the correct rang
			{
				System.out.println("Nope! Invalid data, try agin."); //Informs stupid user that they entered the wrong data
			}
				
		}while (number < min || number > max || inputSucess == false); //Loop back to the prompt if data is incorrect
		
		return number;
	}
	
	public static int randomNumberGenerator (int min, int max)
	{
		int number = (int) (Math.random() * (max - min + 1) + min); //Create random number
		return number;
	}
	
	public static int digitAt(int number, int n) //n = digit of number
	{
		int x = 1;
		
		for (int a = 0; a < (n - 1); a++) //Repeat the process one less time than n because it will be repeated when the value is returned
		{
			x = 1; 
			
			while(number / x > 10)  //Finds the largest multiple of 10 that can be divided by the number
				x = x * 10;
			
			number = number - ((number/x) * x); //Takes the first digit off the number
		}
		
		return (number/(x/10)); //returns the first digit after n-1 digits are removed from the beginning
	}
}
