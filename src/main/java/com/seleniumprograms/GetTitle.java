package com.seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Tutorial\\Selenium\\SeleniumWebDriver\\Chrome\\133\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.8.0");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("Maven Repository: io.github.bonigarcia » webdrivermanager » 5.8.0"))
		{
			System.out.println("Title matched");
		}
		else
		{
			System.out.println("title not matched");
		}
		driver.close();
		

	}

}
