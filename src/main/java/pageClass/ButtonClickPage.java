package pageClass;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonClickPage {
	 WebDriver driver;
     WebDriverWait wait;

    public ButtonClickPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//div[@id='test-5-div']/button")
	WebElement buttonLocator;
	@FindBy(id="test5-alert")
	WebElement successMessageLocator;

    public WebElement getButton() {
        return buttonLocator;
    }

    public WebElement getSuccessMessage() {
        return successMessageLocator;
    }

    public void clickButton() {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1500)");
        wait.until(ExpectedConditions.visibilityOf(getButton())).click();
    }
}

