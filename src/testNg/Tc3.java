package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc3 {
	public WebDriver driver;
	@BeforeMethod
	public void openActi() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}
	@Test
	public void clcikactiinc() {
		driver.findElement(By.linkText("actiTIME Inc.")).click();
	}
	
	@AfterMethod
	public void closeActi() {
		driver.close();
	}

}
