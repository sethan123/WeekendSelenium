package scrollbar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		//typecasting
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(3000);
		j.executeScript("window.scrollBy(0,-5000)");
		j.executeScript("window.scrollBy(5000,0)");
		Thread.sleep(3000);
		j.executeScript("window.scrollBy(-5000,0)");
		

	}

}
