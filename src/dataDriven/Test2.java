package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
FileInputStream f=new FileInputStream("./excel/Exceldata.xlsx");
Workbook wb = WorkbookFactory.create(f);
Cell r = wb.getSheet("Sheet1").getRow(1).getCell(1);
r.setCellValue("qwerty123");

FileOutputStream fis=new FileOutputStream("./excel/Exceldata.xlsx");
	wb.write(fis);
	fis.
	}

}
