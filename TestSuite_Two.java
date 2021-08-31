package Junit.Training.Sample;

import org.junit.Assert;
import org.junit.Test;

public class TestSuite_Two {
	@Test
	public void createAndSetName() {
		String expected = "Y";
		String actual = "Y";		
		Assert.assertEquals(expected, actual);
		System.out.println("SuiteTest_One is Successful" + actual);
	}
}
