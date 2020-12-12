package com.qa.maintests;

import com.qa.base.DriverFactory;
import com.qa.pages.GoogleHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class GoogleTest {

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void testGoogle(){

        GoogleHomePage googleHomePage = new GoogleHomePage();
        googleHomePage.googleSearch("GoogleTest automation using selenium");
        Assert.assertTrue(DriverFactory.getDriver().getCurrentUrl().contains("google"));
    }

    @After
    public void tearDown(){
        DriverFactory.getDriver().quit();
    }
}
