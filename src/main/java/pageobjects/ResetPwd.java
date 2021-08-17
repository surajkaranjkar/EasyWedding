package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPwd {
 
	WebDriver driver;
	
	public ResetPwd(WebDriver driver) {
		this.driver=driver; 
		
	}
	
	By email=By.id("email");
	By resetpwd=By.id("resetPassword");
	By checkemail =By.className("onb-form-gvalid");
	By clickhere=By.xpath("//a[@href='/login/']");
	public WebElement email() {
		return driver.findElement(email);
	}
	public WebElement resetpwd() {
		return driver.findElement(resetpwd);
	}
	public WebElement checkemail() {
		return driver.findElement(checkemail);
	}
	public WebElement clickhere() {
		return driver.findElement(clickhere);
	}
}
