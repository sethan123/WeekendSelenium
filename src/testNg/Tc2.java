package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc2 {
	public WebDriver driver;
	@BeforeMethod
	public void openapp() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}
	@Test
	public void link() {
		driver.findElement(By.linkText("Forgot your password?")).click();
		String t = driver.getTitle();
		Reporter.log(t,true);
		String u = driver.getCurrentUrl();
		Reporter.log(u,true);
	}
	
	@AfterMethod
	public void closeapp() {
		driver.close();
	}
	

}
