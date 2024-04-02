package com.pkg4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pkg3.TestCase03;

public class homePageimgur extends TestCase03{
	
public static final WebElement createPostButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[1]/div[2]/div[3]/a[1]/span"));
public static final WebElement choosePhotoVideoButton =  driver.findElement(By.xpath("//label[@class='PopUpActions-filePicker']"));
public static final WebElement copyLink= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[4]/div[1]/div/div[2]/div[1]/div[1]/button/span"));
public static final WebElement imageIsDisplayed = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div/div/img"));

}
