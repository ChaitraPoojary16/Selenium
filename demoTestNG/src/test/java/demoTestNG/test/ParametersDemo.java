package demoTestNG.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	@Parameters({ "url" })
	@Test
	public void setLanguage(String envUrl) {
		System.out.println("Inside set lanugage test case");
		System.out.println(envUrl);
	}

	@Parameters({ "url", "username", "password" })
	@Test
	public void editProfile(String envUrl, String usn, String pwd) {
		System.out.println("Inside editProfile test case");
		System.out.println("url= " + envUrl);
		System.out.println("username= " + usn);
		System.out.println("password =" + pwd);

	}
}
