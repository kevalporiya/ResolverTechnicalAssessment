package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageClass.LoginPage;
import utils.ConfigReader;

public class TestLogin extends BaseTest {

	@Test(priority = 1)
	 public void testLogin()
	 {
		 	ConfigReader config = new ConfigReader(); 
		 	String email=config.getEmailInput();
		 	String password =config.getPasswordInput();
		 	LoginPage loginPage = new LoginPage(driver);
		 	Assert.assertTrue(loginPage.isDisplayed());
	        loginPage.enterEmail(email);
	        loginPage.enterPassword(password);
	 }
}
