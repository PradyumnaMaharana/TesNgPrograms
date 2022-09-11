package testNgPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationPractice {
	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser", "url" })
	public void setup(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(url);
	}
	@Test
	public void test1() {
		System.out.println(driver.getTitle());
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
