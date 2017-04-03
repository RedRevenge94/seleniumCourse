package Selenium.Course.Lesson6;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Workshop06Test {
	
	private String testUrl = "https://suvroc.github.io/selenium-mail-course/06/workshop.html";
	WebDriverWait myWaitVar;

	@Test
	public void ShouldTestOnMobile() {
		
		// TEST CODE

		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Samsung Galaxy S4");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		WebDriver driver = new ChromeDriver(capabilities);

		// TEST CODE

		driver.get(testUrl);

		WebElement menu = driver.findElement(By.className("menu"));
		WebElement content = driver.findElement(By.className("content"));
		WebElement advert = driver.findElement(By.className("advert"));

		Assert.assertEquals(menu.getTagName(), "div");
		Assert.assertTrue(menu.isDisplayed());
		Assert.assertEquals(content.getTagName(), "div");
		Assert.assertTrue(content.isDisplayed());
		Assert.assertEquals(advert.getTagName(), "div");
		Assert.assertTrue(advert.isDisplayed());

		driver.quit();
	}

	@Test
	public void ShouldTestOnDesktop() {
		
		// TEST CODE

		WebDriver driver = new ChromeDriver();

		// TEST CODE

		driver.get(testUrl);

		WebElement menu = driver.findElement(By.className("menu"));
		WebElement content = driver.findElement(By.className("content"));
		WebElement advert = driver.findElement(By.className("advert"));

		Assert.assertEquals(menu.getTagName(), "div");
		Assert.assertTrue(menu.isDisplayed());
		Assert.assertEquals(content.getTagName(), "div");
		Assert.assertTrue(content.isDisplayed());
		Assert.assertEquals(advert.getTagName(), "div");
		Assert.assertTrue(advert.isDisplayed());

		driver.quit();
	}
	
}
