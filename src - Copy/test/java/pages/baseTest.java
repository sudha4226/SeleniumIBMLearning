package pages;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ConfigRead;

public class baseTest {
    
    
    WebDriver driver;
    Actions act;
    ConfigRead conf;
    Logger log;
    loginPage lp;
    customerRolesPages cr;
    
	@BeforeTest
    public void launchApp() throws Exception {

        
        //log file
        
        log = Logger.getLogger("NOP Comm Login Module");
        PropertyConfigurator.configure(".\\testData\\log4j.properties");
        
        
        

        //Create an Object Config
        
        conf = new ConfigRead();
        
        log.info("launching chrome browser.");
        
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        act = new Actions(driver);
        lp = new loginPage(driver);
        cr= new customerRolesPages();
        
        //lp = LoginPage(driver);
        
        
        driver.manage().window().maximize();
        log.info("launching application: " + conf.getNOPComm());
        driver.get(conf.getNOPComm());

    }

    @AfterTest
    public void closingApp() throws Exception {

        Thread.sleep(5000);
        driver.close();
        log.info("chrome browser closed.");
        
    }
    

}


