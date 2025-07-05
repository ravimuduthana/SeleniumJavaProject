package com.testngprograms;

import org.testng.IReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestlistenerImplement implements ITestListener
{
	
	public void onTestStart(ITestResult result) {
		System.out.println(" In onTestStart");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(" In onTestSuccess");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(" In onTestFailure");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(" In onTestSkipped");
	}

	public void onStart(ITestContext context) {
		System.out.println(" In onStart");
	}

	public void onFinish(ITestContext context) {
		System.out.println(" In onFinish");
	}

}
