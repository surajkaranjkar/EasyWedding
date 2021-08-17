package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signinuser {

	WebDriver driver;

	public Signinuser(WebDriver driver) {
		this.driver = driver;

	}

	By emailid = By.id("onb-input-email");
	By photo = By.className("onb-form-msg");
	By password = By.xpath("//*[@id='onb-input-password']");
	By signin = By.id("onb-login");
	By errortext = By.xpath("//label[@for='onb-input-email']");
	By signup = By.xpath("//a[@href='/register/']");
	By forgotpwd = By.className("onb-forgot-password");
	By facebook = By.id("onb-facebook-login");
	By facebookemail = By.id("email");
	By facebookpwd = By.id("pass");
	By facebooklogin = By.name("login");

	public WebElement clickSignupuser() {

		return driver.findElement(signup);
	}

	public WebElement photo() {

		return driver.findElement(photo);
	}

	public WebElement setEmail() {
		return driver.findElement(emailid);
	}

	public WebElement setPassword() {
		return driver.findElement(password);

	}

	public WebElement clickSignIn() {
		return driver.findElement(signin);
	}

	public WebElement improperemail()

	{
		return driver.findElement(errortext);
	}

	public WebElement forgotpwd() {
		return driver.findElement(forgotpwd);
	}

	public WebElement facebook() {
		return driver.findElement(facebook);
	}

	public WebElement facebookemail() {
		return driver.findElement(facebookemail);
	}

	public WebElement facebookpwd() {
		return driver.findElement(facebookpwd);
	}

	public WebElement facebooklogin() {
		return driver.findElement(facebooklogin);
	}
}
