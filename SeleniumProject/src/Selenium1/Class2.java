package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\WebDriver\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
//		driver.findElement(By.name("q")).sendKeys("Google"+ Keys.ENTER);
		driver.findElement(By.name("q"));//+Keys.ENTER);
		WebElement a= driver.findElement(By.name("q"));
		a.sendKeys("whatsapp"+ Keys.ENTER);
		
//		driver.findElement(By.name("btnK")).click();
		
		

	}
}
