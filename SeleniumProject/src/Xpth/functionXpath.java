package Xpth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class functionXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("amazon");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[position()=1]")).click();
		driver.findElement(By.xpath(" //h3[contains(text(),'Amazon.in')]")).click();
	}
}
