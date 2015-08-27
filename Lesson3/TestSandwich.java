/*
/Name: Connor Sterrett
/Date: 8/07/15
/Class: CIS163AA
/Section: 14269
/MEID: CON2060412
/
/Class that tests the Sandwich class
*/

public class TestSandwich
{
	public static void main(String[] args)
	{
		//-----------------------------------------------------------------------------------------
		//Sandwich Example 1
		//-----------------------------------------------------------------------------------------
		// Demonstrates the creation of a custom sandwich object
		System.out.println("\nCustom Sandwich");
		//Creates a new Sandwich object (default constructor)
		Sandwich pbjSandwich = new Sandwich();
		
		//Uses mutator methods to modify the default data fields
		pbjSandwich.setIngredient("Peanut Butter & Jelly");
		pbjSandwich.setBread("White");
		pbjSandwich.setPrice(0.50);
		
		//Uses the Sandwich class's display method to print display to console
		System.out.println(pbjSandwich.displaySandwichInfo());
		
		//-----------------------------------------------------------------------------------------
		//Sandwich Example 2
		//-----------------------------------------------------------------------------------------
		// Demonstrates the default constructor of the sandwich object
		Sandwich defaultSandwich = new Sandwich();
		System.out.println("\nDefault Sandwich");
		System.out.println(defaultSandwich.displaySandwichInfo());
	}
}