package com.pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pkg1.TestCase02;

public class specificPage extends TestCase02{
	public static WebElement fifthElement= driver.findElement(By.xpath("//img[@data-image-index='5']"));
	public static WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
}
