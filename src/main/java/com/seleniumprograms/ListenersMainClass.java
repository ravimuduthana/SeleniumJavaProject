package com.seleniumprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListenersMainClass
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		ListenersDemo lis=new ListenersDemo();
		
		WebDriver EventDriver= new EventFiringDecorator(lis).decorate(driver);
		EventDriver.get("https://www.flipkart.com/");
		
		

	}

}
