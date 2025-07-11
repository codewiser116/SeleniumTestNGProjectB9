package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomerLoginPage;
import pages.HomePage;
import utils.BrowserUtils;
import utils.ConfigurationReader;
import utils.Driver;

import java.time.Duration;

public class CustomerLoginTests {

    @Test (groups = "smoke")
    public void verifyCustomerLoggedIn() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("loginUrl"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        HomePage homePage = new HomePage(driver);
        homePage.customerLoginBtn.click();

        CustomerLoginPage customerLoginPage = new CustomerLoginPage(driver);
        customerLoginPage.login(ConfigurationReader.getProperty("customer1"));

        Thread.sleep(1000);

        String expectedUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account";
        String actualUrl = driver.getCurrentUrl();

        BrowserUtils.takeScreenshot(driver, "loginVerification");
        Assert.assertEquals(actualUrl, expectedUrl);

        /*
        add code to verify the newly added customer is in the list
         */
    }



}
