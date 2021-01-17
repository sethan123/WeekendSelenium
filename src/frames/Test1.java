package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	driver.findElement(By.xpath("//a[text()='login']")).click();
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	WebElement ele1 = driver.findElement(By.id("close-pop"));
	driver.switchTo().frame(ele1);
	ele.click();
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	driver.findElement(By.name("keyword")).sendKeys("phone");

	}

}
