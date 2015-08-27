/*
/Name: Connor Sterrett
/Date: 8/18/15
/Class: CIS163AA
/Section: 14269
/MEID: CON2060412
/
/Class that demonstrates the Circle class methods and fields
*/

import javax.swing.JOptionPane; //used for output dialog

public class TestCircle
{
	public static void main(String [] args)
	{
		//Instantiates three circles with different fields
		Circle circleSmall = new Circle();
		Circle circleLarge = new Circle();
		Circle circleDefault = new Circle();
		
		circleSmall.setRadius(0.05);
		circleLarge.setRadius(340);
		
		JOptionPane.showMessageDialog(null,
			"Small circle: \n" +
			"------------------------------------------------------------------------\n" +
			circleSmall.displayCircleInfo() + "\n" +
			"------------------------------------------------------------------------\n" +
			"Large circle: \n" +
			"------------------------------------------------------------------------\n" +
			circleLarge.displayCircleInfo() + "\n" +
			"------------------------------------------------------------------------\n" +
			"Default circle: \n" +
			"------------------------------------------------------------------------\n" +
			circleDefault.displayCircleInfo() );
	}
}