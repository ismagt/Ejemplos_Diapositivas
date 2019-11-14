package test;

import java.findLast;
import java.lastZero;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class findLastTest {
	
	private int[] data = new int[3];
	
	@Before      // Set up - Called before every test method.
	public void setUp()
	{
		data = new int[]{1,2,3};
	}
	
	@After      // Tear down - Called after every test method.
	public void tearDown()
	{
		data = new int[]{0,0,0};
	}
	
	@Test
	public void testForNumCero()
	{
		System.out.println("Salisa: " + findLast.findLast(data, 3));
		
	}


}
