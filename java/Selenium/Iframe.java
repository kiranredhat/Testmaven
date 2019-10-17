package Selenium;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Iframe {
@Test
public static void main ()
{
	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Browser\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	

	dr.switchTo().frame("frame1");	
	WebElement textBox= dr.findElement(By.xpath("//input[@type='text']"));
	textBox.sendKeys("kiran");
	
	dr.switchTo().frame("frame3");
	WebElement checkBox = dr.findElement(By.xpath("//input[@id='a']"));
	checkBox.click();
	dr.switchTo().parentFrame();
	WebElement textBox1= dr.findElement(By.xpath("//input[@type='text']"));
	textBox1.sendKeys("kiranNew");
	
	dr.switchTo().defaultContent();

	dr.switchTo().frame("frame2");
	WebElement DropDown = dr.findElement(By.xpath("//select[@class='col-lg-3']"));
	Select select = new Select(DropDown);
	select.selectByIndex(2);
	
	dr.quit();
//	dr.switchTo().frame("frame3");
//	WebElement checkBox1 = dr.findElement(By.xpath("//input[@id='a']"));
//	checkBox1.click();
//	dr.switchTo().parentFrame();
	
	
	
}

}
