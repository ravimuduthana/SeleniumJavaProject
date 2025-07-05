package com.seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser_Webdrivermanager {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//invoking browser
		//chrome-chromedriver->methods
		//firefox-firefoxdriver->methods
		//webdriver methods
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.8.0");
	

	}



}
