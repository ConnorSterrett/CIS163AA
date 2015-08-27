/*
/Name: Connor Sterrett
/Date: 8/07/15
/Class: CIS163AA
/Section: 14269
/MEID: CON2060412
/
/Class that obtains the price of gas / barrel from the user
/in the main method, and calls a method to display the price at the pump.
*/

import javax.swing.JOptionPane; //used for input & output GUI
import java.text.NumberFormat; //used to format prices in local currency
public class GasPrices
{
	public static void main(String [] args)
	{
		//-----------------------------------Declarations------------------------------------------
		String userInput;
		double pricePerBarrel;
		//-----------------------------------------------------------------------------------------
		
		//Uses GUI dialog box to determine the price of gas / barrel from the user
		userInput = JOptionPane.showInputDialog(null, "What is the price of gas per barrel?");
		//Uses Double class to convert the User's string into a double
		pricePerBarrel = Double.parseDouble(userInput);
		
		//Calls the displayGasPriceRange function to display output to user
		displayGasPriceRange(pricePerBarrel);
	}
	
	//This method uses the price of a barrel of gas to determine
	//the range of prices that are seen at a gas station
	public static void displayGasPriceRange(double pricePerBarrel)
	{
		//-----------------------------------Declarations------------------------------------------
		//At $100, the lower end of the price range was $3.50 (3.5%)
		//At $120, the lower end of the price range was $4.20 (3.5%)
		final double LOWER_BOUND_RATE = 0.035;
		//At $100, the upper end of the price range was $4.00 (4.0%)
		//At $120, the upper end of the price range was $4.80 (4.0%)
		final double UPPER_BOUND_RATE = 0.040;
		//The lower end of the range
		double lboundPriceAtPump;
		//The upper end of the range
		double uboundPriceAtPump;
		//Uses NumberFormat class to format doubles into currency
		NumberFormat currFormat = NumberFormat.getCurrencyInstance();
		//-----------------------------------------------------------------------------------------
		
		//Determines lower and upper prices
		lboundPriceAtPump = pricePerBarrel * LOWER_BOUND_RATE;
		uboundPriceAtPump = pricePerBarrel * UPPER_BOUND_RATE;
		
		//Displays the price at the pump to the user
		//Prints the cost of the dog's stay to a dialog box
		JOptionPane.showMessageDialog(null, 
			"With the given price per barrel of gas of " + currFormat.format(pricePerBarrel) 
			+ ", the price at the pump could range from " + 
			currFormat.format(lboundPriceAtPump) + " to " +
			currFormat.format(uboundPriceAtPump) + ".");
	}
}