package Junit.Training;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotations {
	
	private ArrayList<String> List;
	
	@BeforeClass
	public static void method_BeforeClass() {
		System.out.println("Using @BeforeClass annotation, Executed"
				+ "before all test cases");
	}
	@Before
	public void method_Before() {
		List = new ArrayList<String>();
		System.out.println("Using @Before annotation, Executed"
				+"before test cases");
	}
	@AfterClass
	public static void method_AfterClass() {
		System.out.println("Using @AfteraClass annotation, Executed"
				+"after test cases");
		
	}
	@Test
	public void method_Test() {
		//List.add("Sachin"); // List has a data called - "Sachin"
		//Go and check for the JUnit to perform 
		//Before tests :-> I want to check the given 
		//list is empty or no.
		assertFalse(List.isEmpty());
		assertEquals(1,List.size());		
	}
	@After
	public void method_After() {
		System.out.println("Using @After, Executed"
				+"After test cases");
	}
	@Ignore
	public void method_Ignore() {
		System.out.println("Using @Ignore, this exection "
				+ "is ignored");
	}
}
