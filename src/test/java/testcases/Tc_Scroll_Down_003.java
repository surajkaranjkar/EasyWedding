package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.Signinuser;
import utilities.ReadConfig;
@Test
public class Tc_Scroll_Down_003 extends BaseClass {
	
public void scrolldown() throws InterruptedException {
	LandingPage lp=new LandingPage(driver);
	Signinuser s = new Signinuser(driver);
	ReadConfig r = new ReadConfig();
	//driver.get(r.getBaseURL());
	lp.Signin().click();
	s.setEmail().sendKeys(r.email());
	Thread.sleep(2000);
	s.setPassword().sendKeys(r.password());
	s.clickSignIn().click();
	System.out.println(driver.getCurrentUrl());
	System.out.println("adadadsfsaf");
	Thread.sleep(3000);
	//WebElement elements=driver.findElement(By.xpath("//a[@class='ew-readmore btn-primary']"));
	driver.findElement(By.xpath("//img[@title='Easy Weddings']")).click();
	Thread.sleep(1000);
	System.out.print(driver.findElement(By.xpath("//a[@class='ew-readmore btn-primary']")));
	//JavascriptExecutor js=(JavascriptExecutor) driver;
	//js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//a[@class='ew-readmore btn-primary']")) );
//sert.assertTrue(driver.findElement(By.xpath("//a[@class='ew-readmore btn-primary']"))))
	
	Thread.sleep(15000);
	
	
	
	Thread.sleep(3000);
	System.out.println(driver.getCurrentUrl());
}

}
