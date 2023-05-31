package org.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.example.Man;
import dataproviders.TestDataProvider;

public class WomanTests {
    @DataProvider(name = "womanData", parallel = true)
    public Object[][] womanData() {
        return TestDataProvider.womanData();
    }

    @Test(dataProvider = "womanData")
    public void testIsRetired(String firstName, String lastName, int age, Man partner, String expectedLastName) {
        Woman woman = new Woman(firstName, lastName, age);
        woman.setPartner(partner);
        Assert.assertEquals(woman.isRetired(), age >= 60);
    }

    @Test(dataProvider = "womanData")
    public void testGetLastName(String firstName, String lastName, int age, Man partner, String expectedLastName) {
        Woman woman = new Woman(firstName, lastName, age);
        woman.setPartner(partner);
        Assert.assertEquals(woman.getLastName(), expectedLastName);
    }
}
