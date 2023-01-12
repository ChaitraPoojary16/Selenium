package demoTestNG.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationHelper {
	@Test(timeOut=5000)
	public void addItemtoCart() {
		System.out.println("Inside addItemtoCart test case");
	}

	@Test(enabled=true)
	public void checkoutItemsFromCart() {
		Assert.assertTrue(false);
		System.out.println("inside checkoutItemsFromCart test case");
	}

	@Test(dependsOnMethods= {"checkoutItemsFromCart"})//multiple arguments also possible
	public void makePayments() {
		System.out.println("Inside makePyaments test case");
	}

	@Test
	public void payment() {
		System.out.println("Inside payment test case");
	}
}
