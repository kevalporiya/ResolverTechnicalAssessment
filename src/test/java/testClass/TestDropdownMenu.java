package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageClass.DropdownMenuPage;
import utils.ConfigReader;

public class TestDropdownMenu extends BaseTest {

	@Test(priority = 3)
    public void testDropdownMenu()
 {
		ConfigReader config = new ConfigReader();
		String expectedoptionCellValue= config.getExpectedOptionCellValue();
		String optionSelectList =config.getExpectedOptionSelectListValue();
		DropdownMenuPage dropdownMenuPage = new DropdownMenuPage(driver);
		Assert.assertEquals(dropdownMenuPage.getDropdownButtonText(),expectedoptionCellValue);
	 	dropdownMenuPage.clickDropdownButton();
	    dropdownMenuPage.clickDropdownItem(optionSelectList);
 }
}
