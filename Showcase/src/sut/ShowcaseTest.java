package sut;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

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
import org.openqa.selenium.JavascriptExecutor;

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
//		driver.close();
	}
	
////////////////////////////////////////// Create Account Page Test //////////////////////////////////////////////////////////////
	
////	lt6vc
//	@Test
//	void baseCaseCreateAccountTest() {
////		[value, ntv6jq@virginia.edu (valid), Abc123!@#, match, clicked]
//		driver.findElement(By.linkText("Create an Account")).click();
//		driver.findElement(By.id("firstname")).sendKeys("Tunhi");
//		driver.findElement(By.id("lastname")).sendKeys("Vo");
//		driver.findElement(By.id("email_address")).sendKeys("ntv6jq@virginia.edu");
//		driver.findElement(By.id("password")).sendKeys("Abc123!@#");
//		driver.findElement(By.id("password-confirmation")).sendKeys("Abc123!@#");
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//		
//		if(driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/customer/account/create/")){
//			System.out.println("HERE");
//			driver.findElement(By.linkText("Sign In")).click();
//			driver.findElement(By.id("email")).sendKeys("ntv6jq@virginia.edu");
//			driver.findElement(By.id("pass")).sendKeys("Abc123!@#");
//			driver.findElement(By.id("send2")).click();
//		}
//		
//		assertTrue(driver.getPageSource().contains("Tunhi Vo"));
//		assertTrue(driver.getPageSource().contains("ntv6jq@virginia.edu"));
//	}
	
////	lt6vc
//	@Test
//	void noNameValidEmailStrongPasswordMatchedSubmitTest() {
////		[no value, abc@outlook.com (valid), Abc123!@#, match, clicked]
//		driver.findElement(By.linkText("Create an Account")).click();
//		driver.findElement(By.id("email_address")).sendKeys("abc@outlook.com");
//		driver.findElement(By.id("password")).sendKeys("Abc123!@#");
//		driver.findElement(By.id("password-confirmation")).sendKeys("Abc123!@#");
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//		assertEquals("This is a required field.", driver.findElement(By.id("firstname-error")).getText());
//	}
	
////	lt6vc
//	@Test
//	void NameInvalidEmailStrongPasswordMatchedSubmitTest() {
////		[value, abcdef (invalid), Abc123!@#, match, clicked]
//		driver.findElement(By.linkText("Create an Account")).click();
//		driver.findElement(By.id("firstname")).sendKeys("Tunhi");
//		driver.findElement(By.id("lastname")).sendKeys("Vo");
//		driver.findElement(By.id("email_address")).sendKeys("abcdef");
//		driver.findElement(By.id("password")).sendKeys("Abc123!@#");
//		driver.findElement(By.id("password-confirmation")).sendKeys("Abc123!@#");
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//		
//		assertTrue(driver.findElement(By.id("email_address-error")).getText().equals("Please enter a valid email address (Ex: johndoe@domain.com)."));
//	}
	
//	//lt6vc
//	@Test
//	void NameInvalidEmailWeakPasswordMatchedSubmitTest() {
//	//	[value, ntv6jq@virginia.edu (valid), abcdef (weak passwd), match, clicked]
//		driver.findElement(By.linkText("Create an Account")).click();
//		driver.findElement(By.id("firstname")).sendKeys("Tunhi");
//		driver.findElement(By.id("lastname")).sendKeys("Vo");
//		driver.findElement(By.id("email_address")).sendKeys("ntv6jq@virginia.edu");
//		driver.findElement(By.id("password")).sendKeys("abcdef");
//		driver.findElement(By.id("password-confirmation")).sendKeys("abcdef");
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//	
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//		assertEquals("Minimum length of this field must be equal or greater than 8 symbols. Leading and trailing spaces will be ignored.",
//				driver.findElement(By.id("password-error")).getText());
//		
//	}
	
//	//lt6vc
//	@Test
//	void NameInvalidEmailStrongPasswordNotMatchedSubmitTest() {
//	//	[value, ntv6jq@virginia.edu (valid), Abc123!@#, not matched, clicked]
//		driver.findElement(By.linkText("Create an Account")).click();
//		driver.findElement(By.id("firstname")).sendKeys("Tunhi");
//		driver.findElement(By.id("lastname")).sendKeys("Vo");
//		driver.findElement(By.id("email_address")).sendKeys("ntv6jq@virginia.edu");
//		driver.findElement(By.id("password")).sendKeys("Abc123!@#");
//		driver.findElement(By.id("password-confirmation")).sendKeys("abcdef");
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//	
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//		
//		assertEquals("Please enter the same value again.",
//				driver.findElement(By.id("password-confirmation-error")).getText());
//	}
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
////////////////////////////////////////// Sign in Page //////////////////////////////////////////////////////////////////////////
	
