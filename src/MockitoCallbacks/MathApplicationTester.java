package MockitoCallbacks;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.inOrder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {
	
	private MathApplication mathApplication;
	private CalculatoreService calcService;

	@Before
	public void setUp() {
		mathApplication = new MathApplication();
		calcService = mock(CalculatoreService.class); //mock is been created.
		mathApplication.setCalculatoreService(calcService);
	}
	@Test
	public void testAdd() {
		//Implement the callback mechanism
		//before the add the behavior of method -- add()
		when(calcService.add(25.0,25.0)).thenAnswer(new Answer<Double>() {
			@Override
			public Double answer(InvocationOnMock invocation) throws Throwable{
				//get the arguments passed to mock
				Object[] args = invocation.getArguments();
				//get the mock - test created
				Object mock=invocation.getMock();
				///return the result
				return 50.0;
			}
		});
		
		//Test the functionality
		Assert.assertEquals(mathApplication.add(25.0, 25.0),50.0,0);
	}

}
