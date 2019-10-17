package Selenium;

public class GetCssValue {

	public static void main(String[] args) {
		
		  String bgColor = td_Home.getCssValue("background-color");
		    System.out.println("Before hover: " + bgColor);        
		    
		    bgColor = td_Home.getCssValue("background-color");
		    System.out.println("After hover: " + bgColor);
	}

}
