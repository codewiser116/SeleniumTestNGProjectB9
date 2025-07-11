package tests;

import org.testng.annotations.DataProvider;

public class DataClass {

    @DataProvider(name = "customerData")
    public Object [][] testData(){
        return new Object[][]{
                {"Bena", "Baialieva", "13123"},
                {"Sarah", "Connor", "12312"},
                {"John", "Doe", "35321"}
        };
    }


    @DataProvider(name = "withdrawalTest")
    public Object [][] testDataForWithdrawal(){
        return new Object[][]{
                {"Hi, this is wrong"},
                {"Do not withdraw"},
                {"Out of balance"}
        };
    }


}
