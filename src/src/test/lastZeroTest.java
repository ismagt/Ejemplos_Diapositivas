package test;

import java.security.InvalidParameterException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lastZero;

public class lastZeroTest {
	
	private int[] data = new int[3];

	@Before      // Set up - Called before every test method.
	public void setUp()
	{
		data = new int[]{0,0,0};
	}
	
	@After      // Tear down - Called after every test method.
	public void tearDown()
	{
		data = new int[]{0,0,0};
	}
	
	@Test
	public void testForNumCero()
	{
		System.out.println("Sale" + lastZero.lastZero(data));
		
	}


}
