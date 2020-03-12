package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class firstPage {

	public WebDriver driver;
	
	public firstPage(WebDriver driver) {
		this.driver = driver;
	}



	By girl = By.xpath("//*[@id='index-page-container']/div/div[2]/div/div/div[2]");
	public WebElement checkGirl() {
		return driver.findElement(girl);
	}
	

	
	By man = By.xpath("//*[@id='index-page-container']/div/div[2]/div/div/div[3]");
	public WebElement checkMan() {
		return driver.findElement(man);
	}
	
	
	
	By logButton = By.xpath("//*[@id='index-page-container']/div/div[2]/div/div/div[4]/a[2]");
	public WebElement login(){
		return driver.findElement(logButton);
	}
	
	
	
	
}
