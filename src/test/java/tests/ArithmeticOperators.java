package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticOperators {


    public int getSum(int a, int b){
        return a + b;
    }


    @Test
    public void test1(){
        Assert.assertEquals(getSum(4, 5), 9);
    }

    @Test
    public void test2(){
        Assert.assertEquals(getSum(-4, 5), 1);
    }

    @Test
    public void test3(){
        Assert.assertEquals(getSum(-40, -25), -65);
    }

    @Test
    public void test4(){
        Assert.assertEquals(getSum(0, 0), -65);
    }

    @Test
    public void maximumCapacity(){
        Assert.assertEquals(getSum(100000000, 100000000), -65);
    }



}
