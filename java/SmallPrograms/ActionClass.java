package SmallPrograms;

import javax.swing.Action;

import org.openqa.selenium.interactions.Actions;

public class ActionClass {
private void psvm() {
    Actions builder = new Actions(driver);
    Action mouseOverHome = builder
            .moveToElement(link_Home)
            .build();
     
    String bgColor = td_Home.getCssValue("background-color");
    System.out.println("Before hover: " + bgColor);        
    mouseOverHome.perform();        
    bgColor = td_Home.getCssValue("background-color");
    System.out.println("After hover: " + bgColor);
    driver.close();
	// TODO Auto-generated method stub

}
}
