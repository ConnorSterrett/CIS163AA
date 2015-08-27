/*
/Name: Connor Sterrett
/Date: 8/18/15
/Class: CIS163AA
/Section: 14269
/MEID: CON2060412
/
/Class that contains data fields for a Bird Sighting expedition
*/

import javax.swing.JOptionPane; //used for input & output dialog boxes
import java.util.*; //used for the GregorianCalendar

public class BirdSighting2
	{
	//------------------------------------Data fields------------------------------------------
	private GregorianCalendar dateOfBirdSighting;
	private String species;
	private int numOfBirdsSeen;
	private int dayOfYear;
	//-----------------------------------------------------------------------------------------
	
	//----------------------------------Constructors-------------------------------------------
	//Constructor with all fields filled, will be used by other constructors with this()
	public BirdSighting2(String spec, int numBirds, int year, int month, int dayOfMonth)
	{
		species = spec;
		numOfBirdsSeen = numBirds;
		//Instantiates the Gregorian Calendar as of the date in the parameter
		//Used for Day of Year. Note that month is 0 based (Jan = 0)
		dateOfBirdSighting = new GregorianCalendar(year, month, dayOfMonth);
		dayOfYear = dateOfBirdSighting.get(GregorianCalendar.DAY_OF_YEAR);
	}
	//Constructor for single parameter -- species
	public BirdSighting2(String spec)
	{
		this(spec, 1, 2015, 0, 1);
	}
	//Default constructor
	public BirdSighting2()
	{
		this("robin", 1, 2015, 0, 1);
	}
	//-----------------------------------------------------------------------------------------
	
	//---------------------------------Mutator Methods-----------------------------------------
	public void setSpecies(String spec)
	{
		species = spec;
	}
	
	public void setNumOfBirdsSeen(int num)
	{
		numOfBirdsSeen = num;
	}
	
	//Overloaded mutator method, use of method w/ no arguments prompts user for input
	public void setDayOfYear()
	{
		//local variables used to determine day of year
		String str1, str2, str3;
		int year, month, dayOfMonth;
		
		//Prompts user for values, and converts those values to integer
		//Year
		str1 = JOptionPane.showInputDialog(null,
			"What year was the bird sighting?");
		year = Integer.parseInt(str1);
		
		//Month
		str2 = JOptionPane.showInputDialog(null,
			"What was the number of the month of the bird sighting? " +
			"(e.g. January = 1, February = 2, etc.)");
		//1 subtracted for use in Gregorian Calendar constructor (months 0 based)
		month = Integer.parseInt(str2) - 1;
		
		//Day of Month
		str3 = JOptionPane.showInputDialog(null,
			"What day of the month was the bird sighting?");
		dayOfMonth = Integer.parseInt(str3);
		
		//Uses obtained values to get create calendar object
		dateOfBirdSighting = new GregorianCalendar(year, month, dayOfMonth);
		//gets the day of year from the created calendar object
		dayOfYear = dateOfBirdSighting.get(GregorianCalendar.DAY_OF_YEAR);
	}
	
	//Mutator method with day of year in year, month, day of month format
	public void setDayOfYear(int year, int month, int dayOfMonth)
	{
		//Uses parameter to get create calendar object
		dateOfBirdSighting = new GregorianCalendar(year, month, dayOfMonth);
		//gets the day of year from the created calendar object
		dayOfYear = dateOfBirdSighting.get(GregorianCalendar.DAY_OF_YEAR);
	}
	
	//Mutator method with given day of year
	public void setDayOfYear(int dOY)
	{
		dayOfYear = dOY;
	}
	
	
	//-----------------------------------------------------------------------------------------
	
	//---------------------------------Accessor Methods-----------------------------------------
	public String getSpecies()
	{
		return species;
	}
	
	public int getNumOfBirdsSeen()
	{
		return numOfBirdsSeen;
	}
	
	public int getDayOfYear()
	{
		return dayOfYear;
	}
	//---------------------------------------------------------------------------------------------
	
	//----------------------------------Display Method-----------------------------------------
	public String displayBirdSightingInfo()
	{
		String info;
		info = "The species that was spotted was a " + species.toLowerCase() + ".\n";
		info += "There were " + numOfBirdsSeen + " " + species.toLowerCase() + "s seen.\n";
		info += "The day of the year of the bird sighting was " + dayOfYear + ".";
		return info;
	}
	//-----------------------------------------------------------------------------------------
}