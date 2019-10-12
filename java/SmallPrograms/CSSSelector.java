package SmallPrograms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CSSSelector {
@FindBy (css="input[id='username'][class='form-control']") WebElement elmUsername;// Findby Attribute
@FindBy (css="input#username") WebElement elmUsername1;// Findby id
@FindBy (css="input.form-control") WebElement elmUsername2; // FindBy Class
@FindBy (css="input[id*=name]") WebElement elmUsername3; //FindBy contains
//@FindBy (css="input[contains(Log Out)]" WebElement elmUsername6; //FindBy contains

@FindBy (css="input[id^='user']") WebElement elmUsername4;//FindBy Startswith
@FindBy (css="input[id$='name']") WebElement elmUsername5;//FindBy Endsswith

//XPATH: //input[@id='username']/following-sibling::input[1]
//CSS: #username + input
//
//CSS: a:contains('Log Out')






}
