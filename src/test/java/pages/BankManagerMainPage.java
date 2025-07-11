package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerMainPage{

    public BankManagerMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//button[@ng-click='addCust()']")
    public WebElement addCustomerMainButton;

    @FindBy(xpath = "//button[@ng-click='openAccount()']")
    public WebElement openAccountButton;

    @FindBy(xpath = "//button[@ng-click='showCust()']")
    public WebElement customersButton;

    @FindBy(xpath = "//input[@ng-model='fName']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@ng-model='lName']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@ng-model='postCd']")
    public WebElement postalInput;

    @FindBy(xpath = "//form/button")
    public WebElement addCustomerButton;


    public void addCustomer(String firstName, String lastName, String postalCode){
        addCustomerMainButton.click();
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        postalInput.sendKeys(postalCode);
        addCustomerButton.click();
    }


}
