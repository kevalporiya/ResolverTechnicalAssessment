package pageClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage {
	WebDriver driver;
	public ButtonsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(id="test-4-div")
	WebElement buttonsDivLocator;
	@FindBy(tagName="button")
	List<WebElement> buttonsLocator;
	

    public WebElement getButtonsDiv() {
        return buttonsDivLocator;
    }

    public List<WebElement> getButtons() {
    	return buttonsDivLocator.findElements(By.tagName("button"));
    }
}
