package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//WebElement ele = driver.findElement(By.id("username"));
         Demo d=new Demo(driver);
		
		driver.navigate().refresh();
		
        // ele.sendKeys("admin");
		d.user("admin");
	}

}
