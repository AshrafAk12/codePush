package Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\WebDriver\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\nathe\\eclipse-workspace\\SeleniumProject\\src\\PropertiesFiles\\config.properties"));
		WebDriver driver = new ChromeDriver();
		
		String Flipkart = prop.getProperty("FLIPKART");
		driver.get(Flipkart);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement w = driver.findElement(By.xpath("//div[@class ='xtXmba' and contains(text(),'Electronics')]"));
		Thread.sleep(2000);  						
		Actions ac= new Actions(driver);
		ac.moveToElement(w).build().perform();
		WebElement e = driver.findElement(By.xpath("//a[contains (@class,'_6WOcW9')][position()=2]"));
		ac.moveToElement(e).build().perform();
		WebElement d= driver.findElement(By.xpath("(//a[contains(@class ,'_6WOcW9')])[position()=16]"));
		d.click();
		
		
	
	}
}
