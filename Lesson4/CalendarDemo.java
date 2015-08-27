import java.util.*;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		GregorianCalendar now = new GregorianCalendar();
		System.out.println("Year: " + now.get(Calendar.YEAR));
		System.out.println("Month: " + now.get(Calendar.MONTH));
		System.out.println("Week of Year: " + 
			now.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Week of Month: " + 
			now.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Date: " + now.get(Calendar.DATE));
		System.out.println("Day of Month: " + 
			now.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of Year: " +
			now.get(Calendar.DAY_OF_YEAR));
		System.out.println("Day of Week: " +
			now.get(Calendar.DAY_OF_WEEK));
		System.out.println("AM PM: " +
			now.get(Calendar.AM_PM));
		System.out.println("Hour: " +
			now.get(Calendar.HOUR));
		System.out.println("Hour of Day: " +
			now.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minute: " +
			now.get(Calendar.MINUTE));
		System.out.println("Second: " +
			now.get(Calendar.SECOND));
		System.out.println("Millisecond: " +
			now.get(Calendar.MILLISECOND));
	}
}