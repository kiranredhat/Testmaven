package Selenium;

import static org.testng.Assert.expectThrows;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ActionClass {
	@Test
private void psvm() {
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Browser\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	WebDriverWait wt=new WebDriverWait(driver,20);
	driver.get("https://www.google.co.in/?gfe_rd=cr&ei=Kw8ZVJymI8LV8geA84CgBQ&gws_rd=ssl");   
	  WebElement elmtextBox=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	  
	  WebElement elmImg=driver.findElement(By.xpath("//input[@class='RNmpXc']"));

  wt.until(ExpectedConditions.visibilityOf(elmtextBox));
//  wt.until(ExpectedConditions.visibilityOf(elmImg));

//  textBox.sendKeys("Hi hello");
  Actions action=new Actions(driver);
//  Action 1
  System.out.println("----------------------------------------------------------------------------------------------");
  System.out.println("Action 1");
  action.moveToElement(elmtextBox).
  click().
  sendKeys("Hi Kiran").
//  moveToElement(elmImg).
//  click(elmImg).
  build().perform();
  
//  Action 2
  System.out.println("----------------------------------------------------------------------------------------------");
  System.out.println("Action 2");
  action.moveToElement(elmtextBox).
keyDown(Keys.SHIFT).//Press Shift Key
sendKeys("Kiran").
keyUp(Keys.SHIFT).
sendKeys("kiran").
sendKeys(Keys.RETURN).
build().perform();

  
//Action 3
System.out.println("----------------------------------------------------------------------------------------------");
System.out.println("Action 3");
action.sendKeys(Keys.END).
sendKeys(Keys.HOME).
build().perform();
  
//Action 4
System.out.println("----------------------------------------------------------------------------------------------");
System.out.println("Action 4");
action.keyDown(Keys.CONTROL).
sendKeys("t").build().perform();


//    driver.close();
	// TODO Auto-generated method stub

}
}
