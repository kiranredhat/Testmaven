package SmallPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {

// To take ScreenShot
//		
		WebDriver driver= new ChromeDriver();
	    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	FileUtils.copyFile(src, new File("C:\\Users\\User\\eclipse-workspace\\YtelCotactCenter\\src\\test\\java\\com\\ycc\\test\\element.png"));

	}

}
