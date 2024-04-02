package com.pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pkg1.TestCase02;

public class homePage extends TestCase02{
	public static WebElement searchBoxHomepage = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	public static WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
	public static WebElement brand_citizen = driver.findElement(By.xpath("//*[@id=\"p_89/Citizen\"]/span/a/div/label/i"));
	public static WebElement band_leather = driver.findElement(By.id("p_n_material_browse/1480907031"));
	public static WebElement display_analog = driver.findElement(By.id("p_n_feature_seven_browse-bin/1480900031"));
	public static WebElement discount = driver.findElement(By.id("p_n_pct-off-with-tax/2665400031"));
	
}
