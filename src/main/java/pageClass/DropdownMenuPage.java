package pageClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownMenuPage {
	WebDriver driver;
	public DropdownMenuPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="dropdownMenuButton")
	WebElement dropdownButtonLocator;
	@FindBy(xpath="//div[@class='dropdown-menu show']/a")
	List<WebElement> dropdownItemsLocator;
	
	public String getDropdownButtonText() {
        return dropdownButtonLocator.getText();
    }

    public void clickDropdownButton() {
    	dropdownButtonLocator.click();
    }

    public List<WebElement> getDropdownItems() {
        return dropdownItemsLocator;
    }
    
    public void clickDropdownItem(String itemText) {
        List<WebElement> dropdownItems = getDropdownItems();
        for(WebElement item : dropdownItems) {
            if(item.getText().equalsIgnoreCase(itemText)) {
                item.click();
                break;
            }
        }
    }
}
