package Selenium.Course.Lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Workshop01Test {
	
	private String testUrl = "https://suvroc.github.io/selenium-mail-course/01/workshop.html";
	
	@Test
	public void ShouldTestFirstName(){
		
		WebDriver driver = new ChromeDriver();
	    driver.get(testUrl);
	    String value = "";
	    WebElement element = null;
	    
	    //Code 
	    
	    //Code

	    Assert.assertNotNull(element);
	    Assert.assertTrue(element instanceof  WebElement);
	    Assert.assertEquals(value, "Terry");

	    driver.quit();
	 }
	
	@Test
    public void ShouldTestLastName()
    {
		WebDriver driver = new ChromeDriver();
	    driver.get(testUrl);
	    String value = "";
	    WebElement element = null;
	    
	    //Code 
	    
	    //Code

	    Assert.assertNotNull(element);
	    Assert.assertTrue(element instanceof  WebElement);
	    Assert.assertEquals(value, "Pratchett");

	    driver.quit();
    }

    @Test
    public void ShouldTestCountry()
    {
    	WebDriver driver = new ChromeDriver();
	    driver.get(testUrl);
	    String value = "";
	    WebElement element = null;
	    
	    //Code 
	    
	    //Code

	    Assert.assertNotNull(element);
	    Assert.assertTrue(element instanceof  WebElement);
	    Assert.assertEquals(value, "England");

	    driver.quit();
    }

    @Test
    public void ShouldTestActiveCheckbox()
    {
    	WebDriver driver = new ChromeDriver();
	    driver.get(testUrl);
	    String value = "";
	    WebElement element = null;

//Code 
	    
	    //Code

	    Assert.assertNotNull(element);
	    Assert.assertTrue(element instanceof  WebElement);
        Assert.assertEquals(element.isEnabled(), false);
        Assert.assertEquals(value, false);

        driver.quit();
    }

    @Test
    public void ShouldTestCommentInput()
    {
    	WebDriver driver = new ChromeDriver();
	    driver.get(testUrl);
	    String value = "";
	    WebElement element = null;
	    
	    //Code 
	    
	    //Code

	    Assert.assertNotNull(element);
	    Assert.assertTrue(element instanceof  WebElement);
	    Assert.assertEquals(value, "");

	    driver.quit();
    }

    @Test
    public void ShouldTestDetailsLink()
    {
    	WebDriver driver = new ChromeDriver();
	    driver.get(testUrl);
	    WebElement element = null;
	    
	    //Code 
	    
	    //Code

	    Assert.assertNotNull(element);
	    Assert.assertTrue(element instanceof  WebElement);
	    Assert.assertEquals(element.getAttribute("href"), "https://en.wikipedia.org/wiki/Terry_Pratchett");

	    driver.quit();
    }

    @Test
    public void ShouldTestListOfBooksLink()
    {
    	WebDriver driver = new ChromeDriver();
	    driver.get(testUrl);
	    WebElement element = null;
	    
	    //Code 
	    
	    //Code

	    Assert.assertNotNull(element);
	    Assert.assertTrue(element instanceof  WebElement);
	    Assert.assertEquals(element.getAttribute("href"), "https://www.terrypratchettbooks.com/books/");

	    driver.quit();
    }
	
}
