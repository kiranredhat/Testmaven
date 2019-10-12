package Interface;

public interface ITimeService {
	void printTime(int hour, int minute, int seconds);
	 void printDate(int day, int month, int year);
	 
	
	default void printDateTime(int hour, int minute, int seconds, int day, int month, int year)
	 {
		  System.out.println("DateTime =] " + day + "/"  + month + "/"  + year + " "
		                              + hour + ":" + minute + ":" + seconds);
	 }
	
	static void printDateTimestatic(int hour, int minute, int seconds, int day, int month, int year)
	 {
		  System.out.println("DateTime =] " + day + "/"  + month + "/"  + year + " "
		                              + hour + ":" + minute + ":" + seconds);
	 }	
}
