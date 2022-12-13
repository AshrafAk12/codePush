package Xpth;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExec {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nathe\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\WebDriver\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement e= driver.findElement(By.name("q"));
		e.sendKeys("swag labs"+Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.className("LC20lb")).click();
		Thread.sleep(1000);
		WebElement e1 = driver.findElement(By.id("user-name"));
		Thread.sleep(1000);
		e1.sendKeys("standard_user");
		Thread.sleep(1000);
		WebElement e2 = driver.findElement(By.id("password"));
		Thread.sleep(1000);
		e2.sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(5000);
		WebElement t=driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket"));
		JavascriptExecutor js=(JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView", t);
		t.click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		Thread.sleep(2000);
		WebElement w=driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
		JavascriptExecutor rs=(JavascriptExecutor) driver;

		rs.executeScript("arguments[0].scrollIntoView", w);
		Thread.sleep(2000);
		w.click();
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);
		WebElement p =driver.findElement(By.id("checkout"));
		JavascriptExecutor gs=(JavascriptExecutor) driver;
		

		gs.executeScript("arguments[0].scrollIntoView", p);
		Thread.sleep(2000);  
		p.click();
		WebElement e3= driver.findElement(By.id("first-name"));
		Thread.sleep(2000);
		e3.sendKeys("Ashraf");
		WebElement e4 = driver.findElement(By.id("last-name"));
		Thread.sleep(2000);
		e4.sendKeys("E");
		Thread.sleep(2000);
		WebElement e5= driver.findElement(By.id("postal-code"));
		Thread.sleep(2000);
		e5.sendKeys("654321");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("finish")).click();Thread.sleep(2000);
		driver.findElement(By.id("back-to-products")).click();Thread.sleep( 2000);
		driver.findElement(By.id("react-burger-menu-btn")).click();Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click(); Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle() + "  " + driver.toString());
		driver.findElement(By.xpath("//input[contains(@class,'gLFyf')]")).sendKeys("javapoint Java" + Keys.ENTER);
		driver.findElement(By.xpath("//h3[contains(@class,'LC20lb')][contains(text(),'Java Tutorial | Learn Java Programming - javatpoint')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@class,'gLFyf')]")).sendKeys("Tamil Quotes"+Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
	}	
	
	}
