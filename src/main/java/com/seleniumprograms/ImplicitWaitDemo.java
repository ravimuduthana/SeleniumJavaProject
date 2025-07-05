package com.seleniumprograms;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ImplicitWaitDemo 
{
	static WebDriver driver;
	@BeforeTest
	public static void LaunchApplication()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@Test
	public static void login() 
	{
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumWebDriver\\Chrome\\122\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Boolean searchflag=driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]")).isDisplayed();
		System.out.println(searchflag);
		driver.close();

		
	}

}
