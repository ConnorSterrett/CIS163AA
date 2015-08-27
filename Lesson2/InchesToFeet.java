/*
/Name: Connor Sterrett
/Date: 8/02/15
/Class: CIS163AA
/Converts a pre-set variable "inches" to feet and inches
*/

public class InchesToFeet
{
	public static void main(String[] args)
	{
		//------------------------------------Declarations-----------------------------------------
		//Int that represents the number of inches to be converted into feet & inches
		int inches = 133;
		int resultNumOfFt, resultRemainingInches;
		//Constant int that stores the number of inches in a foot
		final int INCHES_IN_FT = 12; 
		//-----------------------------------------------------------------------------------------
		
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
