package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssersionsExample {
	
	String name = "Naviksha";
	boolean value = true;
	@Test
	public void CheckEquals() {
		/*
		 * if(name.equals("venkat")){ System.out.println("Name is Equal"); } else {
		 * System.out.println("Not Equal"); }
		 */
		
		// Assert.assertEquals(name, "Naviksha");                           // assersions are mostly used for developers doing unittesting purposes.
		//Assert.assertNotEquals(name, "naviksha");
		Assert.assertTrue(value, "This should be true");
		
	}
	
}
