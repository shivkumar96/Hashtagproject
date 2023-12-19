package hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	@FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[6]")
	WebElement clickElement;
	
	@FindBy(xpath="//input[@placeholder=\"First Name\"]")
	WebElement first;
	
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ele() {
		
		clickElement.click();
	}
	
	public void text() {
		first.sendKeys("shiv");
	}

}
