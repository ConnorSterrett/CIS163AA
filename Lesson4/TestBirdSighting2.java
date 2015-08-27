/*
/Name: Connor Sterrett
/Date: 8/18/15
/Class: CIS163AA
/Section: 14269
/MEID: CON2060412
/
/Class that demonstrates the BirdSighting2 class's data fields and methods
*/

import javax.swing.JOptionPane; //used for output dialog

public class TestBirdSighting2
{
	public static void main(String [] args)
	{
		//Instantiates object with default constructor
		BirdSighting2 birdSighting2 = new BirdSighting2();
		
		//Demonstrates default construction
		JOptionPane.showMessageDialog(null,
			"With the default constructor, the data fields are set " +
			"as follows:\n" +
			birdSighting2.displayBirdSightingInfo());
		
		//Demonstrates basic mutator methods
		JOptionPane.showMessageDialog(null, 
			"The multi-parameter constructor will be demonstrated: \n" +
			"------------------------------------------------------------------------\n" +
			"Species is being set to Bluejay.\n" +
			"Number of birds sighted is being set to 23.\n" +
			"Day of the year is being set to 44.");
		//Sets species to Bluejay
		birdSighting2.setSpecies("Bluejay");
		//Sets number of birds sighted to 23
		birdSighting2.setNumOfBirdsSeen(23);
		//Sets day of year to 44
		birdSighting2.setDayOfYear(44);
		
		//Displays output
		JOptionPane.showMessageDialog(null, birdSighting2.displayBirdSightingInfo());
		
		//Demonstrates accessor methods
		JOptionPane.showMessageDialog(null, 
			"The accessor methods will now be demonstrated.\n" +
			"------------------------------------------------------------------------\n" +
			"Species: " + birdSighting2.getSpecies() + "\n" +
			"Number of Birds Seen: " + birdSighting2.getNumOfBirdsSeen() + "\n" +
			"Day of Year: " + birdSighting2.getDayOfYear() + "\n");
		
		//Demonstrates overloaded user input setDayOfYear mutator method
		JOptionPane.showMessageDialog(null,
			"The overloaded setDayOfYear mutator method will now be demonstrated.\n" +
			"The species and number of birds will remain the same, " +
			"only the day of the year will be modified. \n\n" +
			"You will be prompted for input.  Press \"OK\" to continue.");
		
		birdSighting2.setDayOfYear(); //uses no parameter mutator method
		//Uses BirdSighting2 class's display method
		JOptionPane.showMessageDialog(null, birdSighting2.displayBirdSightingInfo());
	}
}