package org.mockitoLearning;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.doThrow;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoRunner.class)
public class MathApplicationTester {		
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

}
	
	//Identity the class ---> @TestSubject which is used to identity class
	/*@TestSubject
	MathApplication mathApplication = new MathApplication(); //class mock object
	
	//@Mock annotation is used to create the mock object to be injected.
	@Mock
	CalculatoreService calcService;
	
	@Test(expected=RuntimeException.class)
	public void testAdd() {
		//add the behavior to throw exception
		//doThrow().when()
		doThrow(new RuntimeException("Add Operation is not implemented/invalid"))
		.when(calcService).add(10.0,20.0);	
		//test the add functionality
		Assert.assertEquals(MathApplication.substract(10.0,20.0),30.0);	
	}	
}*/
