package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FramesWebcdrm extends BaseClass{

	@Test
	public void frames() throws InterruptedException {
		
		driver.get("https://wedcrm.com/");
		driver.findElement(By.name("loginEmail")).sendKeys("debug@easyweddings.com.au");
		driver.findElement(By.name("loginPassword")).sendKeys("dev");
		driver.findElement(By.id("crm-login-form-submit")).click();
		driver.get("https://wedcrm.com/54k9cn4yw/salesleads/1029139/");
		driver.findElement(By.xpath("//button[@id='btnReplyWithTemplate']")).click();
       driver.switchTo().frame("txtEmailBody_ifr");
        driver.findElement(By.id("tinymce")).sendKeys("skklsjfklsjflsajf");
        Thread.sleep(10000);
	
	}
}
