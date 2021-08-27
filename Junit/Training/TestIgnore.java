package Junit.Training;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestIgnore {
	public String message="Sachin, I am Junit";
	
	//Create an  object
	Ignore ignore = new Ignore(message);
	
	@Test
	public void printMessage() {
		System.out.println("JUnit message is printing");
		assertEquals(message, ignore.printMessage());
	}
	@Test
	public void Message() {
		message="Hi!"+message;
		System.out.println("JUnit Hi message is printing");
		assertEquals(message,ignore.Message());
	}
	

}
