package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseOverOperation{

    public WebDriver driver;

    @BeforeTest
    public void launchApp() {

        System.out.println("launching .....");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    @AfterTest
    public void closingApp() throws Exception {

        Thread.sleep(7000);
        //driver.close();

        //System.out.println("closing....");
    }

    @Test
    public void rightClickTest() throws Exception {

        
        WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'sign in')]"));
        WebElement watchlist=driver.findElement(By.xpath("//span[text()='Create a List']"));
        Actions act=new Actions(driver);
        act.moveToElement(ele).moveToElement(watchlist).click().perform();
        String actual=driver.getTitle();
        String expected="Your List";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);

}
}