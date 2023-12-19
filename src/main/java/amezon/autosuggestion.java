package amezon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class autosuggestion {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone13");
		Thread.sleep(2000);
		List<WebElement> option=driver.findElements(By.xpath("//div[@class=\"s-suggestion-container\"]"));
		int size=option.size();
		System.out.println(size);
		Thread.sleep(2000);
		
		for(WebElement suggestion:option)
		{
			String alloptinos=suggestion.getText();
			System.out.println(alloptinos);
			if(alloptinos.equals("iphone13, red, 64 gb"))
			{      suggestion.click();	}
		
	}
      driver.close();
	}

}
