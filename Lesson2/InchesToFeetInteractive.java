/*
/Name: Connor Sterrett
/Date: 8/02/15
/Class: CIS163AA
/Modifies the InchesToFeet class to take the number of inches from the user
/Converts the inches to Feet & Inches
*/
import java.util.Scanner; //used to obtain value from user for inches
public class InchesToFeetInteractive
{
	public static void main(String[] args)
	{
		//----------------------------Declarations----------------------------------
		Scanner input = new Scanner(System.in); //Creates scanner object for input
		int inches, resultNumOfFt, resultRemainingInches;
		//Constant int that stores the number of inches in a foot
		final int INCHES_IN_FT = 12; 
		//--------------------------------------------------------------------------
		
		//Prompts user for the number of inches
		System.out.print("Please enter the number of inches to be converted >> ");
		//Uses Scanner to retrieve number of inches from user
		inches = input.nextInt();
		//Uses integer division to find number of whole feet in inches
		resultNumOfFt = inches / INCHES_IN_FT;
		//Uses remainder operator to find the number of inches remaining
		resultRemainingInches = inches % INCHES_IN_FT;
		
		//Displays result to console
		//Prints to console the inches being used to convert
		System.out.println("Inches to be converted to Feet & Inches: " + inches);
		System.out.println();
		System.out.println("Number of Feet: " + resultNumOfFt);
		System.out.println("Number of Inches: " + resultRemainingInches);
	}
}
