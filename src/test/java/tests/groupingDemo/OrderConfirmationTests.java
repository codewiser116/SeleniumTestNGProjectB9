package tests.groupingDemo;

import org.testng.annotations.Test;

public class OrderConfirmationTests {

    @Test (groups = {"smoke", "regression"})
    public void confirmSuccessfulOrderTest(){
        System.out.println("confirmSuccessfulOrderTest !!!!");
    }

    @Test (groups = {"regression"})
    public void confirmUnsuccessfulOrderTest(){
        System.out.println("confirm unsuccessfulOrderTest !!!!");
    }

    @Test (groups = {"smoke", "regression", "codewise"})
    public void multipleConfirmationsTest(){
        System.out.println("multiple confirmations");
    }
}
