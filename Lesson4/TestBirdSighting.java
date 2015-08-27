/*
/Name: Connor Sterrett
/Date: 8/18/15
/Class: CIS163AA
/Section: 14269
/MEID: CON2060412
/
/Class that demonstrates the BirdSighting class methods and fields
*/

import javax.swing.JOptionPane; //used for output dialog

public class TestBirdSighting
{
	public static void main(String [] args)
	{
		//Instantiates object with default constructor
		BirdSighting birdSighting = new BirdSighting();
		
		//Uses accessor methods to display data fields
		JOptionPane.showMessageDialog(null,
			"The accessor methods will now be demonstrated.\n" +
			"------------------------------------------------------------------------\n" +
			"Species: " + birdSighting.getSpecies() + "\n" +
			"Number of Birds Seen: " + birdSighting.getNumOfBirdsSeen() + "\n" +
			"Day of Year: " + birdSighting.getDayOfYear() + "\n");
		
		//Uses display method in BirdSighting class to show data fields
		JOptionPane.showMessageDialog(null, 
			"The display method will now be demonstrated.\n" +
			"------------------------------------------------------------------------\n" +
			birdSighting.displayBirdSightingInfo());
			
		//Uses mutator fields to change the data fields
		birdSighting.setSpecies("Cardinal");
		birdSighting.setNumOfBirdsSeen(12);
		birdSighting.setDayOfYear(88);
		
		//Displays the changed birdSighting object
		JOptionPane.showMessageDialog(null,
			"The mutator methods will now be demonstrated.\n" +
			"------------------------------------------------------------------------\n" +
			"Species has been changed to Cardinal.\n" +
			"Number of Birds Seen has been changed to 12. \n" +
			"Day of Year has been changed to 88. \n" +
			"------------------------------------------------------------------------\n" +
			"Display Method: \n" +
			"------------------------------------------------------------------------\n" +
			birdSighting.displayBirdSightingInfo());
			
	}
}