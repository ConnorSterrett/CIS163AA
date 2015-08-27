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

public class BirdSighting
	{
	//------------------------------------Data fields------------------------------------------
	private GregorianCalendar dateOfBirdSighting;
	private String species;
	private int numOfBirdsSeen;
	private int dayOfYear;
	//-----------------------------------------------------------------------------------------
	
	//----------------------------------Constructors-------------------------------------------
	//Default constructor
	public BirdSighting()
	{
		species = "robin";
		numOfBirdsSeen = 1;
		dateOfBirdSighting = new GregorianCalendar(2015, 0, 1);
		dayOfYear = dateOfBirdSighting.get(GregorianCalendar.DAY_OF_YEAR);
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