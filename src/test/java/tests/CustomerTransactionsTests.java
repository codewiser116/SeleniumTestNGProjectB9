package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CustomerLoginPage;
import pages.CustomerMainPage;
import pages.HomePage;
import utils.ConfigurationReader;
import utils.Driver;

import java.time.Duration;

public class CustomerTransactionsTests {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage(driver);
    CustomerLoginPage customerLoginPage = new CustomerLoginPage(driver);
    CustomerMainPage customerMainPage = new CustomerMainPage(driver);

    @BeforeMethod
    public void setUpAndLogin(){
        driver.get(ConfigurationReader.getProperty("loginUrl"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        homePage.customerLoginBtn.click();
        customerLoginPage.login(ConfigurationReader.getProperty("customer1"));
    }

    @Test (groups = "smoke")
    public void testDeposits() throws InterruptedException {
        /*
        1. go to website
        2. login
        3. check balance, for ex: 100
        4. deposit 200
        5. check balance is 300
         */

        double balanceBeforeDeposit = customerMainPage.getCurrentBalance();
        double depositAmount = 100;
        customerMainPage.depositMoney(depositAmount);
        Thread.sleep(1000);
        double newBalance = customerMainPage.getCurrentBalance();
        Assert.assertEquals(newBalance, balanceBeforeDeposit + depositAmount);
    }

    @Test
    public void testWithdrawals() throws InterruptedException {
        customerMainPage.depositMoney(500); // 500
        double balanceBeforeWithdrawal = customerMainPage.getCurrentBalance();
        double withdrawalAmount = 100; // 400
        customerMainPage.withdrawMoney(withdrawalAmount);
        Thread.sleep(1000);
        double newBalance = customerMainPage.getCurrentBalance();
        Assert.assertEquals(newBalance, balanceBeforeWithdrawal - withdrawalAmount);

    }

    @Test (dataProvider = "withdrawalTest", dataProviderClass = DataClass.class)
    public void withdrawMoreMoneyThanBalance(String message){
        /*
        withdraw more money than the balance
        verify message appeared:
        Transaction Failed. You can not withdraw amount more than the balance.
         */
        System.out.println("Hello, this is withdraw test");
        System.out.println(message);
    }



}
