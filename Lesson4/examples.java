//Example 1 -- More code
public class Student
{
	private int stuNum;
	private double gpa;
	
	Student(int num, double avg)
	{
		stuNum = num;
		gpa = avg;
	}
	Student(double avg)
	{
		stuNum = 999;
		gpa = avg;
	}
	Student(int num)
	{
		stuNum = num;
		gpa = 0.0;
	}
	Student()
	{
		stuNum = 999;
		gpa = 0.0;
	}
}
//Example 2 -- Utilizes this reference to reduce code and errors
public class Student
{
	private int stuNum;
	private double gpa;
	
	Student(int num, double avg)
	{
		stuNum = num;
		gpa = avg;
	}
	Student(double avg)
	{
		this(999, avg) //999 used as default val
	}
	Student(int num)
	{
		this(num, 0.0)
	}
	Student()
	{
		this(999, 0.0)
	}
}