package sut;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.security.Key;
import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

class ShowcaseTest {
	private WebDriver driver;
	private String url = "https://magento.softwaretestingboard.com/";
	JavascriptExecutor js;

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
//
////	lt6vc
//	@Test
//	void baseCaseCreateAccountTest() {
////	[TuNhi, Vo, ntv6jq@virginia.edu (valid), Abc123!@#, Abc123!@# (match), clicked]
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
//	
////	lt6vc
//	@Test
//	void noFirstNameValidEmailStrongPasswordMatchedSubmitTest() {
////		[“”, Vo, ntv6jq@virginia.edu (valid), Abc123!@#, Abc123!@# (match), clicked]
//		driver.findElement(By.linkText("Create an Account")).click();
//		driver.findElement(By.id("lastname")).sendKeys("Vo");
//		driver.findElement(By.id("email_address")).sendKeys("abc@outlook.com");
//		driver.findElement(By.id("password")).sendKeys("Abc123!@#");
//		driver.findElement(By.id("password-confirmation")).sendKeys("Abc123!@#");
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//		assertEquals("This is a required field.", driver.findElement(By.id("firstname-error")).getText());
//	}
//	
//	
//	//lt6vc
//	@Test
//	void noLastNameValidEmailStrongPasswordMatchedSubmitTest() {
//	//	[no value, abc@outlook.com (valid), Abc123!@#, match, clicked]
//		driver.findElement(By.linkText("Create an Account")).click();
//		driver.findElement(By.id("firstname")).sendKeys("Tunhi");
//		driver.findElement(By.id("email_address")).sendKeys("abc@outlook.com");
//		driver.findElement(By.id("password")).sendKeys("Abc123!@#");
//		driver.findElement(By.id("password-confirmation")).sendKeys("Abc123!@#");
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//		assertEquals("This is a required field.", driver.findElement(By.id("lastname-error")).getText());
//	}
//	
////	lt6vc
//	@Test
//	void NameInvalidEmailStrongPasswordMatchedSubmitTest() {
////	[TuNhi, Vo, ntv6jq (invalid), Abc123!@#, Abc123!@# (match), clicked]
//		driver.findElement(By.linkText("Create an Account")).click();
//		driver.findElement(By.id("firstname")).sendKeys("Tunhi");
//		driver.findElement(By.id("lastname")).sendKeys("Vo");
//		driver.findElement(By.id("email_address")).sendKeys("ntv6jq");
//		driver.findElement(By.id("password")).sendKeys("Abc123!@#");
//		driver.findElement(By.id("password-confirmation")).sendKeys("Abc123!@#");
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//		
//		assertTrue(driver.findElement(By.id("email_address-error")).getText().equals("Please enter a valid email address (Ex: johndoe@domain.com)."));
//	}
//	
//	//lt6vc
//	@Test
//	void NameEmptyEmailStrongPasswordMatchedSubmitTest() {
//	//[TuNhi, Vo, "", Abc123!@#, Abc123!@# (match), clicked]
//		driver.findElement(By.linkText("Create an Account")).click();
//		driver.findElement(By.id("firstname")).sendKeys("Tunhi");
//		driver.findElement(By.id("lastname")).sendKeys("Vo");
//		driver.findElement(By.id("email_address")).sendKeys("");
//		driver.findElement(By.id("password")).sendKeys("Abc123!@#");
//		driver.findElement(By.id("password-confirmation")).sendKeys("Abc123!@#");
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//	
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//		
//		assertTrue(driver.findElement(By.id("email_address-error")).getText().equals("This is a required field."));
//	}
//	
//	//ntv6jq
//	@Test
//	void NameValidEmailNoPasswordMatchedSubmitTest() {
//	//[TuNhi, Vo, ntv6jq@virginia.edu (valid), “”, Abc123!@# (match), clicked]
//		driver.findElement(By.linkText("Create an Account")).click();
//		driver.findElement(By.id("firstname")).sendKeys("Tunhi");
//		driver.findElement(By.id("lastname")).sendKeys("Vo");
//		driver.findElement(By.id("email_address")).sendKeys("ntv6jq@virginia.edu");
//		driver.findElement(By.id("password")).sendKeys("");
//		driver.findElement(By.id("password-confirmation")).sendKeys("Abc123!@#");
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//	
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//		
//		assertTrue(driver.findElement(By.id("password-error")).getText().equals("This is a required field."));
//	}
//	
//	//ntv6jq
//	@Test
//	void NameValidEmailPasswordEmptyMatchSubmitTest() {
//	//[TuNhi, Vo, ntv6jq@virginia.edu (valid),Abc123!@#, “”,(match), clicked]
//		driver.findElement(By.linkText("Create an Account")).click();
//		driver.findElement(By.id("firstname")).sendKeys("Tunhi");
//		driver.findElement(By.id("lastname")).sendKeys("Vo");
//		driver.findElement(By.id("email_address")).sendKeys("ntv6jq@virginia.edu");
//		driver.findElement(By.id("password")).sendKeys("Abc123!@#");
//		driver.findElement(By.id("password-confirmation")).sendKeys("");
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//	
//		driver.findElement(By.cssSelector(".action.submit.primary")).click();
//		
//		assertTrue(driver.findElement(By.id("password-confirmation-error")).getText().equals("This is a required field."));
//	}
//	
//	//lt6vc
//	@Test
//	void NameInvalidEmailWeakPasswordMatchedSubmitTest() {
//	//	[TuNhi, Vo, ntv6jq@virginia.edu (valid), abcdef, abcdef(match), clicked]
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
//	
//	//lt6vc
//	@Test
//	void NameInvalidEmailStrongPasswordNotMatchedSubmitTest() {
//	//	[TuNhi, Vo, ntv6jq@virginia.edu (valid), Abc123!@#, Abc123 (unmatched), clicked]
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
//	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	
////////////////////////////////////////// Sign in Page //////////////////////////////////////////////////////////////////////////
//	
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
//	
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
//	
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
//	
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
//	
//	//lt6vc
//	@Test
//	void valueAlphabeticalInvalidSearchSubmitTest() {
//	//	[filled boxes, ntv6jq@virginia.edu (valid), abcdef (incorrect passwd), clicked]
//		driver.findElement(By.id("search")).sendKeys("tower");
//		driver.findElement(By.id("search")).sendKeys(Keys.RETURN);
//		assertTrue(driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[2]/div")).isDisplayed());
//		
//	}
//	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	
////////////////////////////////////////////// Add to Cart From Gear ///////////////////////////////////////////////////////
//	//lt6vc
//	@Test
//	void GearClckItemSelPosQtyAddCartTest() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		driver.findElement(By.linkText("Gear")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[3]/div/div/strong/a")).click(); // xpath for water bottle
//		driver.navigate().refresh();
//		driver.findElement(By.id("qty")).clear();
//		driver.findElement(By.id("qty")).sendKeys("1");
//		driver.findElement(By.id("qty")).sendKeys(Keys.TAB, Keys.RETURN);
//		try {
//            Thread.sleep(1500); // 5000 milliseconds = 5 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//		driver.get("https://magento.softwaretestingboard.com/checkout/cart/");
//		assertTrue(driver.getPageSource().contains("Affirm Water Bottle"));
//	}
//	
//	//lt6vc
//	@Test
//	void GearClckItemSelNegQtyAddCartTest() {
//		driver.findElement(By.linkText("Gear")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[3]/div/div/strong/a")).click(); // xpath for water bottle
//		driver.navigate().refresh();
//		driver.findElement(By.id("qty")).clear();
//		driver.findElement(By.id("qty")).sendKeys("-1");
//		driver.findElement(By.id("qty")).sendKeys(Keys.TAB, Keys.RETURN);
//		try {
//            Thread.sleep(1000); // 5000 milliseconds = 5 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//		driver.get("https://magento.softwaretestingboard.com/checkout/cart/");
//		assertFalse(driver.getPageSource().contains("Affirm Water Bottle"));
//		assertTrue(driver.getPageSource().contains("You have no items in your shopping cart"));
//	}
//	
//	//lt6vc
//	@Test
//	void GearClckItemSelZeroQtyAddCartTest() {
//		driver.findElement(By.linkText("Gear")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[3]/div/div/strong/a")).click(); // xpath for water bottle
//		driver.navigate().refresh();
//		driver.findElement(By.id("qty")).clear();
//		driver.findElement(By.id("qty")).sendKeys("0");
//		driver.findElement(By.id("qty")).sendKeys(Keys.TAB, Keys.RETURN);
//		try {
//            Thread.sleep(1000); // 5000 milliseconds = 5 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//		driver.get("https://magento.softwaretestingboard.com/checkout/cart/");
//		assertFalse(driver.getPageSource().contains("Affirm Water Bottle"));
//		assertTrue(driver.getPageSource().contains("You have no items in your shopping cart"));
//	}
//	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	
////////////////////////////////////////////// Advanced Search ///////////////////////////////////////////////////////////////////
//
////	ntv6jq
//	@Test	 
//	void advanceBase() { 
//		driver.findElement(By.linkText("Advanced Search")).click();
//		driver.findElement(By.id("name")).sendKeys("Juno Jacket");
//		driver.findElement(By.id("sku")).sendKeys("WJ06");
//		driver.findElement(By.id("description")).sendKeys("Jacket");
//		driver.findElement(By.id("short_description")).sendKeys("Jacket");
//		driver.findElement(By.id("price")).sendKeys("0");
//		driver.findElement(By.id("price_to")).sendKeys("");
//		driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
//		assertTrue(driver.getPageSource().contains("Jacket"));
//	}
//	
//	//	ntv6jq
//	@Test	 
//	void advanceEmpty() { 
//		driver.findElement(By.linkText("Advanced Search")).click();
//		driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
//		assertTrue(driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div")).isDisplayed());
//	}
//		
//	//ntv6jq
//	@Test	 
//	void advanceEmptyName() { 
//		driver.findElement(By.linkText("Advanced Search")).click();
//		driver.findElement(By.id("name")).sendKeys("");
//		driver.findElement(By.id("sku")).sendKeys("WJ06");
//		driver.findElement(By.id("description")).sendKeys("Jacket");
//		driver.findElement(By.id("short_description")).sendKeys("Jacket");
//		driver.findElement(By.id("price")).sendKeys("0");
//		driver.findElement(By.id("price_to")).sendKeys("");
//		driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
//		assertTrue(driver.getPageSource().contains("Jacket"));
//	}
//	
//	//ntv6jq
//	@Test	 
//	void advanceEmptyDesc() { 
//		driver.findElement(By.linkText("Advanced Search")).click();
//		driver.findElement(By.id("name")).sendKeys("Juno Jacket");
//		driver.findElement(By.id("sku")).sendKeys("WJ06");
//		driver.findElement(By.id("description")).sendKeys("");
//		driver.findElement(By.id("short_description")).sendKeys("Jacket");
//		driver.findElement(By.id("price")).sendKeys("0");
//		driver.findElement(By.id("price_to")).sendKeys("");
//		driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
//		assertTrue(driver.getPageSource().contains("Jacket"));
//	}
//	
//	//ntv6jq
//	@Test	 
//	void advanceEmptyShortDesc() { 
//		driver.findElement(By.linkText("Advanced Search")).click();
//		driver.findElement(By.id("name")).sendKeys("Juno Jacket");
//		driver.findElement(By.id("sku")).sendKeys("WJ06");
//		driver.findElement(By.id("description")).sendKeys("Jacket");
//		driver.findElement(By.id("short_description")).sendKeys("");
//		driver.findElement(By.id("price")).sendKeys("0");
//		driver.findElement(By.id("price_to")).sendKeys("");
//		driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
//		assertTrue(driver.getPageSource().contains("Jacket"));
//	}
//	
//	//ntv6jq
//	@Test	 
//	void advanceEmptySKU() { 
//		driver.findElement(By.linkText("Advanced Search")).click();
//		driver.findElement(By.id("name")).sendKeys("Juno Jacket");
//		driver.findElement(By.id("sku")).sendKeys("");
//		driver.findElement(By.id("description")).sendKeys("Jacket");
//		driver.findElement(By.id("short_description")).sendKeys("Jacket");
//		driver.findElement(By.id("price")).sendKeys("0");
//		driver.findElement(By.id("price_to")).sendKeys("");
//		driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
//		assertTrue(driver.getPageSource().contains("Jacket"));
//	//	assertTrue(driver.findElement(By.className("product-image-photo")).isDisplayed());
//	}
//	
//	//ntv6jq
//	@Test	 
//	void advanceInvalidName() { 
//		driver.findElement(By.linkText("Advanced Search")).click();
//		driver.findElement(By.id("name")).sendKeys("abcdef");
//		driver.findElement(By.id("sku")).sendKeys("WJ06");
//		driver.findElement(By.id("description")).sendKeys("Jacket");
//		driver.findElement(By.id("short_description")).sendKeys("Jacket");
//		driver.findElement(By.id("price")).sendKeys("0");
//		driver.findElement(By.id("price_to")).sendKeys("");
//		driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
//		assertFalse(driver.getPageSource().contains("Juno Jacket"));
//	}
//		
//	//ntv6jq
//	@Test	 
//	void advanceInvalidDesc() { 	
//		driver.findElement(By.linkText("Advanced Search")).click();
//		driver.findElement(By.id("name")).sendKeys("Juno Jacket");
//		driver.findElement(By.id("sku")).sendKeys("WJ06");
//		driver.findElement(By.id("description")).sendKeys("abcdef");
//		driver.findElement(By.id("short_description")).sendKeys("Jacket");
//		driver.findElement(By.id("price")).sendKeys("0");
//		driver.findElement(By.id("price_to")).sendKeys("");
//		driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
//		assertFalse(driver.getPageSource().contains("Juno Jacket"));
//		}
//	
//	//ntv6jq
//	@Test	 
//	void advanceInvalidShortDesc() { 
//		driver.findElement(By.linkText("Advanced Search")).click();
//		driver.findElement(By.id("name")).sendKeys("Juno Jacket");
//		driver.findElement(By.id("sku")).sendKeys("WJ06");
//		driver.findElement(By.id("description")).sendKeys("Jacket");
//		driver.findElement(By.id("short_description")).sendKeys("abcdef");
//		driver.findElement(By.id("price")).sendKeys("0");
//		driver.findElement(By.id("price_to")).sendKeys("");
//		driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
//		assertFalse(driver.getPageSource().contains("Juno Jacket"));
//	}
//	
//	//ntv6jq
//	@Test	 
//	void advanceInvalidSKU() { 
//		driver.findElement(By.linkText("Advanced Search")).click();
//		driver.findElement(By.id("name")).sendKeys("Juno Jacket");
//		driver.findElement(By.id("sku")).sendKeys("abcdef");
//		driver.findElement(By.id("description")).sendKeys("Jacket");
//		driver.findElement(By.id("short_description")).sendKeys("Jacket");
//		driver.findElement(By.id("price")).sendKeys("0");
//		driver.findElement(By.id("price_to")).sendKeys("");
//		driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
//		assertFalse(driver.getPageSource().contains("Juno Jacket"));
//	}
//	
//	//ntv6jq
//	@Test	 
//	void advanceAlphPrice() { 
//		driver.findElement(By.linkText("Advanced Search")).click();
//		driver.findElement(By.id("name")).sendKeys("Juno Jacket");
//		driver.findElement(By.id("sku")).sendKeys("WJ06");
//		driver.findElement(By.id("description")).sendKeys("Jacket");
//		driver.findElement(By.id("short_description")).sendKeys("Jacket");
//		driver.findElement(By.id("price")).sendKeys("A");
//		driver.findElement(By.id("price_to")).sendKeys("");
//		driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
//		assertTrue(driver.findElement(By.id("price-error")).isDisplayed());
//	}
//	
//	//ntv6jq
//	@Test	 
//	void advanceNegPrice() { 
//		driver.findElement(By.linkText("Advanced Search")).click();
//		driver.findElement(By.id("name")).sendKeys("Juno Jacket");
//		driver.findElement(By.id("sku")).sendKeys("WJ06");
//		driver.findElement(By.id("description")).sendKeys("Jacket");
//		driver.findElement(By.id("short_description")).sendKeys("Jacket");
//		driver.findElement(By.id("price")).sendKeys("-10");
//		driver.findElement(By.id("price_to")).sendKeys("");
//		driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
//		assertTrue(driver.getPageSource().contains("-10"));
//	}
//	
//	//ntv6jq
//	@Test	 
//	void advancePosPrice() { 
//		driver.findElement(By.linkText("Advanced Search")).click();
//		driver.findElement(By.id("name")).sendKeys("Juno Jacket");
//		driver.findElement(By.id("sku")).sendKeys("WJ06");
//		driver.findElement(By.id("description")).sendKeys("Jacket");
//		driver.findElement(By.id("short_description")).sendKeys("Jacket");
//		driver.findElement(By.id("price")).sendKeys("1");
//		driver.findElement(By.id("price_to")).sendKeys("80");
//		driver.findElement(By.id("name")).sendKeys(Keys.RETURN);
//		assertTrue(driver.getPageSource().contains("Jacket"));
//	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
////////////////////////////////////////////// Checkout //////////////////////////////////////////////////////////////////////////
	//lt6vc
	@Test
	void GearClckItemSelZeroQtyAddCartTest() {
		///////// Setup /////////
		driver.findElement(By.linkText("Sign In")).click();
		driver.navigate().refresh();
		driver.findElement(By.id("email")).sendKeys("ntv6jq@virginia.edu");
		driver.findElement(By.id("pass")).sendKeys("Abc123!@#");
		driver.findElement(By.id("send2")).click();
		driver.get("https://magento.softwaretestingboard.com/affirm-water-bottle.html");
		driver.navigate().refresh();
		driver.findElement(By.id("qty")).clear();
		driver.findElement(By.id("qty")).sendKeys("1");
		driver.findElement(By.id("qty")).sendKeys(Keys.TAB, Keys.RETURN);
		try {
            Thread.sleep(1500); // 5000 milliseconds = 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		driver.get("https://magento.softwaretestingboard.com/checkout/cart/");
		try {
            Thread.sleep(1500); // 5000 milliseconds = 5 seconds
        } catch (InterruptedException e) {
        }
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button")).click();
		///////// End Setup /////////
		
//		[Tunhi, Vo, 123 Sesame Street, Sunflower, 22904, 4349240311, Virginia, United States, Table Rate, Clicked, Clicked]
		driver.get("https://magento.softwaretestingboard.com/checkout/#shipping"); //debugging
		try {
            Thread.sleep(3000); // 5000 milliseconds = 5 seconds
        } catch (InterruptedException e) {
        }
		WebElement shipping = driver.findElement(By.tagName("body"));
		shipping.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.RETURN);
		try {
            Thread.sleep(1500); // 5000 milliseconds = 5 seconds
        } catch (InterruptedException e) {
        }
		shipping.sendKeys(Keys.TAB, Keys.TAB,
				"Tunhi", Keys.TAB, 
				"Vo", Keys.TAB,
				Keys.TAB,
				"123 Sesame Street", Keys.TAB, Keys.TAB, Keys.TAB,
				"Sunflower", Keys.TAB,
				"V", Keys.DOWN, Keys.DOWN, Keys.RETURN, Keys.TAB,
				"22904", Keys.TAB, Keys.TAB,
				"4349240311", Keys.TAB, Keys.TAB,
				Keys.TAB, Keys.RETURN
				);
		try {
            Thread.sleep(1500); // 5000 milliseconds = 5 seconds
        } catch (InterruptedException e) {
        }
		shipping.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.UP, Keys.TAB, Keys.RETURN);
		try {
            Thread.sleep(1500); // 5000 milliseconds = 5 seconds
        } catch (InterruptedException e) {
        }
		WebElement payment = driver.findElement(By.tagName("body"));
		payment.sendKeys(Keys.TAB, Keys.RETURN);
		try {
            Thread.sleep(3000); // 5000 milliseconds = 5 seconds
        } catch (InterruptedException e) {
        }
		System.out.println(driver.getCurrentUrl());
		assertTrue(driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/checkout/onepage/success/"));
		
		// clear address entries
		driver.get("https://magento.softwaretestingboard.com/customer/address/");
		WebElement delete = driver.findElement(By.id("search"));
		delete.click();
		delete.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.RETURN);
		try {
          Thread.sleep(3000); // 5000 milliseconds = 5 seconds
	      } catch (InterruptedException e) {
	      }
		delete.sendKeys(Keys.RETURN);
		delete = driver.findElement(By.xpath("/html/body/div[2]/footer/div/ul/li[3]/a"));
		delete.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.RETURN);
		
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
//////////////////////////////////////////////Writing a Review//////////////////////////////////////////////////////////////////////////

