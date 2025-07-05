package com.seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser_LocalDriver {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//invoking browser
		//chrome-chromedriver->methods
		//firefox-firefoxdriver->methods
		//webdriver methods
		
		//steps to invoke chromedriver
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Tutorial\\Selenium\\SeleniumWebDriver\\Chrome\\133\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.8.0");
	
		driver.close();
		//driver.quit();

	}



}
