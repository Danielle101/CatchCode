package catchCode;
//this validates the user input so you dont have to write any try catch statements
import java.util.InputMismatchException;
import java.util.Scanner;

public class Validation {

		static Scanner s = new Scanner (System.in);


		public static void main(String[] args) {
			System.out.println("Enter a number:");
			try
			{
				int x = getValidNumberInRange(0,1000);
				int y = getValidNumberInRange(1,0000);
				int res = x/y;
				System.out.println(res);
			}
			
			catch (ArithmeticException e)
			{
				System.out.println("You cannot have y as zero"); 
			}
			catch (Exception e){
			{
				System.out.println("General error! Contact admin!"); 
			}}
			}
			
		
	public static int readValidInteger()

	{
		while (true){
			try
			{System.out.println("Enter an integer:");
				int input = s.nextInt();
				s.nextLine();
				return input;
				
			}
			catch (InputMismatchException e)
			{
				System.out.println("You cannot have input as a String");
				s.nextLine();
			}
			catch (ArithmeticException e)
			{
				System.out.println("You cannot have y as zero");
				s.nextLine();
			}
			catch (Exception e)
			{
				System.out.println("General error! Contact admin!"); 
				s.nextLine();
			}
			///A Piece of code shared between try and catches like "s.nextLine();" you can add a line of code
			//like "
			// finally {
			//
			// s.nextLine();
		    //}
		}
	}
	public static int readValidIntegerNoExp()
{
	while (true){
		if (s.hasNextInt())
			break;
		s.nextLine();
	}
	int x = s.nextInt();
	s.nextLine();
		return x;
	
}
//input must be within this range. this is a range validator
public static int getValidNumberInRange (int min, int max)
{
	int input = s.nextInt();
	while (input <1 || input > 1000)
	{
		System.out.println("Please put a number within range!");
		input = s.nextInt();
		s.nextLine();
	}
	
	return input;
	}
		
}



		


