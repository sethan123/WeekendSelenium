package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc1 {
	public WebDriver driver;
	@BeforeMethod
	public void openapp() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}
	@Test
	public void login() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String t = driver.getTitle();
		Reporter.log(t,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}

}
