package tests.parallelTestDemo;

import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginMethod1() throws InterruptedException {
        System.out.println("this is login method 1");
        Thread.sleep(3000);
    }

    @Test
    public void loginMethod2() throws InterruptedException {
        System.out.println("this is login method 1");
        Thread.sleep(3000);
    }


    @Test
    public void loginMethod3() throws InterruptedException {
        System.out.println("this is login method 1");
        Thread.sleep(4000);
    }





}
