package Junit.Training.Sample;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SuiteTest_one {	
    public String message = "Programming with Junit";							
    //Create an object to store data
    JUnitMessage junitMessage = new JUnitMessage(message);			

    @Test(expected = ArithmeticException.class)					
    public void testJUnitMessage() {					

        System.out.println("Junit Message is printing ");					
        junitMessage.PrintMessage();	
    }	
    @Test		
    public void testJUnitHiMessage() {					
        message = "Hi!" + message;							
        System.out.println("Junit Hi Message is printing ");					
        //Check the condition whether both the strings are 
		//Equal or no.
        assertEquals(message, junitMessage.PrintMessage());					
        System.out.println("Suite Test_two is successful " + message);							
    }		
}
