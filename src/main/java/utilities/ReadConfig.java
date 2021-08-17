package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig()

	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}

	public String getBaseURL() {
		String url = pro.getProperty("baseURL");
		return url;

	}

	public String chromedriver() {
		String chrome = pro.getProperty("chromepath");
		return chrome;

	}

	public String Firefox() {
		String firefox = pro.getProperty("geckodriver");
		return firefox;

	}

	public String ie() {
		String ie = pro.getProperty("iedriver");
		return ie;

	}

	public String registeruserURL() {
		String registeruser = pro.getProperty("registeruserURL");
		return registeruser;

	}

	public String supplierURL() {
		String supplierurl = pro.getProperty("supplierURL");
		return supplierurl;
	}

	public String signinuserUrl() {
		String signinuserurl = pro.getProperty("signinuserURL");
		return signinuserurl;
	}

	public String signupuserURL() {
		String signupuserURL = pro.getProperty("signupuserURL");
		return signupuserURL;
	}

	public String email() {
		String email = pro.getProperty("email");
		return email;
	}

	public String password() {
		String password = pro.getProperty("password");
		return password;
	}

	public String signupuserurl() {
		String signupuserurl = pro.getProperty("signupuserurl");
		return signupuserurl;
	}
	public String dashboadurl() {
		String dashboardurl = pro.getProperty("dashboardurl");
		return dashboardurl;
	}
	
	public String resetpwdurl() {
	String resetpwdurl = pro.getProperty("resetpwdurl");
		return resetpwdurl;
}
	public String resetemailstatus() {
	String resetemailstatus = pro.getProperty("resetemailstatus");
		return resetemailstatus;
}
	
	public String excelsheetpath() {
		String excelsheetpath = pro.getProperty("excelsheet");
			return excelsheetpath;
	}
}
