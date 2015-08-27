/*
/Name: Connor Sterrett
/Date: 8/21/15
/Class: CIS163AA
/Section: 14269
/MEID: CON2060412
/
/Class that holds the value of a condominium, as well
/as a main method that tests the class
*/

import javax.swing.JOptionPane; //used for input & output dialog
import java.text.NumberFormat; //used to format currency

public class CondoSales
{
	//main method that tests the CondoSales object
	public static void main(String[] args)
	{
		CondoSales userCondo = new CondoSales();
		//displays information about the user's new condo
		JOptionPane.showMessageDialog(null,
			userCondo.toString());
	}
	
	//------------------------------------Data fields------------------------------------------
	private boolean hasGranite;
	private boolean hasGarage;
	private int view;
	private long total;
	//-----------------------------------------------------------------------------------------
	
	//----------------------------------Constructors-------------------------------------------
	//Default constructor
	public CondoSales()
	{
		askGranite();
		askView();
		if !(view == -1) //if the view selection is not invalid (valid)
			askGarage();
		
		switch(view)
		{
			case -1:
				total += 0;
				break;
			case 1:
				total += 150000;
				break;
			case 2:
				total += 170000;
				break;
			case 3:
				total += 210000;
				break;
			default:
				//This should never execute, since the view should
				//already have been checked in the askView method
				JOptionPane.showMessageDialog(null,
					"An error has occurred.");
		}
		
		if(hasGranite)
			total += 4000;
		
		if(hasGarage)
			total += 5000;
	}
	//-----------------------------------------------------------------------------------------
	
	//------------------------------------Methods----------------------------------------------
	public void askGranite() //sets value of hasGranite
	{
		String userInput;
		int convUserInput; //local variable
		boolean isCorrectInput;
		//primes iSCorrectInput
		isCorrectInput = false;
		do {
			userInput = JOptionPane.showInputDialog(null,
				"Would you like granite counter tops?\n" +
				"Type 0 for \'No\', and 1 for \'Yes\'.");
			convUserInput = Integer.parseInt(userInput);
			switch(convUserInput)
			{
				case 0:
					hasGranite = false; //modifies class field
					isCorrectInput = true;
					break;
				case 1:
					hasGranite = true; //modifies class field
					isCorrectInput = true;
					break;
				default:
					JOptionPane.showMessageDialog(null,
						"Invalid response, please type 0 or 1.");
			}
		}
		//continues prompting user until the input is correct
		while (!(isCorrectInput)); 
	}
	
	public void askView() //sets value of the view the user wants
	{
		String userInput;
		int convUserInput;
		userInput = JOptionPane.showInputDialog(null,
			"What type of view would you like for your condo?\n" +
			"Type 1 for a view of a park. \n" +
			"Type 2 for a view of a golf course. \n" +
			"Type 3 for a view of a lake. \n");
		convUserInput = Integer.parseInt(userInput);
		switch(convUserInput)
		{
			case 1:
				view = 1; //modifies class field
				break;
			case 2:
				view = 2; //modifies class field
				break;
			case 3:
				view = 3; //modifies class field
				break;
			default:
				//per the instructions in the book, the price will
				//be set to zero if an invalid view is selected
				view = -1;
				JOptionPane.showMessageDialog(null,
					"A correct view was not selected.");
		}
	}
	
	public void askView() //sets value of the view the user wants
	{
		String userInput;
		int convUserInput;
		userInput = JOptionPane.showInputDialog(null,
			"Would you like a garage? Or is a parking space sufficient?\n" +
			"Type 1 for a view of a park. \n" +
			"Type 2 for a view of a golf course. \n" +
			"Type 3 for a view of a lake. \n");
		convUserInput = Integer.parseInt(userInput);
		switch(convUserInput)
		{
			case 1:
				view = 1; //modifies class field
				break;
			case 2:
				view = 2; //modifies class field
				break;
			case 3:
				view = 3; //modifies class field
				break;
			default:
				//per the instructions in the book, the price will
				//be set to zero if an invalid view is selected
				view = -1;
				JOptionPane.showMessageDialog(null,
					"A correct view was not selected.");
		}
	}
	
	//Display method
	public String toString()
	{
		//uses NumberFormat class to get format for local currency
		NumberFormat currFormat = NumberFormat.getCurrencyInstance();
		String result;
		result = "This condo has ";
		switch(view)
		{
			case 1:
				result += "a park view.\n";
				break;
			case 2:
				result += "a golf course view.\n";
				break;
			case 3:
				result += "a lake view.\n";
				break;
			default:
				result += "no view yet.\n";
		}
		result += "The condo ";
		if (hasGranite)
			result += "does have ";
		else
			result += "does not have ";
		result += "granite counter tops.\n";
		result += "The total price is: " +
			currFormat.format(total);
		result += "\nWe hope you enjoy your new home!";
		
		return result;
	}
	//-----------------------------------------------------------------------------------------
} 