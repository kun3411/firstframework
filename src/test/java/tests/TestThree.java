package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.base;

public class TestThree extends base{
	@Test
	public void testthree() throws IOException {
		System.out.println("this is test three");
	WebDriver	driver = initializedriver();
		
		driver.get(prop.getProperty("url"));
		
	}

}
