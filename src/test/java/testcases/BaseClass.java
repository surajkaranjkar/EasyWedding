package testcases;





import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utilities.ReadConfig;


public class BaseClass {

	ReadConfig readconfig=new ReadConfig();
	public static WebDriver driver;
	
 
	public static Logger log=LogManager.getLogger(BaseClass.class.getName());
	@Parameters("browser")
	@BeforeTest
	public void setup(String br) throws IOException {
		
		
		
		log.error("HEllo ");
	
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", readconfig.chromedriver());
		driver=new ChromeDriver();
		
		log.error("Chrome Driver is initiated");
		
		}
		else if (br.equals("firefox"))	
		{
		System.setProperty("webdriver.gecko.driver", readconfig.Firefox());
		driver=new FirefoxDriver();
		log.fatal("Firefox is initiated");
		}
		else if (br.equals("ie"))	
		{
		System.setProperty("webdriver.interexplorer.driver", readconfig.ie());
		driver=new InternetExplorerDriver();
		log.info("IE is initiated");
		}
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(readconfig.getBaseURL());
		driver.manage().window().maximize();
		
		log.info("Got the base URL");
		}
	

	
	@AfterTest  
	public void tearDown()
	
	{
		driver.quit();
		
	}
	}
	
	
