package testcases;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageobjects.AfterSignin;
import pageobjects.LandingPage;
import utilities.ReadConfig;
import utilities.exceldata;
import pageobjects.Signinuser;
@Test
public class Tc_Login_Using_Excel_Data_006 extends BaseClass{
	

	
	public void Login() throws IOException, InterruptedException {
		ReadConfig r=new ReadConfig();
		LandingPage lp=new LandingPage(driver);
		exceldata data=new exceldata(".\\Configuration\\details.xlsx");
		Signinuser s=new Signinuser(driver);
		Actions a = new Actions(driver);
		AfterSignin aft = new AfterSignin(driver);
		
		driver.get(r.getBaseURL());
		lp.Signin().click();
	    s.setEmail().sendKeys(data.getCelldata("User_Details",1, 0));
	    Thread.sleep(2000L);
		s.setPassword().sendKeys(data.getCelldata("User_Details", 1, 1 ));
		s.clickSignIn().click();
		Thread.sleep(8000);
		a.click(aft.profilephoto()).build().perform();
		Thread.sleep(10000);
		aft.settings().click();
		Thread.sleep(10000);
		aft.oldpwd().sendKeys(data.getCelldata("User_Details", 2, 1 ));
		aft.newpwd().sendKeys("Harshad@12");
		aft.confrmpwd().sendKeys("Harshad@12");
		data.setCellData("User_Details", 1, 1,"Harshad@12" );
		aft.savechanges().click();
		
			}

}
