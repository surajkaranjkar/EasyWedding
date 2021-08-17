package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signupuser {
	WebDriver driver;

	public Signupuser(WebDriver driver) {
		this.driver = driver;

	}
	
	 By signin=By.xpath("a[@href='/login/']");
	 By email=By.id("onb-input-email");
	 By createaccount=By.xpath("//a[@id='onb-register']");
	 By fbsignup=By.id("onb-facebook-register");
	 By supplier=By.xpath("a[@href='https://wedcrm.com/'");
     By accounterror=By.xpath("//label[@class='onb-form-gvalid error']");
     By aggree=By.xpath("//span[@class='btn btn-primary']");
     By letsdoit=By.xpath("//span[@class='btn btn-primary anim-fadeinup']");
     By groom=By.xpath("(//div[@class='icon-user'])[2]");
     By bride=By.xpath("(//div[@class='icon-user'])[1]");
     By partername=By.xpath("(//div[@class='col-xs-7 text-left']//input)[2]");
     By name=By.xpath("(//div[@class='col-xs-7 text-left']//input)[1]");
     By dropdownbride=By.xpath("(//ul[@class='dropdown-menu']//li[2])[2]");
     By secondrole=By.xpath("//button[@id='secondRole']");
     By selectdate=By.xpath("//input[@id='bnb']");
     By guestno=By.xpath("//div[@class='scroll-x']//span[5]");
     By password=By.xpath("//input[@type='password']");
	 public WebElement signin() {
	 	return driver.findElement(signin);
	 }
	 public WebElement email(){
	 	return driver.findElement(email);
	 	
	 }

	 public WebElement createaccount() {
	 	return driver.findElement(createaccount);
	 }


	 public WebElement fbsignup() {
	 	return driver.findElement(fbsignup);
	 }

	 public WebElement supplier() {
	 	return driver.findElement(supplier);
	 }
	 public WebElement accounterror() {
		 	return driver.findElement(accounterror);
		 }
	 public WebElement aggree() {
		 	return driver.findElement(aggree);
		 }
	 public WebElement letsdoit() {
		 	return driver.findElement(letsdoit);
		 }
	 public WebElement groom() {
		 	return driver.findElement(groom);
		 }
	 public WebElement bride() {
		 	return driver.findElement(bride);
		 }
	 public WebElement partnername() {
		 	return driver.findElement(partername);
		 }
	 public WebElement name() {
		 	return driver.findElement(name);
		 }
	 
	 public WebElement dropdownbride() {
		 	return driver.findElement(dropdownbride);
		 }
	 public WebElement secondrole() {
		 	return driver.findElement(secondrole);
		 }
	 public WebElement selectdate() {
		 	return driver.findElement(selectdate);
		 }
	
	 public WebElement guestno() {
		 	return driver.findElement(guestno);
		 }
	 public WebElement password() {
		 	return driver.findElement(password);
		 }
	}
	 

