/*
/Name: Connor Sterrett
/Date: 8/07/15
/Class: CIS163AA
/Section: 14269
/MEID: CON2060412
/
/Class that contains utilizes two different methods to obtain
/an initial investment from a user, and calculates the growth
*/

import javax.swing.JOptionPane; //used for input & output dialogs
import java.text.NumberFormat; //used to format money as local currency

public class Interest
{
	public static void main(String [] args)
	{
		//-----------------------------------Declarations------------------------------------------
		double principal;
		double amtAfterInvestment;
		//Uses NumberFormat class to format doubles into currency
		NumberFormat currFormat = NumberFormat.getCurrencyInstance();
		//-----------------------------------------------------------------------------------------
		
		//Calls determinePrincipal method to find the initial investment
		principal = determinePrincipal();
		//Calls calculateGrowth method to find the growth of the investment
		amtAfterInvestment = calculateGrowth(principal);
		
		//Prints the results to the dialog box
		JOptionPane.showMessageDialog(null, 
			"With an initial investment of " +
			currFormat.format(principal) + 
			" and a growth rate of 5% each year, you would have " 
			+ currFormat.format(amtAfterInvestment) + 
			" at the end of the year. \n" + 
			"That's a growth of " + currFormat.format(amtAfterInvestment - principal) + "! " +
			"You should consider investing!");
	}
	
	//Uses JOptionDialog input boxes to find the initial investment by the user
	public static double determinePrincipal()
	{
		//-----------------------------------Declarations------------------------------------------
		String userInput;
		double principal;
		//-----------------------------------------------------------------------------------------
		
		userInput = JOptionPane.showInputDialog(null, "How much is your initial investment?");
		principal = Double.parseDouble(userInput);
		
		return principal;
	}
	
	//Calculates the growth of the initial principal
	public static double calculateGrowth(double principal)
	{
		//-----------------------------------Declarations------------------------------------------
		final double RETURN_ON_INVESTMENT = 0.05;
		double growth;
		//-----------------------------------------------------------------------------------------
		
		growth = principal * RETURN_ON_INVESTMENT;
		
		return (principal + growth);
	}
}