//	//lt6vc
//	@Test
//	void baseCaseSignInPageTest() {
//	//	[value, ntv6jq@virginia.edu (valid), Abc123!@#, not matched, clicked]
//		driver.findElement(By.linkText("Sign In")).click();
//		driver.findElement(By.id("email")).sendKeys("ntv6jq@virginia.edu");
//		driver.findElement(By.id("pass")).sendKeys("Abc123!@#");
//		driver.findElement(By.id("send2")).click();
//		
//		if(driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/")) { 		// successful login
//			driver.get("https://magento.softwaretestingboard.com/customer/account/");
//			assertTrue(driver.getPageSource().contains("My Account"));
//			assertTrue(driver.getPageSource().contains("Tunhi Vo"));
//		}
//		else {																					// key error
//			driver.findElement(By.linkText("Sign In")).click();
//			driver.findElement(By.id("email")).sendKeys("ntv6jq@virginia.edu");
//			driver.findElement(By.id("pass")).sendKeys("Abc123!@#");
//			driver.findElement(By.id("send2")).click();
//			assertTrue(driver.getPageSource().contains("My Account"));
//			assertTrue(driver.getPageSource().contains("Tunhi Vo"));
//		}
//	}
	
//	//lt6vc
//	@Test
//	void valueInvalidCorrectEmailCorrectPasswdSubmitTest() {
//	//	[filled boxes, ntv6jq@virginia (invalid), Abc123!@#, clicked]
//		driver.findElement(By.linkText("Sign In")).click();
//		driver.findElement(By.id("email")).sendKeys("ntv6jq@virginia");
//		driver.findElement(By.id("pass")).sendKeys("Abc123!@#");
//		driver.findElement(By.id("send2")).click();
//		assertTrue(driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div")).isDisplayed());
//		
//		// if fails try or'ing t with line below:
////		assertTrue(driver.findElement(By.id("email_address-error")).getText().equals("Please enter a valid email address (Ex: johndoe@domain.com)."));
//	}
	
//	//lt6vc
//	@Test
//	void valueValidIncorrectEmailWrongPasswdSubmitTest() {
//	//	[filled boxes, lt6vc@virginia.edu (incorrect email), Abc123!@#, clicked]
//		driver.findElement(By.linkText("Sign In")).click();
//		driver.findElement(By.id("email")).sendKeys("lt6vc@virginia.edu");
//		driver.findElement(By.id("pass")).sendKeys("Abc123!@#");
//		driver.findElement(By.id("send2")).click();
//		assertTrue(driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div")).isDisplayed());
//		
//	}
	
//	//lt6vc
//	@Test
//	void valueValidCorrectEmailWrongPasswdSubmitTest() {
//	//	[filled boxes, ntv6jq@virginia.edu (valid), abcdef (incorrect passwd), clicked]
//		driver.findElement(By.linkText("Sign In")).click();
//		driver.findElement(By.id("email")).sendKeys("ntv6jq@virginia.edu");
//		driver.findElement(By.id("pass")).sendKeys("abcdef");
//		driver.findElement(By.id("send2")).click();
//		assertTrue(driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div")).isDisplayed());
//		
//	}
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
////////////////////////////////////////////// Search Bar Function ///////////////////////////////////////////////////////////////
	
//	//lt6vc
//	@Test
//	void valueAlphabeticalValidSearchSubmitTest() {
//	//	[filled boxes, ntv6jq@virginia.edu (valid), abcdef (incorrect passwd), clicked]
//		driver.findElement(By.id("search")).sendKeys("hoodies for women");
//		driver.findElement(By.id("search")).sendKeys(Keys.RETURN);
//		assertTrue(driver.findElement(By.className("product-image-photo")).isDisplayed());
//	}
	
