package Selenium.Course.Lesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Workshop04Test {
	
	private String testUrl = "https://suvroc.github.io/selenium-mail-course/04/workshop.html";
	WebDriver driver ;
	WebDriverWait myWaitVar;
	
	@BeforeClass
	public void initBrowser(){
		driver = new ChromeDriver();
		myWaitVar = new WebDriverWait(driver,10);
	}

	 @Test
	public void ShouldCheckSelectedBookName() {
		driver.get(testUrl);

		String firstName = "Mark", lastName = "Twain", street = "Garden", town = "London";

		PersonalDataPage personalDataPage = new PersonalDataPage(driver);
		personalDataPage.FirstNameInput().sendKeys(firstName);
		personalDataPage.LastNameInput().sendKeys(lastName);

		personalDataPage.NextButton().click();

		AddressPage addressPage = new AddressPage(driver);

		addressPage.StreetInput().sendKeys(street);
		addressPage.TownInput().sendKeys(town);

		addressPage.NextButton().click();

		FinalPage finalPage = new FinalPage(driver);

		Assert.assertEquals(finalPage.FirstName().getText(), firstName);
		Assert.assertEquals(finalPage.LastName().getText(), lastName);
		Assert.assertEquals(finalPage.Street().getText(), street);
		Assert.assertEquals(finalPage.Town().getText(), town);

	}
	
	public class PersonalDataPage{
        private WebDriver _driver;

        public PersonalDataPage(WebDriver driver){
            _driver = driver;
        }

        //TEST CODE
        
        public WebElement FirstNameInput() {
        	return _driver.findElement(By.id("firstNameInput"));
        }

        public WebElement LastNameInput(){
        	return _driver.findElement(By.id("lastNameInput"));
        }

        public WebElement NextButton(){
        	return _driver.findElement(By.id("nextButton"));
        }
        
        //TEST CODE
    }
	
	public class AddressPage{
        private WebDriver _driver;

        public AddressPage(WebDriver driver){
            _driver = driver;
        }

        //TEST CODE
        
        public WebElement StreetInput() {
        	return _driver.findElement(By.id("streetInput"));
        }

        public WebElement TownInput(){
        	return _driver.findElement(By.id("townInput"));
        }

        public WebElement NextButton(){
        	return _driver.findElement(By.id("nextButton")); 
        }
        
        //TEST CODE
    }
	
	public class FinalPage{
        private WebDriver _driver;

        public FinalPage(WebDriver driver){
            _driver = driver;
        }

        //TEST CODE
        
        public WebElement FirstName() {
        	return _driver.findElement(By.id("firstNameText"));
        }

        public WebElement LastName(){
        	return _driver.findElement(By.id("lastNameText"));
        }

        public WebElement Street(){
        	return _driver.findElement(By.id("streetText"));
        }
        
        public WebElement Town(){
        	return _driver.findElement(By.id("townText"));
        }
        
        //TEST CODE
    }

    @AfterClass
    public void terminateBrowser(){
    	driver.quit();
    }
	
}
