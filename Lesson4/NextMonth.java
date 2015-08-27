/*
/Name: Connor Sterrett
/Date: 8/18/15
/Class: CIS163AA
/Section: 14269
/MEID: CON2060412
/
/Class that calculates the number of days left to the next month
*/

import javax.swing.JOptionPane; //used for output dialog
import java.util.*; //used for GregorianCalendar

public class NextMonth
{
	public static void main(String [] args)
	{
		//------------------------------------Declarations-----------------------------------------
		int dayOfMonth;
		int dayOfYear;
		int lastDayOfMonth;
		int daysToNextMonth;
		int currMonth;
		int currYear;
		int daysLeftInYear;
		int daysToJune21st;
		int nextYear;
		//-----------------------------------------------------------------------------------------
		
		//Creates an object representing today
		GregorianCalendar today = new GregorianCalendar();
		//Finds current year
		currYear = today.get(GregorianCalendar.YEAR);
		//Creates an object representing June 21st of the following year
		//The current year is found with the today object, and one year is added
		GregorianCalendar juneNextYear = new GregorianCalendar(currYear + 1, 5, 21);
		//Finds the current month
		dayOfMonth = today.get(GregorianCalendar.DAY_OF_MONTH);
		//Finds final day of the month
		lastDayOfMonth = today.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
		
		//Number of days to the the first of the next month
		//1 added to go to the first day of the next month
		daysToNextMonth = lastDayOfMonth - dayOfMonth + 1;
		//Finds the current day of the year
		dayOfYear = today.get(GregorianCalendar.DAY_OF_YEAR);
		
		//Finds month index starts at 0
		currMonth = today.get(GregorianCalendar.MONTH);
		//Finds next year
		nextYear = juneNextYear.get(GregorianCalendar.YEAR);
		//Uses the day of the year of June 21st as the number of days from Jan1-Jun21
		daysToJune21st = juneNextYear.get(GregorianCalendar.DAY_OF_YEAR);
		
		JOptionPane.showMessageDialog(null, 
			"The last day of this month is: " + lastDayOfMonth + ".\n" +
			"From the current day, " + dayOfMonth + ", there are " +
			daysToNextMonth + " days to the first of the next month.");
			
		//If today’s date is beyond June 21 calculates the remaining days
		//left in the year, plus the time from January 1 to June 21 of the next year.
		if ((currMonth == 5 && dayOfMonth > 21) || (currMonth > 5))
		{
			daysLeftInYear = today.getActualMaximum(GregorianCalendar.DAY_OF_YEAR) -
				dayOfYear;
			JOptionPane.showMessageDialog(null,
			"Since it is past June 21st, the remaining days left in " 
			+ currYear + " is: " + daysLeftInYear + ".\n" +
			"The number of days from January 1st to June 21st " +
			nextYear + " is: " + daysToJune21st + ".\n" +
			"Therefore, the number of days from today to June 21st " +
			nextYear + " next year is " + (daysLeftInYear + daysToJune21st) + ".");
		}
	}
}