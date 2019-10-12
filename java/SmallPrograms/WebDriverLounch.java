package SmallPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WebDriverLounch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Browser\\chromedriver.exe");
System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Browser\\geckodriver.exe");

//WebDriver driver = new ChromeDriver();
//WebDriver driver1 = new FirefoxDriver();
ChromeDriver driver = new ChromeDriver();
FirefoxDriver driver1 = new FirefoxDriver();
Actions action = new Actions(driver);
action.click().build().perform();

	}

}
