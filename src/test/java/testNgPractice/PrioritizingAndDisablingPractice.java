package testNgPractice;

import org.testng.annotations.Test;

public class PrioritizingAndDisablingPractice {
	// As per priority value method will execute and if 2 method have same priority
	// value then method will execute as per alphabetical order.
	@Test(priority = 0)
	public void testOne() {
		System.out.println("This is Test1.....");
	}

	@Test(priority = -1)
	public void testTwo() {
		System.out.println("This is Test2.....");
	}

	@Test(priority = 1)
	public void testThree() {
		System.out.println("This is Test3.....");
	}

	@Test
	public void testFour() {
		System.out.println("This is Test4.....");
	}

	@Test(priority = 1, enabled = false)
	public void testFive() {
		System.out.println("This is Test5.....");
	}

	@Test(priority = -1)
	public void testSix() {
		System.out.println("This is Test6.....");
	}
}
