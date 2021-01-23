package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample {
	@FindBy(id="username")
	private WebElement usernametb;
	
	@FindBy(name="pwd")
	private WebElement passwordtb;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	
	Sample(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void userName(String us) {
		usernametb.sendKeys(us);
	}
	
	public void pass(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	
	public void login() {
		loginbtn.click();	
	}

}
