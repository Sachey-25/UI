package Junit.Training;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class DemoClass {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JunitClass.class); //Checking the test
		//using the class name : JunitClass
		//Looping into the data and check whether both the strings are equal or not
		for(Failure failure : result.getFailures())
		{
			System.out.println(failure.toString());
		}
		System.out.println("Result = " + result.wasSuccessful());
		}
}
