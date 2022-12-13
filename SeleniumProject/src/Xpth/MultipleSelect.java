package Xpth;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nathe\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\nathe\\eclipse-workspace\\SeleniumProject\\src\\PropertiesFiles\\config.properties"));
		WebDriver driver = new ChromeDriver();
		String letcode = prop.getProperty("LetCode");
		driver.get(letcode);
		WebElement e= driver.findElement(By.xpath("//select[contains(@id,'fruits')]"));
	Select s1 = new Select(e);
	List<WebElement> fruits=s1.getOptions();
	for(int i=0;i<fruits.size();i++) {
		s1.selectByIndex(i);
		Thread.sleep(2000);
		System.out.println(fruits);
	}
		WebElement e1= driver.findElement(By.xpath("//select[contains(@id,'superheros')]"));
		Select s2= new Select(e1);
		List<WebElement> superheros=s2.getOptions();
		for(int i=0;i<superheros.size();i++) {
			s2.selectByIndex(i);
			
		}
		WebElement e2= driver.findElement(By.xpath("//select[contains(@id,'lang')]"));
		Select s3= new Select(e2);
		List<WebElement> lang= s3.getOptions();
		for(int i=0;i<=lang.size();i++) {
			s3.selectByIndex(i);
			Thread.sleep(2000);
		}
		Thread.sleep(3000);
		
		WebElement e3= driver.findElement(By.xpath("//select[contains(@id,'country')]"));
		Select s4= new Select(e3);
		List<WebElement>country=s4.getOptions();
//		Thread.sleep(5000);
		for(int i=0;i<=country.size();i++) {
			s4.selectByIndex(i);
		}
	
		
}
}
