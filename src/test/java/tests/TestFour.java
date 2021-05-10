package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.base;

public class TestFour extends base {

	@Test
	public void testfour() throws IOException {
		System.out.println("this is test four");
	WebDriver	driver = initializedriver();
		
		driver.get(prop.getProperty("url"));
		
	}
}
