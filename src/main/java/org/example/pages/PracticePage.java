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
    //RadioButton
    @FindBy(xpath = "//input[@value='radio1']")
    private WebElement radioButton1;
    @FindBy(xpath = "//input[@value='radio2']")
    private WebElement radioButton2;
    @FindBy(xpath = "//input[@value='radio3']")
    private WebElement radioButton3;
    //CheckBox
    @FindBy(id = "checkBoxOption1")
    private WebElement option1;
    @FindBy(id = "checkBoxOption2")
    private WebElement option2;
    @FindBy(id = "checkBoxOption3")
    private WebElement option3;
    //To check Dropdown
    @FindBy(id = "dropdown-class-example")
    private WebElement dropdownElement;

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
    //Select radio button
    public void selectRadioButton1() {
        radioButton1.click();
    }
    public void selectRadioButton2() {
        radioButton2.click();
    }
    public void selectRadioButton3() {
        radioButton3.click();
    }
    //To check if radioButton is Selected
    public boolean isRadioButton1Selected() {
        return radioButton1.isSelected();
    }
    public boolean isRadioButton2Selected() {
        return radioButton2.isSelected();
    }
    public boolean isRadioButton3Selected() {
        return radioButton3.isSelected();
    }
    //Select radio button
    public void selectCheckBox1() {option1.click();}
    public void selectCheckBox2() {option2.click();}
    public void selectCheckBox3() {option3.click();}
    //To check if checkBox is Selected
    public boolean isCheckBox1Selected(){return option1.isSelected();}
    public boolean isCheckBox2Selected(){return option2.isSelected();}
    public boolean isCheckBox3Selected(){return option3.isSelected();}
    //To check Dropdown
    public WebElement getDropdownElement() {
        return dropdownElement;
    }
}
