package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {
	@Test(enabled = true)
	public void tenth() {
		System.out.println("Tenth ");
	}
	
	@Test(dependsOnMethods = "tenth")
	public void twelth() {
		System.out.println("Twelth ");
	}
	
	@Test(priority = 2, enabled = false)      // to skip test case
	public void diploma() {
		System.out.println("diploma");
	} 
	
	@Test(dependsOnMethods = "twelth")
	public void engineering() {
		System.out.println("Engineering");
	}
}
