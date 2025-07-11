package tests.prioritizingDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrioritiesExample {

    @Test (priority = 1)
    public void loginTest(){

    }

    @Test (priority = 3)
    public void checkoutTest(){

    }

    @Test (priority = 4)
    public void deleteAccountTest(){
    }

    @Test (priority = 2, dependsOnMethods = {"deleteAccountTest", "loginTest"})
    public void restoreAccountTest(){

    }
}
