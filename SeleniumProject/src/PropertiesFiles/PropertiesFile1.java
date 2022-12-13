package PropertiesFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile1 {

	public static void main(String[] args) throws Exception, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\Driver\\chromedriver_win32\\chromedriver.exe");
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\nathe\\eclipse-workspace\\SeleniumProject\\src\\PropertiesFiles\\config.properties"));
		String URL = prop.getProperty("URL");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
	}
}
