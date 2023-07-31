package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageClass.TableDataPage;
import utils.ConfigReader;

public class TestTableData extends BaseTest {
	
	@Test(priority = 6)
    public void testTableData()
    {
	 ConfigReader config = new ConfigReader();
	 String expectedCellValue = config.getExpectedCellValue();
	 TableDataPage tableDataPage = new TableDataPage(driver);
	 tableDataPage.getTableData();
	 String actualcellValue = tableDataPage.getCellValue(2, 2);
	 Assert.assertEquals(actualcellValue,expectedCellValue);
    }
}
