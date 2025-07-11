package tests;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @BeforeClass
    public void beforeClass(){
        System.out.println("THIS IS BEFORE CLASS");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("THIS IS AFTER CLASS");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("this is before method");
    }

    @AfterMethod
    public void afterMEthod(){
        System.out.println("I'm after method");
    }

    @Test
    public void testMethod1(){
        System.out.println("hello, I'm method one");
    }

    @Test
    public void testMethod2(){
        System.out.println("this is method two!");
    }

    @Test
    public void testMethod3(){
        System.out.println("this is method threeeeeee");
    }


}
