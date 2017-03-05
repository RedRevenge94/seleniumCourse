package Selenium.Course.Lesson3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Workshop03Test {
	
	private String testUrl = "https://suvroc.github.io/selenium-mail-course/03/workshop.html";
	WebDriver driver ;
	WebDriverWait myWaitVar;
	
	@BeforeClass
	public void initBrowser(){
		driver = new ChromeDriver();
		myWaitVar = new WebDriverWait(driver,10);
	}
	
	@Test
	public void ShouldCheckSelectedBookName()
	{
		driver.get(testUrl);
	   
		WebElement book = null;

	    //Code
		book = driver.findElement(By.xpath("//li[4]/h4"));
		//Code
		
		Assert.assertNotNull(book);
		Assert.assertEquals(book.getTagName(), "h4");
		Assert.assertEquals(book.getText(), "MORT");
	}
	
	@Test
	public void ShouldCheckNumberOfBooks()
	{
		driver.get(testUrl);

	    List<WebElement> books = null;

	    //Code
	    books = driver.findElements(By.cssSelector("li.list-group-item.book"));
	    //Code
	    
	    Assert.assertNotNull(books);
	    Assert.assertEquals(books.size(),6);
	    
	    for(WebElement x : books)
	    	Assert.assertTrue(x.getTagName().equals("li"));
	}

	@Test
	public void ShouldCheckLinksDomain()
	{
		driver.get(testUrl);

		List<WebElement> links = null;

		//Code
		links = driver.findElements(By.linkText("Details"));
	    //Code
		
		 Assert.assertNotNull(links);
		 Assert.assertEquals(links.size(),6);
		 
		 for(WebElement x : links)
			 Assert.assertTrue(x.getTagName().equals("a"));
		 
		 for(WebElement x : links)
	         Assert.assertTrue(x.getAttribute("href").startsWith("https://www.terrypratchettbooks.com"));
	}
    
    @AfterClass
    public void terminateBrowser(){
    	driver.quit();
    }
	
}
