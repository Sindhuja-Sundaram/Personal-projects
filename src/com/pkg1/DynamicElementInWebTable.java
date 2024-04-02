package com.pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElementInWebTable {

	public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sindh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       // System.setProperty("webdriver.edge.port", "56317");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the webpage containing the table
        driver.get("https://cosmocode.io/automation-practice-webtable/");

        // Locate the table element
        WebElement table = driver.findElement(By.xpath("//table[@id='countries']"));

        // Set the value you want to find in the table
        String targetValue = "Austria";

        // Loop through the rows of the table
        for (int row = 1; row <= table.findElements(By.tagName("tr")).size(); row++) {
            // Find the cell with the target value in the current row
            WebElement cell = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[" + row + "]/td[contains(text(), '" + targetValue + "')]"));

            // Check if the cell with the target value exists
            if (cell.isDisplayed()) {
                // Perform the action you want to take on the dynamic element
                // For example, click the element
                cell.click();
                System.out.print("Clicked");
                break; // Exit the loop since we found the element
            }
        }

        // Close the WebDriver
        driver.quit();
    }
}
