package testNgPractice;

import org.testng.annotations.Test;

public class GroupingPractice {
	//If we want to exclude Sanity for example then add '<exclude name="Sanity">' in the xml file
	@Test(groups = { "Sanity" })
	public void test1() {
		System.out.println("This is test1.....");
	}

	@Test(groups = { "Regression" })
	public void test2() {
		System.out.println("This is test2.....");
	}

	@Test(groups = { "Sanity", "Regression" })
	public void test3() {
		System.out.println("This is test3.....");
	}
}
