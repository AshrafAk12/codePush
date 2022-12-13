package Xpth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		// ------------ Attribute Based Xpath ---------------
		// ----------  // tagName [@attribute='Value'] -------
	//		driver.findElement(By.xpath("//input[@class='gLFyf gsfz']")); input - tagName , attribute - class , Value - gLFyf gsfz
		
		// ------------ Index Based Xpath ---------------
				// ----------  (// tagName [@attribute='Value'])[i] -------  i - Index
			//		driver.findElement(By.xpath("(//input[@class='gLFyf gsfz'])[1]"));
		
		//  ------------  Condition Xpath -----------------
		
	//	driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @name='q']"));   ----------> AND condition Xpath
	//	driver.findElement(By.xpath("//input[@class='gLFyf gsfi'][ @name='q']")); -------------> This is also a AND condition Xpath
	//	driver.findElement(By.xpath("//input[@class='gLFyf gsfi' or @name='q']")); -----------> OR Condition Xpath
		
		//   	--------- Contains Based Xpath ---------
		// 	----------	 // tagName [containsb(@attribute,'Value')] ---------
		// driver.findElement(By.xpath("//input[contains(@name,'q')]"))
		
		//   ------------ Last Function ------
		// ------		driver.findElement(By.xpath("(//input[@name='btnK'])[last()]")).click();
	//	driver.findElement(By.xpath("(//input[@name='btnK'])[last()-1]")).click();

		// -------------  Position Function -------- only for 2 positions 
		//			driver.findElement(By.xpath("(//input[@name='btnK'])[position() =1]"));
//				driver.findElement(By.xpath("(//input[@name='btnK'])[position()>1]"));
//				driver.findElement(By.xpath("(//input[@name='btnK'])[position()<2]"));  --
		
		// --------------- contains text Function --------------
		// 		driver.findElement(By.xpath("//h3[contains(text(),'Amazon.in')]")).click();
	//	driver.findElement(By.xpath("//h3[.='Amazon.in']")).click();   (.=) - simple  form of contains text  
		
		// -------- Using Starts with  ------------
		// //input[Starts-with(text(),'starting 2 digits')]
		// 		driver.findElement(By.xpath("//h3[starts-with(@class,'LC')]")).click();
		
// 		---------- Using ends with
		//	 //input[ends-with(text(),'ending 2 digits')]
		// 		driver.findElement(By.xpath("//h3[ends-with(@class,'lb')]")).click();

		
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("amazon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnK'][position()=1]")).click();
		driver.findElement(By.xpath("//h3[starts-with(@class,'LC')]")).click();
		
//		driver.findElement(By.xpath("(//input[contains(@class,'gNO89b')])[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//input[contains(@class,'gNO89b')])[1]")).click();
//
//		driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		driver.findElement(By.xpath("//input[@class='_3704LK'][@name='q']")).sendKeys("Iphone 14 ");
//		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
//		
	
	}
}
   