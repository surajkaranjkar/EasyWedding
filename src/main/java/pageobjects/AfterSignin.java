package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AfterSignin {
	WebDriver driver;

	public AfterSignin(WebDriver driver) {
		this.driver = driver;

	}
	
	By profilephoto=By.xpath("//div[@id='ew-desktop-login']/div[2]/a[1]/img[2]");
	By signout=By.xpath("//a[@href='/logout/']");
	By settings=By.xpath("//a[contains(text(),'Settings')]");
	By oldpwd=By.xpath("//input[@ng-model='Password']");
	By newpwd=By.xpath("//input[@ng-model='Password']");
	By confirmpwd=By.xpath("//input[@ng-model='NewPassword2']");
	By savechanges=By.xpath("//button[@class='btn btn-primary btn-lg']");
	
	public WebElement profilephoto() {
		return driver.findElement(profilephoto);
		
	}
	public WebElement signout() {
		return driver.findElement(signout);
	}
	public WebElement oldpwd() {
		return driver.findElement(oldpwd);
}
	
	public WebElement newpwd() {
		return driver.findElement(newpwd);
}
	
	public WebElement settings() {
		return driver.findElement(settings);
}
	
	public WebElement confrmpwd() {
		return driver.findElement(confirmpwd);
}
	
	public WebElement savechanges() {
		return driver.findElement(savechanges);
}
}

