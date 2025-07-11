package tests.dataProviderDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Driver;

public class SearchTests {


    @Test(dataProvider = "productData", dataProviderClass = TestData.class)
    public void searchTest1(String productName, Double price){
        System.out.println("product: " + productName);
        System.out.println("price: " + price);
        System.out.println("=====================");
    }


}
