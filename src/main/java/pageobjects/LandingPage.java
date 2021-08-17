package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By search = By.id("ew-search-input");
	By signup = By.xpath("//div[@id='ew-desktop-login']/div[1]/a[1]/div[1]/div[2]");
	By signin = By.xpath("//*[@id='ew-desktop-login']/div[2]/a[1]/div[1]/div[2]");

	
	
	public WebElement searchbutton() {
		return driver.findElement(search);
	}

	public WebElement Signup() {

		return driver.findElement(signup);
	}

	public WebElement Signin() {
		return driver.findElement(signin);
	}
}
