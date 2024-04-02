package com.pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
public class TestCase02 {

	public static WebDriver driver;
	String wristWatchName;
	@BeforeClass
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sindh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	
	  @Test(priority=2) 
	  public void searchWristWatches() {
		  com.pkg2.homePage.searchBoxHomepage.sendKeys(utilities.pageFactory.searchItem);
			com.pkg2.homePage.searchButton.click();
	  }
	 
	@Test(priority=3)
	public void applyFilters() throws InterruptedException
	{
		
		//brand name: Titan not available. Citizen is used
		com.pkg2.homePage.brand_citizen.click();
		Thread.sleep(3000);
		//band material = leather
		com.pkg2.homePage.band_leather.click();
		Thread.sleep(3000);
		//display = analog
		com.pkg2.homePage.display_analog.click();
		Thread.sleep(3000);
		//discount = 25% off or more
		com.pkg2.homePage.discount.click();
		Thread.sleep(3000);
		
	}
	@Test(priority=3)
	public void oprnFifthSearchResult()
	{
		com.pkg2.specificPage.fifthElement.click();
		wristWatchName=com.pkg2.specificPage.fifthElement.getText();
	}
	
	@Test(priority=4)
	public void addToCart()
	{
		com.pkg2.specificPage.addToCart.click();
	}
	
	@Test(priority=5)
	public void verifyItemAddedTocart()
	{
		String valueAddedToCart = driver.findElement(By.xpath("//img[@data-csa-c-id='h3u2oi-2xuep0-7ttcx5-6hk743']")).getText();
		
		if(valueAddedToCart.equalsIgnoreCase(wristWatchName))
			System.out.println("Added correctly");
		else
			System.out.println("Added Wrongly");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();

	}
}

	
