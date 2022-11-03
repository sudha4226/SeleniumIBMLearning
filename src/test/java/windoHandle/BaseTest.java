package windoHandle;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	
	public WebDriver driver;
	// pre-condition ------- Before
	// Test
	// post-condition ------ After

	@Before
	public void launchApp() {

		System.out.println("launching .....");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");

	}

	@After
	public void closingApp() throws Exception {

		Thread.sleep(5000);
		driver.close();
		
		System.out.println("closing....");
	}
	

}
