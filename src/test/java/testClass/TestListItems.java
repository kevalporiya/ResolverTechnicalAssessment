package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageClass.ListItemsPage;
import utils.ConfigReader;

public class TestListItems extends BaseTest{

	@Test(priority = 2)
    public void testListItems()
    {
	ConfigReader config = new ConfigReader();
	int listGroupCount = config.getExpectedListgroupCount();
	String expectedsecondListItem = config.getExpectedSecondListItem();
	int expectedsecondItembadgeValue =config.getExpectedSecondListItemBadgeValue();
	ListItemsPage listItemsPage = new ListItemsPage(driver);
	Assert.assertEquals(listItemsPage.getItemCount(),listGroupCount);
	for(int i = 0 ; i < listItemsPage.getItemCount(); i++) {
	     if(i == 1) {
	         Assert.assertEquals(listItemsPage.getItemArr(i),expectedsecondListItem);
	         Assert.assertEquals(Integer.parseInt(listItemsPage.getItemBadgeValue(i)),expectedsecondItembadgeValue);
	        }
	    }
    }
}
