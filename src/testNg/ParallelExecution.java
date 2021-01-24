package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	public WebDriver driver;
	@BeforeSuite
	public void openapp() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	}
	
	@Parameters({"browserName"})
	@Test
	public void test(String browser) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String t = driver.getTitle();
		Reporter.log(t,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
	}
	@AfterMethod
	public void closeapp() {
		driver.close();
	}

}
