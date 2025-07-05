package LocatorTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDandNameandclassname 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Tutorial\\Selenium\\SeleniumWebDriver\\Chrome\\133\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("ravi");
		driver.findElement(By.name("inputPassword")).sendKeys("ravi");
		driver.findElement(By.className("signInBtn")).click();
		
		

	}

}
