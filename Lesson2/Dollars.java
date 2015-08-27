/*
/Name: Connor Sterrett
/Date: 8/02/15
/Class: CIS163AA
/Takes number of dollars as input from the user and converts it into
/20s, 10s, 5s, and 1s
*/
import javax.swing.JOptionPane; //used for display and input dialog boxes
public class Dollars
{
	public static void main(String[] args)
	{
		//-----------------------------------Declarations------------------------------------------
		String stringInput;
		int dollarsToConvert, numOf20s, numOf10s, numOf5s, numOf1s;
		//-----------------------------------------------------------------------------------------
		
		//Uses JOptionPane to get input for the number of dollars to convert from user
		stringInput = JOptionPane.showInputDialog(null,
			"How much money would you like to convert?" + "\n" +
			"(Whole dollars only -- output in whole bill denominations)");
		//Converts stringInput into an integer amount
		dollarsToConvert = Integer.parseInt(stringInput);
		//Finds number of 20s
		numOf20s = dollarsToConvert / 20;
		//Finds number of 10s
		numOf10s = (dollarsToConvert % 20) / 10;
		//Finds number of 5s
		numOf5s = ((dollarsToConvert % 20) % 10) / 5;
		//Finds number of 1s
		numOf1s = (((dollarsToConvert % 20) % 10) % 5) / 1;
		
		//Shows denominations to user
		JOptionPane.showMessageDialog(null,
		"Amount to Convert: $" + dollarsToConvert + "\n" +
		"------------------------------------------" + "\n" +
		"Number of $20 Bills: " + numOf20s + "\n" + 
		"Number of $10 Bills: " + numOf10s + "\n" + 
		"Number of $5 Bills: " + numOf5s + "\n" + 
		"Number of $1 Bills: " + numOf1s + "\n"
		);
	}
}