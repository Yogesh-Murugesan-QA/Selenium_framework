package org.example.utils;

import org.openqa.selenium.WebDriver;

import java.io.FileWriter;
import java.io.IOException;

public class PageUtils {

    public static void savePageSource(WebDriver driver, String filePath) {
        String pageSource = driver.getPageSource();
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(pageSource);
            System.out.println("Page source saved to: " + filePath);
        } catch (IOException e) {
            System.err.println("Failed to write page source: " + e.getMessage());
        }
    }
}
