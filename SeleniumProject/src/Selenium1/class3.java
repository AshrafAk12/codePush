package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\WebDriver\\Driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Amazon"+ Keys.ENTER);
		
		driver.findElement(By.className("LC20lb")).click();
			
		WebElement e= driver.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("Iphone 14 pro max");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
}
