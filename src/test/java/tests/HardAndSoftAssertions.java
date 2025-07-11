package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssertions {

    SoftAssert softly = new SoftAssert();


    @Test
    public void method1(){
        System.out.println("This is method 1 before assertion");
        softly.assertEquals(6, 2 + 3, "failed to verify its 5");

        System.out.println("This is method 1 after assertion");
        softly.assertFalse(9 != 5);

        System.out.println("something else");
        softly.assertEquals(5, 7);
        softly.assertAll();
    }


    @Test
    public void method2(){
        System.out.println("This is method 2 before assertion");

        softly.assertTrue("apple".contains("op"), "apple verification");

        System.out.println("This is method 2 after assertion");
        softly.assertAll();

    }


    @Test
    public void method3(){
        System.out.println("This is method 3 before assertion");

        softly.assertFalse("banana".length() > 1);

        System.out.println("This is method 3 after assertion");
        softly.assertAll();

    }






}
