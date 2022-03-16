package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationHierarchyExample {
  @Test
  public void Test() {
	  System.out.println("Im Test");
  }
  
  @Test
  public void Test2() {
	  System.out.println("Im Test2");
  }
  
  @Test
  public void Test3() {
	  System.out.println("Im Test3");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Im BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Im AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Im BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Im AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Im BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Im AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Im BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Im AfterSuite");
  }

}
