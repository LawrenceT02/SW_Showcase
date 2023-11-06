package sut;

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
	private String url = "https://cs3250.uk.r.appspot.com/hwWhatWouldYouLike";

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
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void basecaseTest() {
//		[value, ntv6jq@virginia.edu (valid), Abc123!@#, match, clicked]
//		assertTrue()
//		fuck eclipse this shit is fuking dumb
	}

}
