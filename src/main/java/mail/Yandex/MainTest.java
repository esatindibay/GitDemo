package mail.Yandex;


import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.InsideMail;
import pageObject.firstPage;
import pageObject.loginPage;
import resources.base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainTest extends base{
	
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	
	@BeforeTest
	public void initialize() throws IOException{
		driver = BeginBrowser();
		log.info("browser is initialized");
		driver.get(p.getProperty("url"));
		log.info("driver is initialized");
	}
	
	@Test
	public void SendingMailTestMethod() throws InterruptedException{
		firstPage first = new firstPage(driver);
		//Assert.assertTrue(first.checkGirl().isDisplayed());
		log.info("the girl is appeared");
		//Assert.assertTrue(first.checkMan().isDisplayed());
		log.info("the man is appeared");
		first.login().click();
		System.out.println("bu bir eklemedir");
		
		loginPage lp = new loginPage(driver);
		log.info("now login page is loaded");
		lp.EnterUsername().sendKeys(p.getProperty("username"));
		lp.submit_usernm().click();
		lp.EnterPassword().sendKeys(p.getProperty("password"));
		lp.submit_usernm().click();
		
		InsideMail i =new InsideMail(driver);
		log.info("now i am in mail box");
		i.writeMail().click();
		i.receiver().sendKeys(p.getProperty("receiver"));
		i.topic().sendKeys(p.getProperty("topic"));
		i.message().sendKeys(p.getProperty("message"));
		i.sendMessage().click();
		log.info("right now i sent the message and waiting to be closed");
		Thread.sleep(3000L);
		i.logOut1().click();
		i.logOut2().click();
	}
	@Test
	public void branch(){
		System.out.println("this is trial for branch");
	}
	@AfterTest
	public void teatdown(){
		driver.close();
		log.info("browser is closed down");
	}
		
	
}
