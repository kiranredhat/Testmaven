package Interface;

public class TimeService implements ITimeService{

	public void printTime(int hour, int minute, int seconds) 
	{
		  System.out.println("Time =] " + hour + ":" + minute + ":" + seconds);
	 }

	public void printDate(int day, int month, int year)
	{
		 System.out.println("Date =] " + day + "/" + month + "/" + year);
	}


}