//	//ntv6jq
//	@Test	
//	void reviewBase() { 	
//		js = (JavascriptExecutor) driver;
//		driver.get("https://magento.softwaretestingboard.com/didi-sport-watch.html");
//		driver.findElement(By.id("tab-label-reviews")).click();
//		WebElement element = driver.findElement(By.id("Rating_5"));
//		js.executeScript("arguments[0].click();", element);
//		driver.findElement(By.id("nickname_field")).sendKeys("TuNhi");
//		driver.findElement(By.id("summary_field")).sendKeys("Watch review");
//		driver.findElement(By.id("review_field")).sendKeys("This is a review");
//		driver.findElement(By.id("nickname_field")).sendKeys(Keys.RETURN);
//		assertTrue(driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div")).isDisplayed());
//	}
//	
//	//ntv6jq
//	@Test	 
//	void reviewNostars() { 	
//		js = (JavascriptExecutor) driver;
//		driver.get("https://magento.softwaretestingboard.com/didi-sport-watch.html");
//		driver.findElement(By.id("tab-label-reviews")).click();
//		WebElement element = driver.findElement(By.id("Rating_5"));
//		driver.findElement(By.id("nickname_field")).sendKeys("TuNhi");
//		driver.findElement(By.id("summary_field")).sendKeys("Watch review");
//		driver.findElement(By.id("review_field")).sendKeys("This is a review");
//		driver.findElement(By.id("nickname_field")).sendKeys(Keys.RETURN);
//		assertTrue(driver.findElement(By.cssSelector("div.messages:nth-child(1)")).isDisplayed());
//	}
//	
//	//ntv6jq
//	@Test	 
//	void reviewEmptyName() { 	
//		js = (JavascriptExecutor) driver;
//		driver.get("https://magento.softwaretestingboard.com/didi-sport-watch.html");
//		driver.findElement(By.id("tab-label-reviews")).click();
//		WebElement element = driver.findElement(By.id("Rating_5"));
//		js.executeScript("arguments[0].click();", element);
//		driver.findElement(By.id("nickname_field")).sendKeys("");
//		driver.findElement(By.id("summary_field")).sendKeys("Watch review");
//		driver.findElement(By.id("review_field")).sendKeys("This is a review");
//		driver.findElement(By.id("nickname_field")).sendKeys(Keys.RETURN);
//		assertTrue(driver.findElement(By.cssSelector("div.messages:nth-child(1)")).isDisplayed());
//	}
//	
//	//ntv6jq
//	@Test	 
//	void reviewEmptySummary() { 	
//		js = (JavascriptExecutor) driver;
//		driver.get("https://magento.softwaretestingboard.com/didi-sport-watch.html");
//		driver.findElement(By.id("tab-label-reviews")).click();
//		WebElement element = driver.findElement(By.id("Rating_5"));
//		js.executeScript("arguments[0].click();", element);
//		driver.findElement(By.id("nickname_field")).sendKeys("TuNhi");
//		driver.findElement(By.id("summary_field")).sendKeys("");
//		driver.findElement(By.id("review_field")).sendKeys("This is a review");
//		driver.findElement(By.id("nickname_field")).sendKeys(Keys.RETURN);
//		assertTrue(driver.findElement(By.cssSelector("div.messages:nth-child(1)")).isDisplayed());
//	}
//	
//	//ntv6jq
//	@Test	 
//	void reviewEmptyReview() { 	
//		js = (JavascriptExecutor) driver;
//		driver.get("https://magento.softwaretestingboard.com/didi-sport-watch.html");
//		driver.findElement(By.id("tab-label-reviews")).click();
//		WebElement element = driver.findElement(By.id("Rating_5"));
//		js.executeScript("arguments[0].click();", element);
//		driver.findElement(By.id("nickname_field")).sendKeys("TuNhi");
//		driver.findElement(By.id("summary_field")).sendKeys("Watch review");
//		driver.findElement(By.id("review_field")).sendKeys("");
//		driver.findElement(By.id("nickname_field")).sendKeys(Keys.RETURN);
//		assertTrue(driver.findElement(By.cssSelector("div.messages:nth-child(1)")).isDisplayed());
//	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
