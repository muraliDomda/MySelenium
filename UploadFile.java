package guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {

	public static void main(String[] args) {
		
		
        String baseUrl = "http://demo.guru99.com/selenium/upload/";
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        	        
        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("D:\\Batch_NGVM01.xlsx");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
		
	}

}
