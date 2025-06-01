package org.example.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePage {
    private WebDriver driver;

    // ✅ Define web elements using @FindBy
    @FindBy(id = "name")
    private WebElement nameInputField;

    @FindBy(id = "alertbtn")
    private WebElement alertButton;

    @FindBy(xpath = "//input[@value='radio1']")
    private WebElement radioButton1;

    @FindBy(xpath = "//input[@value='radio2']")
    private WebElement radioButton2;

    @FindBy(xpath = "//input[@value='radio3']")
    private WebElement radioButton3;

    // ✅ Constructor that initializes the elements
    public PracticePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterName(String name) {
        nameInputField.sendKeys(name);
    }

    public void clickAlertButton() {
        alertButton.click();
    }

    public String getAlertText() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void selectRadioButton1() {
        radioButton1.click();
    }

    public void selectRadioButton2() {
        radioButton2.click();
    }

    public void selectRadioButton3() {
        radioButton3.click();
    }

    public boolean isRadioButton1Selected() {
        return radioButton1.isSelected();
    }

    public boolean isRadioButton2Selected() {
        return radioButton2.isSelected();
    }

    public boolean isRadioButton3Selected() {
        return radioButton3.isSelected();
    }
}
