package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninSupplier {

	public WebDriver driver;
	

	public SigninSupplier(WebDriver driver) {
		this.driver = driver;
	}
	
	By email = By.id("loginEmail");
	By password = By.id("loginPassword");
	By signin = By.id("crm-login-form-submit");
	By forgotpwd = By.linkText("Forgot your password?");

	public WebElement email() {
		return driver.findElement(email);

	}

	public WebElement password() {
		return driver.findElement(password);
	}

	public WebElement signin() {
		return driver.findElement(signin);

	}

	public WebElement forgotpwd() {
		return driver.findElement(forgotpwd);
	}
}
