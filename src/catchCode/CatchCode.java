package catchCode;

import java.util.*;


public class CatchCode {			
	static Scanner s = new Scanner (System.in);


	public static void main(String[] args) {
		try
		{
			int x = readValidInteger();
			int y = readValidInteger();
			int res = x/y;
			System.out.println(res);
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("You cannot have y as zero"); 
		}
		catch (Exception e)
		{
			System.out.println("General error! Contact admin!"); 
		}
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
}

	


