package Interface;

public class AnotherTimeService implements ITimeService {

		
		@Override
		 public void printTime(int hour, int minute, int seconds) {
		  System.out.println("Time =] " + hour + "-" + minute + "-" + seconds);
		 }

		 @Override
		 public void printDate(int day, int month, int year) {
		  System.out.println("Date =] " + day + "-" + month + "-" + year);
		 }
		 
		 @Override
		 public void printDateTime(int hour, int minute, int seconds, int day, int month, int year) {
		  System.out.println("DateTime =] " + day + "-"  + month + "-"  + year + " "
		                + hour + "-" + minute + "-" + seconds);
		 }

		

	}


