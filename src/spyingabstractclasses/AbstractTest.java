package spyingabstractclasses;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class AbstractTest {
	
	@Test
	public void testing_usingSpy() {
		Abstract_class abscls = Mockito.spy(Abstract_class.class);
		
		String result = abscls.methodUnderTest();
		Assert.assertEquals("Sachin", result);
	}

}
