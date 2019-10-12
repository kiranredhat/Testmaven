package SmallPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobotClass {
	String s;
@Test (enabled=false)
	public static void main1(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
//		dr.get("http://leadsrow.ytel.com/vicidial/admin.php?ADD=999999&stage=TIME");
		dr.get("http://leadsrow.ytel.com/vicidial/admin.php?ADD=999999&stage=TIME");
		 Robot robot = new Robot(); 
		 Thread.sleep(5000); 
		
		// Join Key with Selenium
		 sendKeys(Keys.CONTROL + "a");
		 
		// Join Key with Selenium
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_Z);
		 robot.keyRelease(KeyEvent.VK_Z);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 
			// Join Key with Action Class

	}

}
