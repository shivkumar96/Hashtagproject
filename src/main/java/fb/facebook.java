package fb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shivkumar\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe\\\\");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("shivkumar@123");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("shivkumar@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[contains(text(),\"Create new account\")]")).click();
		
		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		
		Select s=new Select(day);
		
		s.selectByIndex(20);
		//Thread.sleep(3000);
		
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select s2=new Select(month);

		s2.selectByIndex(10);

		//Thread.sleep(3000);

		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select s3=new Select(year);

		s3.selectByIndex(20);
		
		//driver.findElement(By.xpath("//label[text()=\"Female\"]")).click();
		List<WebElement> radio=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		
		int size=radio.size();
		System.out.println(size);
		
		for(WebElement all: radio) {
			all.click();
		}
		
		boolean b=driver.findElement(By.xpath("//label[text()='Custom']")).isSelected();
	    System.out.println(b);
		
	}

}
