package Selenium.Course.Lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Workshop05Test {
	
	private String testUrl = "https://suvroc.github.io/selenium-mail-course/05/workshop.html";
	WebDriver driver ;
	WebDriverWait myWaitVar;
	
	@BeforeClass
	public void initBrowser(){
		driver = new ChromeDriver();
		myWaitVar = new WebDriverWait(driver,10);
	}

	 @Test
	 public void ShouldSelectAnswers()
     {
         driver.get(testUrl);

         Select qualityElement = new Select(driver.findElement(By.id("procuctQualityElement")));
         Select supportElement = new Select(driver.findElement(By.id("supportQualityElement")));

         //TEST CODE
         
         qualityElement.selectByVisibleText("Good");
         supportElement.selectByVisibleText("Poor");

         //TEST CODE

         Assert.assertEquals(qualityElement.getAllSelectedOptions().get(0).getAttribute("value"), "good");
         Assert.assertEquals(supportElement.getAllSelectedOptions().get(0).getAttribute("value"), "poor");

     }
	
	

    @AfterClass
    public void terminateBrowser(){
    	driver.quit();
    }
	
}
