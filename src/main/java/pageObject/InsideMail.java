package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InsideMail {

	
	public WebDriver driver;
	
	public InsideMail(WebDriver driver) {
		this.driver = driver;
	}

	By wrt = By.xpath("//span[@class='mail-ComposeButton-Text']");
	public WebElement writeMail() {
		return driver.findElement(wrt);
	}
	
	By alici = By.xpath("//div[@name='to']");
	public WebElement receiver() {
		return driver.findElement(alici);
	}
	
	By konu = By.xpath("//label//div//input[@type='text']");
	public WebElement topic() {
		return driver.findElement(konu);
	}
	

	By metin = By.xpath("//div[@role='textbox']");
	public WebElement message() {
		return driver.findElement(metin);
	}
	
	By yolla = By.xpath("//button[@data-nb='button']");
	public WebElement sendMessage() {
		return driver.findElement(yolla);
	}
	
	By cik = By.id("recipient-1");
	public WebElement logOut1() {
		return driver.findElement(cik);
	}
	
	By cikk = By.xpath("//a[@data-metric='Sign out of Yandex services']");
	public WebElement logOut2() {
		return driver.findElement(cikk);
	}
}
