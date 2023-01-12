package demoTestNG.test2;

import org.testng.annotations.Test;

public class PaymentsTest {
@Test
public void upiPayment() {
	System.out.println("Inside payments");
}
@Test
public void netBanking() {
System.out.println("Inside Net Banking");	
}
@Test
public void creditCardPayment() {
	System.out.println("Inside Credit card Payment");
}
}
