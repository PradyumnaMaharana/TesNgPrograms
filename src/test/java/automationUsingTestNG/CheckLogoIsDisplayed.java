package automationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheckLogoIsDisplayed {
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

	@Test(priority = 1)
	public void logoTest() {
		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the page");
		System.out.println("..1..");
	}

	@Test(priority = 1)
	public void homePageTitle() {
		String title = driver.getTitle();
		Assert.assertEquals("OrangeHRM", title, "Title not matched");
		System.out.println("..2..");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
