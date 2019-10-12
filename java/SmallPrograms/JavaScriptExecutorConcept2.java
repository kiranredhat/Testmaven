package SmallPrograms;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorConcept2 {
@Test (priority=1)
	public static void main() {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Browser\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver(); //launch chrome
		driver.manage().window().maximize(); //maximize window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login"); //enter URL
		
		driver.findElement(By.name("txtUsername")).sendKeys("naveenk");
		driver.findElement(By.name("txtPassword")).sendKeys("test@1234");
		WebElement loginBtn =driver.findElement(By.name("Submit"));
		  JavascriptExecutor js = (JavascriptExecutor)WebDriverFactory.getdr();	
		    js.executeScript("arguments[0].click();", elmSubmit);

			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			js.executeScript("arguments[0].scrollIntoView(true);", elmSubmit);

			js.executeScript("history.go(0)");

			js.executeScript("arguments[0].style.border='3px solid red'", elmSubmit);


			String title = js.executeScript("return document.title;").toString();
			System.out.println(title);

		    js.executeScript("arguments[0].style.backgroundColor = 'rgb(0,200,0)'",  elmSubmit);

		    try {
		        Thread.sleep(20);
		    }  catch (InterruptedException e) {
		    }

//			String pageText = js.executeScript("return document.documentElement.innerText;").toString();
//			System.out.println(pageText);

		    js.executeScript("alert('Welcome to Guru99');");  
			driver.switchTo().alert().accept();

		    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("C:\\Users\\User\\eclipse-workspace\\YtelCotactCenter\\src\\test\\java\\com\\ycc\\test\\element.png"));

	}



}
