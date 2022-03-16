package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// Parameterization means sending input data from xml file to program file before running the testNG file.
	
public class ParameterizationExample {
	
	@Test
	@Parameters("Name")
	public void printName(String name) {
		System.out.println("My Name is :"+ name);
	}

}
  