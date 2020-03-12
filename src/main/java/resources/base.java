package resources;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public WebDriver driver;
	public Properties p;
	
	
	public WebDriver BeginBrowser() throws IOException{
		p = new Properties();
		FileInputStream f = new FileInputStream(System.getProperty("user.dir") + "\\src/main/java\\resources\\data.properties");
		p.load(f);
		
		String x =System.getProperty("browser");
		if(x!=null && x.contains("chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			if(x.contains("headless")){
				options.addArguments("headless");
			}
			driver = new ChromeDriver(options);
			
		}else{
			
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	

}
