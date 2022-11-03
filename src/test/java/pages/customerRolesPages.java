package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class customerRolesPages {
	WebDriver driver;
	
	public void custoomerRolesPages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By customerRoles = By.xpath("//p[contains(text(),'Customer roles')]");
	By customers= By.xpath(" //p[contains(text(),'Customers')]//ancestor::ul[@role='menu']");
	By addBtn=By.xpath(" //a[@class='btn btn-primary']");
	
	public void checkforAddRole()
	{
		driver.findElement(customers).click();
		driver.findElement(customerRoles).click();
		Boolean btndisplay=driver.findElement(addBtn).isDisplayed();
		Assert.assertEquals(true, btndisplay);
		
		
	}
	
	

}
