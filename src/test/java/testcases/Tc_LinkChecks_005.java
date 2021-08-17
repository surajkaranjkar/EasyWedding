package testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ReadConfig;


public class Tc_LinkChecks_005 extends BaseClass {

	
	@Test
	public void browsesupplies() throws MalformedURLException, IOException, InterruptedException {
		
		
		ReadConfig r = new ReadConfig();
		driver.get(r.getBaseURL());
		Thread.sleep(3000);
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='ew-px ew-px-directory']//li"));
		
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)(new URL(url).openConnection());
			conn.setRequestMethod("HEAD");
			conn.connect();
			int response=conn.getResponseCode();
			if (response>399) {
				
				log.error("The link with the Text"+link.getText()+"is broken with code"+response);
          Assert.assertTrue(false);
		}
		
	
		}
	}

}
