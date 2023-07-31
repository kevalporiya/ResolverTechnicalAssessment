package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="inputEmail")
	WebElement userEmail;
	@FindBy(id="inputPassword")
	WebElement userPassword;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitButton;
	
	public void enterEmail(String email) {
		userEmail.sendKeys(email);
    }

    public void enterPassword(String password) {
    	userPassword.sendKeys(password);
    }
    
    public boolean isDisplayed() {
        return userEmail.isDisplayed()
            && userPassword.isDisplayed()
            &&submitButton.isDisplayed();
    }	
}

