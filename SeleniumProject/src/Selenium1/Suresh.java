package Selenium1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suresh {
 
	public static void main(String[] args) throws InterruptedException {
		
		System .setProperty("webdriver.chrome.driver", "D:\\WebDriver\\Driver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.in/");

		driver.switchTo().newWindow(WindowType.TAB);
		
		Thread.sleep(3000);  
		driver.navigate().to("https://www.google.in/");	
		Set<String>handles = driver.getWindowHandles(); // set - slow process. 
//		List<String> s = new ArrayList<>(handles);
//		String ParentWindowId = s.get(0);
//		String ChildWindowId = s.get(1);
//		
//		System.out.println("Parent Window Id is " + ParentWindowId);
//		System.out.println("Child Window Id is " + ChildWindowId);
//		
//		Thread.sleep(3000);
//		driver.switchTo().window(ParentWindowId);
		ArrayList<String> tabs = new ArrayList<>(handles);
		driver.switchTo().window(tabs.get(0));
		
		
	}
}
