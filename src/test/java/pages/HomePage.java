package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this); // used to initialize web elements of this class
    }

    @FindBy(xpath = "//button[.='Customer Login']")
    public WebElement customerLoginBtn;

    @FindBy(xpath = "//button[.='Bank Manager Login']")
    public WebElement bankManagerLoginBtn;

}
