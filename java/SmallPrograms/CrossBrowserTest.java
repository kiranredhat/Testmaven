package SmallPrograms;

import org.testng.annotations.Test;

public class CrossBrowserTest extends CrossBrowserScript {
	@Test
	public void testParameterWithXML() {
//		driver.get("http://demo.guru99.com/V4/");
//		//Find user name
//		WebElement userName = driver.findElement(By.name("uid"));
//		//Fill user name
//		userName.sendKeys("guru99");
//		//Find password
//		WebElement password = driver.findElement(By.name("password"));
//		//Fill password
//		password.sendKeys("guru99");
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.google.com");
		driver.quit();
	}
}
