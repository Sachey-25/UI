package Junit.Training;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Assert {
	
	@Test
	public void testAssertions() {
		//String Object created
		String name = new String("Sachin");
		String Name = new String("Sachin");
		//String Value created
		String city = null;
		String pincode = "1234567";
		String str = "education";
		String strr = "education";
		//Integer value created
		int val = 10;
		int value = 123;
		//String list created
		String[] expectedArray= {"One","Two","Three"};
		String[] resultArray = {"One","Two","Three"};		
		//check for equality : expected and actual
		assertEquals(name,Name);
		//check for true
		assertTrue(val<value);
		//check for false
		assertFalse(val>value);
		//check for null
		assertNull(city);
		//Check for notnull
		assertNotNull(Name);
		assertNotNull(name);
		//check for same
		assertNotSame(str,strr);
		//Check for not same
		assertSame(name,Name);
		//check for a list
		assertArrayEquals(expectedArray,resultArray);
	}

}
