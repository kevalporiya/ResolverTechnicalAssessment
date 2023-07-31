package testClass;

import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageClass.ButtonClickPage;
import utils.ConfigReader;

public class TestButtonDisplayAndClick extends BaseTest{
	@Test(priority = 5)
    public void testButtonDisplayAndClick()
    {
	 ConfigReader config = new ConfigReader();
	 String expectedSuccessMessage = config.getExpectedSuccessMessage();
	 ButtonClickPage buttonClickPage = new ButtonClickPage(driver);
	 buttonClickPage.clickButton();
	 WebElement successMessage = buttonClickPage.getSuccessMessage();
	 Assert.assertEquals(successMessage.getText(),expectedSuccessMessage);
	 Assert.assertTrue(successMessage.isDisplayed());
	 Assert.assertFalse(buttonClickPage.getButton().isEnabled());
    }
}
