package Junit.Training.Sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AruthmeticTest {
	
	public String message = "Sachin";
	
	JUnitMessage junitMessage = new JUnitMessage(message);
	
	@Test(expected = ArithmeticException.class)
	public void testJUnitMessage() {
		System.out.println("JUnit message is printing");
		junitMessage.PrintMessage();
	}
	
	@Test
	public void testJUnitMessage1() {
		message ="Hi!"+message;
		System.out.println("Junit Hi message is printing");
		assertEquals(message, junitMessage.PrintMessage());
	}

}
