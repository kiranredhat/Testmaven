package SmallPrograms;

import org.testng.annotations.Test;

public class GetSystemTime {

	@Test
	public void getSystemTime()
	{
		long millis=System. currentTimeMillis();
		System.out.println("Time in Millis: " +millis );
		java. util. Date date=new java. util. Date(millis);
		System. out. println("Date is: "+date);
	}
}