//	//lt6vc
//	@Test
//	void valueAlphabeticalInvalidSearchSubmitTest() {
//	//	[filled boxes, ntv6jq@virginia.edu (valid), abcdef (incorrect passwd), clicked]
//		driver.findElement(By.id("search")).sendKeys("tower");
//		driver.findElement(By.id("search")).sendKeys(Keys.RETURN);
//		assertTrue(driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[2]/div")).isDisplayed());
//		
//	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
////////////////////////////////////////////// Add to Cart From What's New ///////////////////////////////////////////////////////
//	//lt6vc
//	@Test								// Can't get selenium to click on size or color button
//	void baseCaseAddtoCartTest() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		driver.findElement(By.linkText("What's New")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/div/strong/a")).click(); // xpath for Phoebe Zipper Sweatshirt
//		js.executeScript("document.getElementById('option-label-size-143-item-167').click();");
////		driver.findElement(By.id("option-label-size-143-item-167")).click(); // xpath for small (CANT FIND ELEMENT)
////		driver.findElement(By.id("option-label-color-93-item-52")).click();
//		driver.findElement(By.id("qty")).clear();
//		driver.findElement(By.id("qty")).sendKeys("1");
//		WebElement element = driver.findElement(By.id("product-addtocart-button"));
//		js.executeScript("arguments[0].click();", element);
//		driver.get("https://magento.softwaretestingboard.com/checkout/cart/");
//		driver.getPageSource().contains("Phoebe Zipper Sweatshirt");
//	}
//	
//	//lt6vc
//	@Test
//	void tabClickedItemSelectedNoSizeGrayCartClickedTest() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		driver.findElement(By.linkText("What's New")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/div/strong/a")).click(); // xpath for Phoebe Zipper Sweatshirt
//		driver.findElement(By.id("qty")).clear();
//		driver.findElement(By.id("qty")).sendKeys("1");
//		WebElement element = driver.findElement(By.id("product-addtocart-button"));
//		js.executeScript("arguments[0].click();", element);
//		js.executeScript("arguments[0].click();", element);
//		element.click();
//	}
//	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
////////////////////////////////////////////// Advanced Search ///////////////////////////////////////////////////////////////////

//	ntv6jq
@Test	 
void advanceBase() { 
	driver.findElement(By.linkText("Advanced Search")).click();
	driver.findElement(By.id("name")).sendKeys("Juno Jacket");
	driver.findElement(By.id("sku")).sendKeys("WJ06");
	driver.findElement(By.id("description")).sendKeys("Jacket");
	driver.findElement(By.id("short_description")).sendKeys("Jacket");
	driver.findElement(By.id("price")).sendKeys("0");
	driver.findElement(By.id("price_to")).sendKeys("");
	driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
	assertTrue(driver.getPageSource().contains("Jacket"));
}

