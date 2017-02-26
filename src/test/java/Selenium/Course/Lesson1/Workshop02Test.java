package Selenium.Course.Lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Workshop02Test {
	
	private String testUrl = "https://suvroc.github.io/selenium-mail-course/02/workshop.html";
	WebDriver driver ;
	WebDriverWait myWaitVar;
	
	@BeforeTest
	public void initBrowser(){
		driver = new ChromeDriver();
		myWaitVar = new WebDriverWait(driver,10);
	}
	
	@Test
	public void ShouldTestWorkshop2Page(){
		
	    driver.get(testUrl);
	    String name = "Test name";
        String comment = "Test comment";
	    WebElement nameResult = null,
	    		commentResult = null;
	    
	    //Code 
	    WebElement nameTxt = driver.findElement(By.id("taskNameInput"));
	    WebElement commentTxt = driver.findElement(By.id("commentInput"));
	    WebElement showDetalisButton = driver.findElement(By.id("showDetailsButton"));
	    
	    nameTxt.clear();
	    nameTxt.sendKeys(name);
	    showDetalisButton.click();
	    commentTxt.clear();
	    commentTxt.sendKeys(comment);
	    commentTxt.sendKeys(Keys.ENTER);
	    myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("savedTaskName")));
	    
	    
	    //Code
	    
	    nameResult = driver.findElement(By.id("savedTaskName"));
        commentResult = driver.findElement(By.id("savedComment"));

        Assert.assertNotNull(nameResult);
        Assert.assertEquals(nameResult.getTagName(), "div");
        Assert.assertEquals(nameResult.getText(), name);
        Assert.assertTrue(nameResult.isDisplayed());

        Assert.assertNotNull(commentResult);
        Assert.assertEquals(commentResult.getTagName(), "div");
        Assert.assertEquals(commentResult.getText(), comment);
        Assert.assertTrue(nameResult.isDisplayed());
	 }
    
    @AfterTest
    public void terminateBrowser(){
    	driver.quit();
    }
	
}
