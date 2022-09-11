package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {

	// This will execute before the main test starts i.e @Test
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Starts Test..." + result.getName());
	}

	// This will execute when a test is success
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Passed Test..." + result.getName());
	}

	// This will execute when a test is failure
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Failed Test..." + result.getName());
	}

	// This will execute when a test is skipped
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Skipped Test..." + result.getName());
	}

	// This will execute before starting of Test set/batch
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Starts Test Executing..." + context.getName());
	}

	// This will execute after finishing of Test set/batch
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Finish Test Executing..." + context.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}

}
