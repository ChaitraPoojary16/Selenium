package demoTestNG.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener {
	public void onStrat(ITestContext arg0) {
		System.out.println("Test case started");
	}
	public void onTestStrat(ITestResult arg0) {
		System.out.println(arg0.getMethod() + "Test case Started");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("My test case has passed");
	}
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Test case skipped");
	}
	public void onTestFailure(ITestResult agr0) {
		System.out.println("Test case failed");
	}
	public void onFinish(ITestResult arg0) {
		System.out.println("Test case finished");
	}
}
