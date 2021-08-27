package Junit.Training;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunningAsserts {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Assert.class);
		for(Failure unsuccess :result.getFailures());
		{
			System.out.println(unsuccess.toString());
		}
		System.out.println("Test cases resulted " + result.wasSuccessful());

	}

}
