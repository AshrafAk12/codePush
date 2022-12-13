package Xpth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativeXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("amazon");
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]")).click();
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])")).click();
		WebElement w= driver.findElement(By.xpath("//input[@id=\'twotabsearchtextbox\']"));
		w.sendKeys("iphone 14");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		
		Thread.sleep(2000);

//		Relative Xpath:
//
//
//            //tagname[@attribute=’value’]
//
//Relative: //input[@name='q'

		
	}
	
}
