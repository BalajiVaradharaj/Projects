package testNG;

import org.testng.annotations.Test;                                // SETTING PRIORITY TO THE TEST CASE

public class DriveACar {
	@Test(priority=0)   
	public void StartTheCar() {
		System.out.println("starting the car");
	}
	
	@Test(priority=1)
	public void putFirstGear() {
		System.out.println("starting the car");
	}
	 
	@Test(priority=5,enabled = false)                             // SKIPING the test case 
	public void turnOnMusic() {
		System.out.println("ON MUSIC");
	}
	
	@Test(priority=2)
	public void putSecondGear() {
		System.out.println("starting the car");
	}
	
	@Test(priority=3)
	public void putThirdGear() {
		System.out.println("starting the car"); 
	}
	
	@Test(priority=4)
	public void putFourthGear() {
		System.out.println("starting the car");
	}
}
