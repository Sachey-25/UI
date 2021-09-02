import org.junit.Before;
import org.junit.Test;
import org.mockitoLearning.CalculatoreService;
import org.mockitoLearning.MathApplication;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class Mathapplicationtester {
	
	private MathApplication mathApplication;
	private CalculatoreService calcService;
	
	//Create a test MOck object
	@Before
	public void setUp() {
		mathApplication = new MathApplication();
		calcService = mock(CalculatoreService.class); //mock is been created.
		mathApplication.setCalculatoreService(calcService);
	}
	@Test
	public void testAddandSubtract() {
		//add the behavior to add numbers
		when(calcService.add(20.0, 10.0)).thenReturn(30.0);
		//add the behavior to subtract numbers
		when(calcService.subtract(20.0, 10.0)).thenReturn(10.0)
		
		//Test the functionality
		Assert.assertEquals(mathApplication.add(20.0, 10.0),30.0,0);
		
		//Test the functionality
		Assert.assertEquals(mathApplication.substract(20.0, 10.0),30.0, 0);
		
		//Verify call to calcService is made or not.
		verify(calcService).add(20.0,10.0);
		verify(calcService).substract(20.0,10.0);
	}

}
