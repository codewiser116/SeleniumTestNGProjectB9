package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Hooks {

    @BeforeTest
    public void beforeTest(){
        System.out.println("this is before TEEEEEEEST");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("THIS IS AFFFFFTERRR TESSSSST");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BEFORE SUITE");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AFTER SUITE");
    }

}
