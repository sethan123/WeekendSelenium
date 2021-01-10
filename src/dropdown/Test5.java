package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
		WebElement ele = driver.findElement(By.id("Mayas"));
          Select s=new Select(ele);
          s.selectByIndex(1);
          
         List<WebElement> options = s.getOptions();
         ArrayList a=new ArrayList<>();
         
         for(WebElement b:options) {
        	 String text = b.getText();
        	 System.out.println(text);
        	 a.add(text);
        	 }
         
         System.out.println("before sorting");
         System.out.println("**********************");
         Collections.sort(a);
         for(Object q:a)
         {
        	 System.out.println(q);
         }
         driver.close();
          
	}
	

}
