/*
/Name: Connor Sterrett
/Date: 8/02/15
/Class: CIS163AA
/Takes input from the user on their dog's weight and number of days
/to be boarded, and calculates the cost of boarding at Happy Yappy Kennel
*/
import javax.swing.JOptionPane; //used for display and input dialog boxes
import java.text.NumberFormat; //used to format currency
public class DogBoarding
{
	public static void main(String[] args)
	{
		//-----------------------------------Declarations------------------------------------------
		String stringInput;
		int dogWeight, numOfDays;
		//Doubles are used since memory usage is not as important as accuracy for this application
		double costOfStay;
		//Uses NumberFormat class to format doubles into currency
		NumberFormat currFormat = NumberFormat.getCurrencyInstance();
		//Sets constant for lb/day boarding
		final double LB_PER_DAY_COST = 0.50;
		//-----------------------------------------------------------------------------------------
		
		//Takes input from user on the weight of their dog
		stringInput = JOptionPane.showInputDialog(null,
			"What is the weight of your dog in pounds?");
		//Converts the string input into an integer
		dogWeight = Integer.parseInt(stringInput);
		//Takes input from user on the number of days the dog will stay
		stringInput = JOptionPane.showInputDialog(null,
			"How many days will your dog stay at Happy Yappy Kennel?");
		//Converts the string input into an integer
		numOfDays = Integer.parseInt(stringInput);
		
		//Calculates the cost for the dog to stay
		costOfStay = LB_PER_DAY_COST * dogWeight * numOfDays;
		
		//Prints the cost of the dog's stay to a dialog box
		JOptionPane.showMessageDialog(null, 
			"Dog Weight: " + dogWeight + " pounds" + "\n" +
			"Length of Stay: " + numOfDays + " days" + "\n" +
			"Cost (Pound/Day): " + currFormat.format(LB_PER_DAY_COST) + "\n" + 
			"-----------------------------------" + "\n" +
			"Price of Stay: " + currFormat.format(costOfStay));
	}
}