package Xpth;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\Driver\\chromedriver_win32\\chromedriver.exe");
			Properties prop = new Properties();
			prop.load(new FileInputStream("C:\\Users\\nathe\\eclipse-workspace\\SeleniumProject\\src\\PropertiesFiles\\config.properties"));
			WebDriver driver = new ChromeDriver();
			String letcode = prop.getProperty("LetCode");
			driver.get(letcode);
			WebElement e= driver.findElement(By.xpath("//select[contains(@id,'fruits')]"));
			Select sl=new Select(e); //			sl.selectByValue("2");  //			sl.selectByIndex(1);
			sl.selectByValue("1");
		
			Thread.sleep(2000);
			WebElement sel=driver.findElement(By.xpath("//select[contains(@id,'superheros')]"));
			Select sl1=new Select(sel);
			sl1.selectByVisibleText("Thor");
			Thread.sleep(2000);
		
			WebElement lang = driver.findElement(By.xpath("//select[contains(@id,'lang')]"));
			Select se2=new Select(lang);
			se2.selectByIndex(0);
			Thread.sleep(2000);
		
			WebElement country = driver.findElement(By.xpath("//select[contains(@id,'country')]"));
			Select se3=new Select(country);
			se3.selectByValue("India");
		}
}