//	ntv6jq
@Test	 
void advanceEmpty() { 
	driver.findElement(By.linkText("Advanced Search")).click();
	driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
	assertTrue(driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div")).isDisplayed());
}
	
//ntv6jq
@Test	 
void advanceEmptyName() { 
	driver.findElement(By.linkText("Advanced Search")).click();
	driver.findElement(By.id("name")).sendKeys("");
	driver.findElement(By.id("sku")).sendKeys("WJ06");
	driver.findElement(By.id("description")).sendKeys("Jacket");
	driver.findElement(By.id("short_description")).sendKeys("Jacket");
	driver.findElement(By.id("price")).sendKeys("0");
	driver.findElement(By.id("price_to")).sendKeys("");
	driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
	assertTrue(driver.getPageSource().contains("Jacket"));
}

//ntv6jq
@Test	 
void advanceEmptyDesc() { 
	driver.findElement(By.linkText("Advanced Search")).click();
	driver.findElement(By.id("name")).sendKeys("Juno Jacket");
	driver.findElement(By.id("sku")).sendKeys("WJ06");
	driver.findElement(By.id("description")).sendKeys("");
	driver.findElement(By.id("short_description")).sendKeys("Jacket");
	driver.findElement(By.id("price")).sendKeys("0");
	driver.findElement(By.id("price_to")).sendKeys("");
	driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
	assertTrue(driver.getPageSource().contains("Jacket"));
}

//ntv6jq
@Test	 
void advanceEmptyShortDesc() { 
	driver.findElement(By.linkText("Advanced Search")).click();
	driver.findElement(By.id("name")).sendKeys("Juno Jacket");
	driver.findElement(By.id("sku")).sendKeys("WJ06");
	driver.findElement(By.id("description")).sendKeys("Jacket");
	driver.findElement(By.id("short_description")).sendKeys("");
	driver.findElement(By.id("price")).sendKeys("0");
	driver.findElement(By.id("price_to")).sendKeys("");
	driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
	assertTrue(driver.getPageSource().contains("Jacket"));
}

//ntv6jq
@Test	 
void advanceEmptySKU() { 
	driver.findElement(By.linkText("Advanced Search")).click();
	driver.findElement(By.id("name")).sendKeys("Juno Jacket");
	driver.findElement(By.id("sku")).sendKeys("");
	driver.findElement(By.id("description")).sendKeys("Jacket");
	driver.findElement(By.id("short_description")).sendKeys("Jacket");
	driver.findElement(By.id("price")).sendKeys("0");
	driver.findElement(By.id("price_to")).sendKeys("");
	driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
	assertTrue(driver.getPageSource().contains("Jacket"));
//	assertTrue(driver.findElement(By.className("product-image-photo")).isDisplayed());
}

//ntv6jq
@Test	 
void advanceInvalidName() { 
	driver.findElement(By.linkText("Advanced Search")).click();
	driver.findElement(By.id("name")).sendKeys("abcdef");
	driver.findElement(By.id("sku")).sendKeys("WJ06");
	driver.findElement(By.id("description")).sendKeys("Jacket");
	driver.findElement(By.id("short_description")).sendKeys("Jacket");
	driver.findElement(By.id("price")).sendKeys("0");
	driver.findElement(By.id("price_to")).sendKeys("");
	driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
	assertFalse(driver.getPageSource().contains("Juno Jacket"));
}
	
//ntv6jq
@Test	 
void advanceInvalidDesc() { 	
	driver.findElement(By.linkText("Advanced Search")).click();
	driver.findElement(By.id("name")).sendKeys("Juno Jacket");
	driver.findElement(By.id("sku")).sendKeys("WJ06");
	driver.findElement(By.id("description")).sendKeys("abcdef");
	driver.findElement(By.id("short_description")).sendKeys("Jacket");
	driver.findElement(By.id("price")).sendKeys("0");
	driver.findElement(By.id("price_to")).sendKeys("");
	driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
	assertFalse(driver.getPageSource().contains("Juno Jacket"));
	}

//ntv6jq
@Test	 
void advanceInvalidShortDesc() { 
	driver.findElement(By.linkText("Advanced Search")).click();
	driver.findElement(By.id("name")).sendKeys("Juno Jacket");
	driver.findElement(By.id("sku")).sendKeys("WJ06");
	driver.findElement(By.id("description")).sendKeys("Jacket");
	driver.findElement(By.id("short_description")).sendKeys("abcdef");
	driver.findElement(By.id("price")).sendKeys("0");
	driver.findElement(By.id("price_to")).sendKeys("");
	driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
	assertFalse(driver.getPageSource().contains("Juno Jacket"));
}

//ntv6jq
@Test	 
void advanceInvalidSKU() { 
	driver.findElement(By.linkText("Advanced Search")).click();
	driver.findElement(By.id("name")).sendKeys("Juno Jacket");
	driver.findElement(By.id("sku")).sendKeys("abcdef");
	driver.findElement(By.id("description")).sendKeys("Jacket");
	driver.findElement(By.id("short_description")).sendKeys("Jacket");
	driver.findElement(By.id("price")).sendKeys("0");
	driver.findElement(By.id("price_to")).sendKeys("");
	driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
	assertFalse(driver.getPageSource().contains("Juno Jacket"));
}

//ntv6jq
@Test	 
void advanceAlphPrice() { 
	driver.findElement(By.linkText("Advanced Search")).click();
	driver.findElement(By.id("name")).sendKeys("Juno Jacket");
	driver.findElement(By.id("sku")).sendKeys("WJ06");
	driver.findElement(By.id("description")).sendKeys("Jacket");
	driver.findElement(By.id("short_description")).sendKeys("Jacket");
	driver.findElement(By.id("price")).sendKeys("A");
	driver.findElement(By.id("price_to")).sendKeys("");
	driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
	assertTrue(driver.findElement(By.id("price-error")).isDisplayed());
}

//ntv6jq
@Test	 
void advanceNegPrice() { 
	driver.findElement(By.linkText("Advanced Search")).click();
	driver.findElement(By.id("name")).sendKeys("Juno Jacket");
	driver.findElement(By.id("sku")).sendKeys("WJ06");
	driver.findElement(By.id("description")).sendKeys("Jacket");
	driver.findElement(By.id("short_description")).sendKeys("Jacket");
	driver.findElement(By.id("price")).sendKeys("-10");
	driver.findElement(By.id("price_to")).sendKeys("");
	driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
	assertTrue(driver.getPageSource().contains("-10"));
}

//ntv6jq
@Test	 
void advancePosPrice() { 
	driver.findElement(By.linkText("Advanced Search")).click();
	driver.findElement(By.id("name")).sendKeys("Juno Jacket");
	driver.findElement(By.id("sku")).sendKeys("WJ06");
	driver.findElement(By.id("description")).sendKeys("Jacket");
	driver.findElement(By.id("short_description")).sendKeys("Jacket");
	driver.findElement(By.id("price")).sendKeys("1");
	driver.findElement(By.id("price_to")).sendKeys("80");
	driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
	assertTrue(driver.getPageSource().contains("Jacket"));
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
////////////////////////////////////////////// Checkout //////////////////////////////////////////////////////////////////////////
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
