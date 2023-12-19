package hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class login {
	
	
	@FindBy(xpath="//input[@name=\"username\"]")
		WebElement username;
	
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement click;
	
	public login(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void userid() {
		
		username.sendKeys("Admin");
		
	}
	
	public void pass() {
		password.sendKeys("admin123");
	}
	
	public void click() {
		click.click();	
		
	
	}
}
