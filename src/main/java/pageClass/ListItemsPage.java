package pageClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListItemsPage {
	WebDriver driver;
	public ListItemsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='test-2-div']//ul[@class='list-group']//li")
	List<WebElement> listgroup;
	
	public List<WebElement> getItemList() {
        return listgroup;
    }
	public String getItemText(int index) {
        return getItemList().get(index).getText();
    }
	public int getItemCount() {
        return getItemList().size();
    }
	public String getItemBadgeValue(int index) {
        String itemText = getItemText(index);
        int strLength = itemText.length();
        return itemText.substring(strLength - 1, strLength);
    }
	public String getItemArr(int index) {
        String itemText = getItemText(index);
        int strLength = itemText.length();
        return itemText.substring(0, strLength - 1).trim();
    }
}
