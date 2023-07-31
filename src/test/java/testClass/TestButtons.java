package testClass;

import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageClass.ButtonsPage;

import java.util.List;

public class TestButtons extends BaseTest {

	@Test(priority = 4)
    public void testButtons()
    {
	 ButtonsPage buttonsPage = new ButtonsPage(driver);
	 WebElement buttonsDiv =  buttonsPage.getButtonsDiv();
	 Assert.assertTrue(buttonsDiv.isDisplayed());
	 List<WebElement> buttons = buttonsPage.getButtons();
	 Assert.assertTrue(buttons.get(0).isEnabled());
	 Assert.assertFalse(buttons.get(1).isEnabled());
    }
}
