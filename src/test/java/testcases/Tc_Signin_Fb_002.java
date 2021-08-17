package testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageobjects.AfterSignin;
import pageobjects.LandingPage;
import pageobjects.Signinuser;
import utilities.ReadConfig;

@Test
public class Tc_Signin_Fb_002 extends BaseClass{

	public void fblogin() throws InterruptedException {
		
		LandingPage lp = new LandingPage(driver);
		Signinuser s = new Signinuser(driver);
		Actions a=new Actions(driver);
		AfterSignin aft = new AfterSignin(driver);
		ReadConfig r = new ReadConfig();
		
		lp.Signin().click();
		s.facebook().click();
		Set<String> wind=driver.getWindowHandles();
		Iterator<String>it=wind.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		s.facebookemail().sendKeys("rhujuta@easyweddings.com.au");
		s.facebookpwd().sendKeys("test1234");
		s.facebooklogin().click();
		driver.switchTo().window(parentid);
		Thread.sleep(8000);
		a.click(aft.profilephoto()).build().perform();
		Thread.sleep(4000);
		aft.signout().click();
		Thread.sleep(3000);
		if (r.signinuserUrl() == driver.getCurrentUrl()) {
			log.info("Correct NAVIGATION FROM SIGIN SIGOUT");
		} else {
			log.error("Navigation failed correct url should be" + r.signinuserUrl());

		}
		
		
		
		
		
	}
	
}
