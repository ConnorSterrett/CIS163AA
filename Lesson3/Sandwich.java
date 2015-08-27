/*
/Name: Connor Sterrett
/Date: 8/07/15
/Class: CIS163AA
/Section: 14269
/MEID: CON2060412
/
/Class that represents a Sandwich, with fields and methods
*/
import java.text.NumberFormat;

public class Sandwich
{
	//-----------------------------------Data Fields-------------------------------------------
	private String ingredient;
	private String bread;
	private String info;
	private double price;
	NumberFormat currFormat = NumberFormat.getCurrencyInstance(); //Used to format the price
	//-----------------------------------------------------------------------------------------
	
	//-----------------------------------Constructor------------==-----------------------------
	public Sandwich()
	{
		ingredient = "Turkey";
		bread = "Rye";
		price = 5.99;
	}
	//-----------------------------------------------------------------------------------------
	
	//---------------------------------Mutator Methods-----------------------------------------
	public void setIngredient(String ing)
	{
		ingredient = ing;
	}
	
	public void setBread(String brd)
	{
		bread = brd;
	}
	
	public void setPrice(double pri)
	{
		price = pri;
	}
	//-----------------------------------------------------------------------------------------
	
	//---------------------------------Accessor Methods-----------------------------------------
	public String getIngredient()
	{
		return ingredient;
	}
	
	public String getBread()
	{
		return bread;
	}
	
	public double getPrice()
	{
		return price;
	}
	//-----------------------------------------------------------------------------------------
	
	//----------------------------------Display Method-----------------------------------------
	public String displaySandwichInfo()
	{
		info = "This sandwich's main ingredient is " + ingredient.toLowerCase() + ".\n";
		info += "It will be served on " + bread.toLowerCase() + " bread.";
		info += "\nThe price is " + currFormat.format(price) + ". I hope you enjoy it!";
		return info;
	}
	//-----------------------------------------------------------------------------------------
}