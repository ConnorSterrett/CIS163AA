/*
/Name: Connor Sterrett
/Date: 8/18/15
/Class: CIS163AA
/Section: 14269
/MEID: CON2060412
/
/Class that represents a circle, with data fields and methods
*/


public class Circle
	{
	//------------------------------------Data fields------------------------------------------
	private double radius;
	private double diameter;
	private double area;
	//-----------------------------------------------------------------------------------------
	
	//----------------------------------Constructors-------------------------------------------
	//Default constructor
	public Circle()
	{
		radius = 1;
		diameter = radius * 2;
		area = java.lang.Math.PI * radius * radius;  //uses Math class's PI constant
	}
	
	//Constructor that takes the radius as an argument
	public Circle(double rad)
	{
		radius = rad;
		diameter = rad * 2;
		area = java.lang.Math.PI * rad * rad;
	}
	//-----------------------------------------------------------------------------------------
	
	//---------------------------------Mutator Methods-----------------------------------------
	public void setRadius(double rad)
	{
		radius = rad;
		//Also sets diameter and area based on radius argument
		diameter = rad * 2;
		area = java.lang.Math.PI * rad * rad;
	}
	//-----------------------------------------------------------------------------------------
	
	//---------------------------------Accessor Methods-----------------------------------------
	public double getRadius()
	{
		return radius;
	}
	
	public double getDiameter()
	{
		return diameter;
	}
	
	public double getArea()
	{
		return area;
	}
	//---------------------------------------------------------------------------------------------
	
	//----------------------------------Display Method-----------------------------------------
	public String displayCircleInfo()
	{
		String info;
		info = "The circle has a radius of " + radius + "\n";
		info += "The diameter is " + diameter + "\n";
		info += "The area of the circle is " + area;
		return info;
	}
	//-----------------------------------------------------------------------------------------
}