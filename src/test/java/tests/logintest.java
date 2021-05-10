package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.accountpage;
import pageobjects.landingpage;
import pageobjects.loginpage;
import resources.base;

public class logintest extends base {
	WebDriver driver;
	Logger log;

	@Test(dataProvider="getlogindata")
	public void login(String email,String password,String expectedResult) throws IOException, InterruptedException {
		

		landingpage landingpage = new landingpage(driver);

		landingpage.myAccountDropdown().click();
		log.debug("clicked on my accountdropdown");
		landingpage.loginoption().click();
		log.debug("clicked on login option");
		Thread.sleep(3000);
		loginpage loginpage = new loginpage(driver);
		Thread.sleep(3000);
		loginpage.emailaddress().sendKeys(email);
		log.debug("email entered");
		loginpage.password().sendKeys(password);
		log.debug("password entered");
		loginpage.loginbutton().click();
		log.debug("clicked on login button");
		accountpage accountpage = new accountpage(driver);
		
		String actualresult =null;
		try {
		//Assert.assertTrue(accountpage.accountinfo().isDisplayed());

	if(accountpage.accountinfo().isDisplayed()) {
	 actualresult="successful";
	}
	}
	catch(Exception e) {
		actualresult="failure";
		log.debug("user didnt login");
	}
		Assert.assertEquals(actualresult,expectedResult);
	}

	@BeforeMethod
	public void openapplication() throws IOException {
		log =LogManager.getLogger(logintest.class.getName());
		driver = initializedriver();
		log.debug("browser launched");
		driver.get(prop.getProperty("url"));
		log.debug("navigated to url");
		
	}
	
	@AfterMethod
	public void closure() {
		driver.close();

	}

	@DataProvider
	public Object[][] getlogindata() {

		Object[][] data= {{"arun.selenium@gmail.com","Second@123","successful"},{"dummy@test.com","dummy","failure"}};
	return data;
	}

}
