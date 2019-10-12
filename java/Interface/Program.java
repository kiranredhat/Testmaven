package Interface;

public class Program {

	public static void main(String[] args) {
//Object One
		ITimeService timeService = new TimeService();
		  timeService.printTime(12, 30, 10);
		  timeService.printDate(10, 10, 2017);
		  timeService.printDateTime(12, 30, 10, 10, 10, 2017);
	System.out.println("------------------------------------------------------");
//Object Two
	ITimeService anothertimeService = new AnotherTimeService();
	anothertimeService.printTime(12, 30, 10);
	anothertimeService.printDate(10, 10, 2017);
	anothertimeService.printDateTime(12, 30, 10, 10, 10, 2017);

	System.out.println("------------------------------------------------------");

//Object Three
	ITimeService.printDateTimestatic(12, 30, 10, 10, 10, 2017);
}

}
