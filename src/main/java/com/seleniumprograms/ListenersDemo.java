package com.seleniumprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class ListenersDemo implements WebDriverListener
{

	public void afterGet(WebDriver driver, String url)
	{
		System.out.println("Before navigating to URL " + url);
	}

	public void beforeGet(WebDriver driver, String url)
	{
		System.out.println("After navigating to URL " +url);
	}

	

}
