package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Optional: Set path explicitly if chromedriver is NOT in your PATH
        // System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println("Page Title: " + driver.getTitle());
        WebElement alertname = driver.findElement(By.xpath("//input[@id='name']"));
        alertname.sendKeys("YOGI");
        WebElement alertButton = driver.findElement(By.xpath("//input[@id='alertbtn']"));
        alertButton.click();// driver.quit();
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText());
        Thread.sleep(3000);
        alert.accept();
        driver.quit();
    }
}
