package amezon;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	@FindBy(xpath="//img[@alt=\"client brand banner\"]")
	
	WebElement logoElement;
	
	
	
	public homepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
     
	
	
	public void logoverify() {
		boolean b=logoElement.isDisplayed();
		System.out.println(b);
		
		assertEquals(true, logoElement.isDisplayed());
		
	}
}
