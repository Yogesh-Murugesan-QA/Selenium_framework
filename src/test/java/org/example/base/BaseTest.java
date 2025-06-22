package org.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;
    protected static final String BASE_URL = "https://rahulshettyacademy.com/AutomationPractice/";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);  // ✅ Open URL once
    }

    public WebDriver getDriver() {
        return driver;
    }

//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();  // ✅ Close browser after all tests
//        }
//    }
}
