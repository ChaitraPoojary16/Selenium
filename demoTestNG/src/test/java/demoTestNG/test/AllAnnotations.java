package demoTestNG.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
	@BeforeSuite
	public void create() {
		System.out.println("Inside @BeforeSuite");
	}

	@BeforeTest
	public void insert() {
		System.out.println("Inside @BeforeTest");
	}

	@BeforeClass
	public void update() {
		System.out.println("Inside @BeforeClass");
	}

	@BeforeMethod
	public void select() {
		System.out.println("Inside @BeforeMethod");
	}

	@Test
	public void testCase2() {
		System.out.println("Inside Testcase2");
	}

	@AfterMethod
	public void homePage() {
		System.out.println("Inside homepage test case");
	}

	@AfterClass
	public void addCart() {
		System.out.println("Inside addcart test case");

	}

	@AfterTest
	public void payment() {
		System.out.println("Inside Payemnt test case");
	}

	@AfterSuite
	public void logout() {
		System.out.println("inside logout test case");
	}
}
