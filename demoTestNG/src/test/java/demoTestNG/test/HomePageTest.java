package demoTestNG.test;

import org.testng.annotations.Test;

public class HomePageTest {
	@Test(groups = { "sanity" })
	public void HomeTest() {
		System.out.println("Inside home test case");
	}

	@Test
	public void cartTest() {
		System.out.println("Inside cart test case");
	}
}
