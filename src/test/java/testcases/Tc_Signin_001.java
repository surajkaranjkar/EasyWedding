 package testcases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageobjects.AfterSignin;
import pageobjects.LandingPage;
import pageobjects.ResetPwd;
import pageobjects.Signinuser;
import utilities.ReadConfig;

@Test
public class Tc_Signin_001 extends BaseClass {

	public void signin() throws InterruptedException {
		LandingPage lp = new LandingPage(driver);
		Signinuser s = new Signinuser(driver);
		ReadConfig r = new ReadConfig();
		AfterSignin aft = new AfterSignin(driver);
		Actions a = new Actions(driver);
		ResetPwd p=new ResetPwd(driver);
       
		driver.get(r.getBaseURL());
	
		log.error("this is landing page");
		lp.Signin().click();/// THIS WILL CLICK ON SIGNIN BUTON
		
	//Verify proper email address
		s.setEmail().sendKeys("k.suraj8");
		a.click(s.photo()).build().perform();
	//	Thread.sleep(3000);
        Assert.assertEquals("PLEASE PROVIDE A PROPER EMAIL ADDRESS", s.improperemail().getText());
        s.setEmail().clear();
        
        // Verify if the email address pop-up is blank 	
        s.setEmail().sendKeys("kgfgf");
		a.click(s.photo()).build().perform();
		a.doubleClick(s.setEmail()).sendKeys(Keys.BACK_SPACE).build().perform();
		
		Assert.assertEquals("YOUR USERNAME CANNOT BE EMPTY", s.improperemail().getText());
		s.setEmail().clear();
    //Sign-in into account
        s.setEmail().sendKeys(r.email());
	//	Thread.sleep(2000);
		s.setPassword().sendKeys(r.password());
		s.clickSignIn().click();

		
		if (r.dashboadurl() == driver.getCurrentUrl()) {
			log.info("Correct Dasboard URL");
		} else {
			log.error("Wrong URL of dashboard");
		}
		//Thread.sleep(8000);
    // user Sign out 
		a.click(aft.profilephoto()).build().perform();
		//Thread.sleep(4000);
		aft.signout().click();
		Thread.sleep(3000);
		if (r.signinuserUrl() == driver.getCurrentUrl()) {
			log.info("Correct NAVIGATION FROM SIGIN SIGOUT");
		} else {
			log.error("Navigation failed correct url should be" + r.signinuserUrl());

		}
		
    // user clicks forgot pwd 
		s.forgotpwd().click();
		Assert.assertEquals(r.resetpwdurl(),driver.getCurrentUrl());
	// USer enters email for forgot pwd 
		
		p.email().sendKeys(r.email());
		p.resetpwd().click();
		//Thread.sleep(2000);
		//Assert.assertEquals(r.resetemailstatus(),p.checkemail());
		p.clickhere().click();
     // Click on the link to check if it gets redirected to Sign in 
		Assert.assertEquals(r.signinuserUrl(),driver.getCurrentUrl());
		
	
		
		
	
	}

}
