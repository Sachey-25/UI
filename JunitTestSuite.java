package Junit.Training.Sample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MyFirstClass.class, MySecondClass.class })

public class JunitTestSuite {
	
	public void output() {
		System.out.println("Hello to the world from JUnit TestSuite");		
	}
}
