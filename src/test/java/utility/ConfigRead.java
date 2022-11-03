package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigRead {

	Properties prop;

	public ConfigRead() throws Exception {

		FileInputStream fis = new FileInputStream("./testData/config.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public String getAmazonApp() {

		return prop.getProperty("appURL_Amazon");

	}

	public String getNOPComm() {

		return prop.getProperty("app_url_QA");

	}
	
	public String getAdminUser() {

		return prop.getProperty("adminUserName");

	}
	
	public String getAdminPass() {

		return prop.getProperty("adminPassword");

	}
	
	public String getBrowser() {

		return prop.getProperty("browser");

	}

}
