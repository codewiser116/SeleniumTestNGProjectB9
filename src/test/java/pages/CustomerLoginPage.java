package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserUtils;
import utils.Driver;

public class CustomerLoginPage {

    public CustomerLoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "userSelect")
    public WebElement yourNameDropdown;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginBtn;

    public void login(String username){
        BrowserUtils.selectFromDropdown(Driver.getDriver(), yourNameDropdown, "text", username);
        loginBtn.click();
    }


}
