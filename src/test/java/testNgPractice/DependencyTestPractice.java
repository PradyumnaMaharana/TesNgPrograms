package testNgPractice;

import org.testng.annotations.Test;

public class DependencyTestPractice {
	// As shown below all methods are internally dependent on each other.
	// As parkCar method is true for alwaysRun then if also other method fails this
	// will always execute.
	@Test
	public void startCar() {
		System.out.println("Car Started.....");
	}

	@Test(dependsOnMethods = { "startCar" })
	public void driveCar() {
		System.out.println("Car Driving.....");
	}

	@Test(dependsOnMethods = { "driveCar" })
	public void stopCar() {
		System.out.println("Car Stopping.....");
	}

	@Test(dependsOnMethods = { "driveCar", "stopCar" }, alwaysRun = true)
	public void parkCar() {
		System.out.println("Car Parking.....");
	}
}
