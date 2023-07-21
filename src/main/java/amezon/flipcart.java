package amezon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class flipcart {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("iphone13");
	List<WebElement> option=driver.findElements(By.xpath("//ul[@class=\"col-12-12 _1MRYA1 _38UFBk\"]//li"));
	int size=option.size();
	System.out.println(size);
	Thread.sleep(size);
	for(int i=0;i<=size; i++) {
		
		String alloptions=option.get(i).getText();
		System.out.println(alloptions);
		
		if(alloptions.equals("iphone13"))
		{
	           option.get(i).getText();
		}
	}

	
	
}
}
