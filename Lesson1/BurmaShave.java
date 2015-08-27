/*
/Name: Connor Sterrett
/Date: 7/30/15
/Class: CIS163AA
/This class uses dialog boxes to display a series
/of statements used in a Burma Shave ad in 1936 "Shaving Brush"
*/

import javax.swing.JOptionPane;  //used for dialog boxes
public class BurmaShave
{
	public static void main(String[] args)
	{
		//creates one dialog box at a time with Burma Shave jingle
		//found at http://www.burma-shave.org/jingles/1936/shaving_brush
		JOptionPane.showMessageDialog(null, "Shaving Brush");
		JOptionPane.showMessageDialog(null, "And soapy smear");
		JOptionPane.showMessageDialog(null, "Went out of");
		JOptionPane.showMessageDialog(null, "Style with");
		JOptionPane.showMessageDialog(null, "Hoops my dear");
	}
}