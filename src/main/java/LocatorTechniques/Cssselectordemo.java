package LocatorTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cssselectordemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("ravi");
		driver.findElement(By.cssSelector("input[name=\"inputPassword\"]")).sendKeys("ravi");
		driver.findElement(By.className("signInBtn")).click();
	}

}
