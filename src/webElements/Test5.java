package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.id("username"));
		if(ele.isDisplayed()) {
			System.out.println("Pass:Element is dispalyed");
			ele.sendKeys("admin");
		}
		else
		{
			System.out.println("Fail:element is not dispalyed");
		}
		WebElement btn = driver.findElement(By.xpath("//div[text()='Login ']"));
		if(btn.isEnabled()) {
			System.out.println("Pass:element is enabled");
		}
		else
		{
			System.out.println("Fail:element is not enabled");
		}
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		if(checkbox.isSelected()) {
			System.out.println("pass:elemeent is selected");
			
		}
		else
		{
			System.out.println("fail:element is not selected");
		}
		driver.close();

	}

}
