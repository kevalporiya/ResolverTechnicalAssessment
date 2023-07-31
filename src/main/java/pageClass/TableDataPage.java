package pageClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TableDataPage {

	 WebDriver driver;
     String[][] tableData;

    public TableDataPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//table")
	WebElement tableLocator;
    @FindBy(xpath="//tbody/tr")
	List<WebElement> rows;
    @FindBy(tagName="td")
	List<WebElement> cellLocator;
    
    public String[][] getTableData() {
       // WebElement table = driver.findElement(tableLocator);
        //List<WebElement> rows = table.findElements(rowLocator);
        int rowCount = rows.size();
       int columnCount = rows.get(0).findElements(By.tagName("td")).size();
       
        tableData = new String[rowCount][columnCount];

        for (int i = 0; i < rowCount; i++) {
            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
            for (int j = 0; j < columnCount; j++) {
                tableData[i][j] = cells.get(j).getText();
            }
        }
        return tableData;
    }

    public String getCellValue(int row, int column) {
        if (row < 0 || column < 0 || row >= tableData.length || (tableData.length > 0 && column >= tableData[0].length)) {
            throw new IllegalArgumentException("Invalid cell indices");
        }
        return tableData[row][column];
    }

}
