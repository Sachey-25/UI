package MockitoSpying;

import static org.mockito.Mockito.spy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import MockitoCallbacks.CalculatoreService;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {
	
   private MathApplication mathApplication;
   private CalculatorService calcService;

   @Before
   public void setUp(){
      mathApplication = new MathApplication();
      Calculator calculator = new Calculator();
      calcService = spy(calculator);
      mathApplication.setCalculatorService(calcService);	     
   }

   @Test
   public void testAdd(){

      //perform operation on real object
      //test the add functionality
      Assert.assertEquals(mathApplication.add(20.0, 10.0),30.0,0);
   }

   class Calculator implements CalculatoreService {
      public double add(double input_one, double input_two) {
         return input_one + input_two;
      }

      public double subtract(double input_one, double input_two) {
         throw new UnsupportedOperationException("Method not implemented yet!");
      }

      public double multiply(double input_one, double input_two) {
         throw new UnsupportedOperationException("Method not implemented yet!");
      }

      public double divide(double input_one, double input_two) {
         throw new UnsupportedOperationException("Method not implemented yet!");
      }
   }
}
