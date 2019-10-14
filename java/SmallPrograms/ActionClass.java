package SmallPrograms;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {
	@Test
private void psvm() {
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Browser\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");     
  WebElement textBox=driver.findElement(By.className("gLFyf gsfi"));
  textBox.sendKeys("Hi hello");
    driver.close();
	// TODO Auto-generated method stub

}
}
