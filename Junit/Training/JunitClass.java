package Junit.Training;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class JunitClass {
	@Test
	public void setup() {
		String str = "This is my first JUnit program"; //equal or no 
		assertEquals("Junit Learings",str); //Comparing
	}
}
