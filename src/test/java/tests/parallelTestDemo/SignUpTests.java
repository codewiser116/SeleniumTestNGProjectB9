package tests.parallelTestDemo;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignUpTests {

    @Test
    public void signUpMethod1() throws InterruptedException {
        System.out.println("this is signUp method 1");
        Thread.sleep(5000);
    }

    @Test
    public void signUpMethod2() throws InterruptedException {
        System.out.println("this is signUp method 1");
        Thread.sleep(5000);
    }


    @Test
    public void signUpMethod3() throws InterruptedException {
        System.out.println("this is signUp method 1");
    }

}
