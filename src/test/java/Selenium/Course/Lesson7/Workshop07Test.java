package Selenium.Course.Lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Workshop07Test {
	
	private String testUrl = "https://suvroc.github.io/selenium-mail-course/07/workshop.html";
	WebDriver driver ;
	WebDriverWait myWaitVar;
	
	@BeforeClass
	public void initBrowser(){
		driver = new ChromeDriver();
		myWaitVar = new WebDriverWait(driver,1);
	}

	@Test
	public void ShouldSelectAnswers() throws InterruptedException{
		
	    driver.get(testUrl);

	    Select companySelectElement = new Select(driver.findElement(By.id("companySelect")));
	    Select carSelectElement = new Select(driver.findElement(By.id("carSelect")));

	    
	    
	    //TEST CODE
	    companySelectElement.selectByVisibleText("BMW");
	    
	    WebElement loader = driver.findElement(By.id("loader"));

	    while(true){
	    	try{
	    		myWaitVar.until(ExpectedConditions.visibilityOf(loader));
	    	}
	    	catch(Exception e){
	    		break;
	    	}
	    }

	    carSelectElement.selectByVisibleText("Hatch-back");

	    while(true){
	    	try{
	    		myWaitVar.until(ExpectedConditions.visibilityOf(loader));
	    	}
	    	catch(Exception e){
	    		break;
	    	}
	    }
	    
	    //TEST CODE

	    Assert.assertEquals(driver.findElements(By.className("list-group-item")).size(), 6);
		
	}	

    @AfterClass
    public void terminateBrowser(){
    	driver.quit();
    }
	
}
