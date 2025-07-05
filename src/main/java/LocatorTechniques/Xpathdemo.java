package LocatorTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathdemo {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("ravi");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ravi");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("88888888");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).clear();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("88888888");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("ravi");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("ravi");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		//driver.close();
	}

}
