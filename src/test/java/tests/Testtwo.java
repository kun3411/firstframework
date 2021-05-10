package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.base;

public class Testtwo extends base {
	@Test
	public void testtwo() throws IOException {
		System.out.println("this is test two");
	WebDriver	driver = initializedriver();
		
		driver.get(prop.getProperty("url"));
		
	}

}
