package java;

import java.security.InvalidParameterException;

public class countPositive {
	public static int countPositive (int[] x)
	 {
	 int count = 0;

	 for (int i=0; i < x.length; i++)
	 {
	 if (x[i] >= 0)
	 {
	 count++;
	 }
	 }
	 return count;
	 }
}
