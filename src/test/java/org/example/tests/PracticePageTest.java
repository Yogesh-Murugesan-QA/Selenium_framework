package org.example.tests;

import org.example.base.BaseTest;
import org.example.utils.DropdownUtils;
import org.example.utils.PageUtils;
import org.example.pages.PracticePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class PracticePageTest extends BaseTest {
    private static final String BASE_URL = "https://rahulshettyacademy.com/AutomationPractice/";
    @Test
    public void testAlertHandling() throws InterruptedException {
      //  driver.get(BASE_URL);
        PracticePage page = new PracticePage(driver);
        page.enterName("YOGI");
        page.clickAlertButton();
        Thread.sleep(2000);
        WebDriverWait wait= new  WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        String alertText = page.getAlertText();

        System.out.println("Alert Text: " + alertText);
        Assert.assertTrue(alertText.contains("YOGI"), "Alert text did not contain expected name.");
        page.acceptAlert();
    }
    @Test
    public void testRadioButtons() throws InterruptedException, IOException {
    //    driver.get(BASE_URL);
        PracticePage page = new PracticePage(driver);

        // Select Radio Button 1 and verify
        page.selectRadioButton1();
        Assert.assertTrue(page.isRadioButton1Selected(), "Radio Button 1 should be selected");
        Assert.assertFalse(page.isRadioButton2Selected(), "Radio Button 2 should NOT be selected");
        Assert.assertFalse(page.isRadioButton3Selected(), "Radio Button 3 should NOT be selected");

        // Select Radio Button 2 and verify
        page.selectRadioButton2();
        Assert.assertTrue(page.isRadioButton2Selected(), "Radio Button 2 should be selected");
        Assert.assertFalse(page.isRadioButton1Selected(), "Radio Button 1 should NOT be selected");
        Assert.assertFalse(page.isRadioButton3Selected(), "Radio Button 3 should NOT be selected");

        // Select Radio Button 3 and verify
        page.selectRadioButton3();
        Assert.assertTrue(page.isRadioButton3Selected(), "Radio Button 3 should be selected");
        Assert.assertFalse(page.isRadioButton1Selected(), "Radio Button 1 should NOT be selected");
        Assert.assertFalse(page.isRadioButton2Selected(), "Radio Button 2 should NOT be selected");

    }
    @Test
    public void printPageSource(){
        PageUtils.savePageSource(driver, "pageSource.html");
    }
    @Test
    public void testCheckbox() {
        PracticePage page = new PracticePage(driver);
        page.selectCheckBox1();
        Assert.assertTrue(page.isCheckBox1Selected(), "CheckBox 1 should be selected");
        page.selectCheckBox2();
        Assert.assertTrue(page.isCheckBox2Selected(), "CheckBox 2  should be selected");
        page.selectCheckBox3();
        Assert.assertTrue(page.isCheckBox3Selected(), "CheckBox 3  should be selected");
    }
    @Test
    public void testDropdown() {
        PracticePage page = new PracticePage(driver);
        DropdownUtils.selectByIndex(page.getDropdownElement(), 2);
    }
}

