package tests.dataProviderDemo;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "productData")
    public Object [][] testDataMethod(){
        return new Object[][]{
                {"apple watch", 545.11},
                {"toddler shoes", 43.4},
                {"organic banana", 2.99}
        };
    }
}
