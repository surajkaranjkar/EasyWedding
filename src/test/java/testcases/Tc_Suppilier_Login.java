package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
@Test

public class Tc_Suppilier_Login extends BaseClass {

	
	public void supplierlogin() {
		
		driver.get("https://wedcrm.com/");
		driver.findElement(By.id("loginEmail")).sendKeys("debug@easyweddings.com.au");
		driver.findElement(By.id("loginPassword")).sendKeys("dev");
		driver.findElement(By.id("crm-login-form-submit")).click();
		driver.findElement(By.id("profile-shown-img")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		
	}
}
