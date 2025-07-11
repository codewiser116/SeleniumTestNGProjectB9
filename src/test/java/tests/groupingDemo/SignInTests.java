package tests.groupingDemo;

import org.testng.annotations.Test;

public class SignInTests {

    @Test (groups = {"smoke"})
    public void succesfulSignIn(){
        System.out.println("successful sign in !");
    }

    @Test
    public void unsuccesfulSignIn(){
        System.out.println("unsuccessful sign in !");
    }
}
