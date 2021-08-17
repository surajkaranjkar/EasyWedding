package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.Signinuser;
import pageobjects.Signupuser;
import utilities.ReadConfig;



public class Tc_Signupuser_004 extends BaseClass {
	
	@Test
	public void signupuser() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LandingPage lp = new LandingPage(driver);
		Signinuser s = new Signinuser(driver);
		ReadConfig r = new ReadConfig();
		Signupuser u=new Signupuser(driver);

		lp.Signin().click();
		s.clickSignupuser().click();//Clicks sigup button on signin page 
		Assert.assertEquals("https://www.easyweddings.com.au/register/",driver.getCurrentUrl());
		s.setEmail().sendKeys(r.email());
		u.createaccount().click();
		//Thread.sleep(10000);
		if (u.accounterror().getText().contains("EMAIL ALREADY REGISTERED, PLEASE LOGIN")){
			log.info("TEST CASE IS PASS");
		Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
	    log.error("TEST CASE IS FAIL");
		}
		
		
		s.setEmail().clear();
        s.setEmail().sendKeys("rhujuta+Kahiipaan@easyweddings.com.au");
        u.createaccount().click();
   
        u.aggree().click();
        
        u.letsdoit().click();
       
        u.groom().click();
        u.aggree().click();// Same xpath for agree button
        
        u.name().sendKeys("asasasa");
        u.partnername().sendKeys("mdmaldad");
        u.secondrole().click();
        u.dropdownbride().click();
	    u.aggree().click();
	    u.selectdate().clear();
	    u.selectdate().sendKeys("20/09/2021");
	    u.aggree().click();
	    u.guestno().click();
	    u.aggree().click();
	    u.guestno().click();
	    u.aggree().click();
	    u.password().sendKeys("sasadsfsdsafdsfgdsfsdf");
	    
	}

}
