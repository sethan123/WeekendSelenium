package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_query_top"))).sendKeys("dress");
		//driver.findElement(By.id("search_query_top")).sendKeys("dress");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.xpath("(//img[@alt='Printed Summer Dress'])[1]")).click();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		driver.findElement(By.name("Blue")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add to cart']"))).click();
		//driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
	}

}
