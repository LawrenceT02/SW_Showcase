package sut;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class ShowcaseTest {
	private WebDriver driver;
	private String url = "https://magento.softwaretestingboard.com/";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:/Users/lawre/Documents/UVA/F23/SWTesting/geckodriver.exe");
//		add your driver directory here
		
	// create an instance of the web browser and open it    
	   driver = new FirefoxDriver();   
	      
	   // open the given url 
	   driver.get(url);
}

	@AfterEach
	void tearDown() throws Exception {
		driver.close();
	}

	@Test
	void baseCaseCreateAccountTest() {
//		[value, ntv6jq@virginia.edu (valid), Abc123!@#, match, clicked]
		driver.findElement(By.linkText("Create an Account")).click();
		driver.findElement(By.id("firstname")).sendKeys("Tunhi");
		driver.findElement(By.id("lastname")).sendKeys("Vo");
		driver.findElement(By.id("email_address")).sendKeys("ntv6jq@virginia.edu");
		driver.findElement(By.id("password")).sendKeys("Abc123!@#");
		driver.findElement(By.id("password-confirmation")).sendKeys("Abc123!@#");
		driver.findElement(By.cssSelector(".action.submit.primary")).click();
		
		if(driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/customer/account/create/")){
			System.out.println("HERE");
			driver.findElement(By.linkText("Sign In")).click();
			driver.findElement(By.id("email")).sendKeys("ntv6jq@virginia.edu");
			driver.findElement(By.id("pass")).sendKeys("Abc123!@#");
			driver.findElement(By.id("send2")).click();
		}
		
		assertTrue(driver.getPageSource().contains("Tunhi Vo"));
		assertTrue(driver.getPageSource().contains("ntv6jq@virginia.edu"));
	}
	
	@Test
	void NameInvalidEmailSubmitTest() {
//		[value, abcdef (invalid), Abc123!@#, match, clicked]
		driver.findElement(By.linkText("Create an Account")).click();
		driver.findElement(By.id("firstname")).sendKeys("Tunhi");
		driver.findElement(By.id("lastname")).sendKeys("Vo");
		driver.findElement(By.id("email_address")).sendKeys("abcdef");
		driver.findElement(By.id("password")).sendKeys("Abc123!@#");
		driver.findElement(By.id("password-confirmation")).sendKeys("Abc123!@#");
		driver.findElement(By.cssSelector(".action.submit.primary")).click();

		driver.findElement(By.cssSelector(".action.submit.primary")).click();
		
		assertTrue(driver.findElement(By.id("email_address-error")).getText().equals("Please enter a valid email address (Ex: johndoe@domain.com)."));
	}

}
