package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());		 
		
		System.out.println(driver.getPageSource());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		Thread.sleep(3000);  
		driver.navigate().to("https://www.google.in/"); 
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
}
}
