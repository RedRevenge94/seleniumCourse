package Selenium.Course.Lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Workshop01Test {
	
	private String testUrl = "https://suvroc.github.io/selenium-mail-course/01/workshop.html";
	WebDriver driver ;
	
	@BeforeTest
	public void initBrowser(){
		driver = new ChromeDriver();
	}
	
	@Test
	public void ShouldTestFirstName(){
		
	    driver.get(testUrl);
	    String value = "";
	    WebElement element = null;
	    
	    //Code 
	    element = driver.findElement(By.name("firstName"));
	    value = element.getAttribute("value");
	    //Code

	    Assert.assertNotNull(element);
	    Assert.assertTrue(element instanceof  WebElement);
	    Assert.assertEquals(value, "Terry");
	 }
	
	@Test
    public void ShouldTestLastName()
    {
	    driver.get(testUrl);
	    String value = "";
	    WebElement element = null;
	    
	    //Code 
	    element = driver.findElement(By.name("lastName"));
	    value = element.getAttribute("value");
	    //Code

	    Assert.assertNotNull(element);
	    Assert.assertTrue(element instanceof  WebElement);
	    Assert.assertEquals(value, "Pratchett");
    }

    @Test
    public void ShouldTestCountry()
    {
	    driver.get(testUrl);
	    String value = "";
	    WebElement element = null;
	    
	    //Code 
	    element = driver.findElement(By.name("country"));
	    value = element.getAttribute("value");
	    //Code

	    Assert.assertNotNull(element);
	    Assert.assertTrue(element instanceof  WebElement);
	    Assert.assertEquals(value, "England");
    }

    @Test
    public void ShouldTestActiveCheckbox()
    {
	    driver.get(testUrl);
	    boolean value = true;
	    WebElement element = null;

	    //Code 
	    element = driver.findElement(By.id("isActive"));
	    value = element.isSelected();
	    //Code

	    Assert.assertNotNull(element);
	    Assert.assertTrue(element instanceof  WebElement);
        Assert.assertEquals(element.isEnabled(), false);
        Assert.assertEquals(value, false);
    }

    @Test
    public void ShouldTestCommentInput()
    {
	    driver.get(testUrl);
	    String value = "";
	    WebElement element = null;
	    
	    //Code 
	    element = driver.findElement(By.id("commentInput"));
	    //Code

	    Assert.assertNotNull(element);
	    Assert.assertTrue(element instanceof  WebElement);
	    Assert.assertEquals(value, "");
    }

    @Test
    public void ShouldTestDetailsLink()
    {
	    driver.get(testUrl);
	    WebElement element = null;
	    
	    //Code 
	    element = driver.findElement(By.linkText("Details"));
	    //Code

	    Assert.assertNotNull(element);
	    Assert.assertTrue(element instanceof  WebElement);
	    Assert.assertEquals(element.getAttribute("href"), "https://en.wikipedia.org/wiki/Terry_Pratchett");
    }

    @Test
    public void ShouldTestListOfBooksLink()
    {
	    driver.get(testUrl);
	    WebElement element = null;
	    
	    //Code 
	    element = driver.findElement(By.linkText("List of books"));
	    //Code

	    Assert.assertNotNull(element);
	    Assert.assertTrue(element instanceof  WebElement);
	    Assert.assertEquals(element.getAttribute("href"), "https://www.terrypratchettbooks.com/books/");

	    
    }
    
    @AfterTest
    public void terminateBrowser(){
    	driver.quit();
    }
	
}
