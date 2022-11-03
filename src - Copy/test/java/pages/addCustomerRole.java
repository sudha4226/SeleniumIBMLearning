package pages;

import org.testng.annotations.Test;

public class addCustomerRole extends baseTest {
	
	@Test
	public void verifyCustomerRoleAddBTN()
	{
		lp.enterEmail(conf.getAdminUser());
        lp.enterPass(conf.getAdminPass());
        lp.clickCheckBox();
        lp.clickLoginButton();
        cr.checkforAddRole();
	}

}
