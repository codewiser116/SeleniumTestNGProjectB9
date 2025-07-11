package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BankManagerMainPage;
import pages.HomePage;
import utils.ConfigurationReader;
import utils.Driver;

import java.time.Duration;

public class BankManagerTests {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage(driver);
    BankManagerMainPage bankManagerMainPage = new BankManagerMainPage(driver);



    @Test (dataProvider = "customerData", dataProviderClass = DataClass.class)
    public void verifyBankManagerAddsCustomer(String fName, String lName, String zipcode){
        driver.get(ConfigurationReader.getProperty("loginUrl"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        homePage.bankManagerLoginBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlContains("manager"));

        bankManagerMainPage.addCustomer(fName, lName, zipcode);

        wait.until(ExpectedConditions.alertIsPresent());

        String confirmationMessage = driver.switchTo().alert().getText();
        System.out.println(confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains("Customer added successfully"));
        driver.switchTo().alert().accept();
    }

    @Test
    public void anotherBankManagerTest(){
        System.out.println("add bank manager");
    }

}
