package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerMainPage {

    public CustomerMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy (xpath = "//button[@ng-click='transactions()']")
    public WebElement transactionsButton;

    @FindBy (xpath = "//button[@ng-click='deposit()']")
    public WebElement deposits;

    @FindBy (xpath = "//button[@ng-click='withdrawl()']")
    public WebElement withdrawals;

    @FindBy(xpath = "//div[@ng-hide='noAccount']/strong[2]")
    public WebElement balance;

    @FindBy(xpath = "//button[@class='btn home']")
    public WebElement homeBtn;

    @FindBy(xpath = "//button[@class='btn logout']")
    public WebElement logoutBtn;

    @FindBy(xpath = "//input[@placeholder='amount']")
    public WebElement depositInputField;

    @FindBy(xpath = "//button[.='Deposit']")
    public WebElement depositButton;

    @FindBy(xpath = "//form[@ng-submit='withdrawl()']//input")
    public WebElement withdrawalInputField;

    @FindBy(xpath = "//form[@ng-submit='withdrawl()']/button")
    public WebElement withdrawalButton;

    public double getCurrentBalance(){
        return Double.parseDouble(balance.getText().trim());
    }

    public void depositMoney(double amount){
        deposits.click();
        depositInputField.sendKeys(Double.toString(amount));
        depositButton.click();
    }

    public void withdrawMoney(double amount){
        withdrawals.click();
        withdrawalInputField.sendKeys(Double.toString(amount));
        withdrawalButton.click();
    }




}
