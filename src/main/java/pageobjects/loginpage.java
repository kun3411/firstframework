package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver driver;

	public loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "input-email")
	WebElement emailaddress;
	@FindBy(id = "input-password")
	WebElement password;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/input")
	WebElement loginbutton;

	public WebElement emailaddress() {
		return emailaddress;

	}

	public WebElement password() {
		return password;
	}

	public WebElement loginbutton() {
		return loginbutton;
	}
}
