package Selenium;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BrokenLinks {
	@FindBy (tagName="a") List<WebElement> elmImg;
	String strUrl;

	public BrokenLinks testLogin() throws MalformedURLException, IOException {
		
		for (WebElement url:elmImg)
		{
			System.out.println(url.getAttribute("href"));
			if(url.getAttribute("href")!=null && ! url.getAttribute("href").contains("javascript"))
			{
				strUrl=url.getAttribute("href");
				HttpURLConnection   connection = (HttpURLConnection)(new URL(strUrl).openConnection());
				connection.connect();
				String response=connection.getResponseMessage();
					if(response.equals("Found") || response.equals("Moved Permanently"))
						{
							System.out.println("Got the response as a Found/ Moved Permanently");
						}
					else {
						assertEquals("Found / Move Permanently", response);
					}				
				connection.disconnect();
//				System.out.println(strUrl+" ---> "+response);
				
				System.out.print(strUrl+"\033[0;1m" + response);

			}
			
		}
		return this;
		
	}

}
