package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo {
	@FindBy(id="username")
	private WebElement usernametb;
	
	
	Demo(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void user(String us) {
		usernametb.sendKeys(us);
	}

}
