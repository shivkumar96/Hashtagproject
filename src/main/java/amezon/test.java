package amezon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {
@SuppressWarnings("deprecation")
static WebDriver driver;
@SuppressWarnings("deprecation")
@BeforeMethod
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivkumar\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	hrmlogin login=new hrmlogin(driver);
	
    login.user();
    login.pass();
    login.clickele();
    
    homepage home= new homepage(driver);
    home.logoverify();
}

@Test 
public void test() {
	
}
    
    @AfterMethod
    
    public void TearDown ()
    {
    driver.close();
    }



}
