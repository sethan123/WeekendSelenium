package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
		WebElement ele = driver.findElement(By.id("Mayas"));
          Select s=new Select(ele);
          s.selectByIndex(1);
          Thread.sleep(3000);
          s.selectByValue("i");
          Thread.sleep(3000);
          s.selectByVisibleText("chicken 65");
          Thread.sleep(3000);
          s.deselectByIndex(1);
          Thread.sleep(3000);
          s.deselectByValue("i");
          Thread.sleep(3000);
          s.deselectByVisibleText("chicken 65");
          Thread.sleep(3000);
          driver.close();
          
	}

}
