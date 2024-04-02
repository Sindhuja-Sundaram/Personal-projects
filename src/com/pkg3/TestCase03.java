package com.pkg3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase03 {
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sindh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://imgur.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	public void createANewPost()
	{
		com.pkg4.homePageimgur.createPostButton.click();
	}
	
	@Test(priority=2)
	
	public void choosePhotoOrVideo()
	{
		com.pkg4.homePageimgur.choosePhotoVideoButton.sendKeys("");
	}
	
	@Test(priority=3)
	public void verifyUpload()
	{
		if(driver.getCurrentUrl().equalsIgnoreCase("https://imgur.com/a/pYY29bA"))
			System.out.println("Uploaded");
		else
			System.out.println("Not Uploaded");
	}
	
	@Test
	public void copyLink()
	{
		com.pkg4.homePageimgur.copyLink.click();
		
	}
	
	@Test
	public void verifyLinkCopied()
	{
		String copiedURL = Keys.CONTROL+"p";
        driver.get(copiedURL);
	}
	
	@Test
	public void verifyImageOpens()
	{
		Assert.assertTrue(com.pkg4.homePageimgur.imageIsDisplayed.isDisplayed());
	}
	@AfterClass
	public void tearDown() {
		driver.quit();

	}
}
