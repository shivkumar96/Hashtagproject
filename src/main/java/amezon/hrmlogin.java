package amezon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hrmlogin {
	
	@FindBy(xpath="//input[@name=\"username\"]")
	WebElement username;
	
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement  click;
	public hrmlogin (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void user() {
		
		username.sendKeys("Admin");
		
	}
	
	public void pass() {
		
		password.sendKeys("admin123");
		
	}
	
	public void clickele () {
		
		click.click();
		
	}
    

}
