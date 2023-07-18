package Hashtag;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class signinpagescript {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
		
		WebElement element=driver.findElement(By.xpath("//button[text()='APPLY NOW']"));

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(false);", element);
		
		WebElement name=driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		name.sendKeys("shivkumar manmath pandharpure");
		
		WebElement Email=driver.findElement(By.xpath("//input[@type=\"email\"]"));
		Email.sendKeys("shivkumarswami8938@gmail.com");
		
		WebElement num=driver.findElement(By.xpath("//input[@type=\"number\"]"));
		num.sendKeys("9923008027");

		Thread.sleep(2000);

		WebElement resume=driver.findElement(By.xpath("//input[@type=\"file\"]"));
		resume.sendKeys("C:\\Users\\Shivkumar\\Downloads\\Resume b (1).docx");
		
		Thread.sleep(2000);

		WebElement descr=driver.findElement(By.xpath("//textarea[@name=\"description\"]"));
		descr.sendKeys("Over 2.7+ Years’ Experience as a Automation Test Engineer extensively worked on manual testing, Automation testing, API testing of web applications. Experience on various domains such as e-commerce, Investment banking.");
		
		Thread.sleep(2000);

		WebElement applynow=driver.findElement(By.xpath("//button[@class=\"btn form-button font-12 font-bold\"]"));
		applynow.click();
		
		WebElement errortext=driver.findElement(By.xpath("//p[text()='something went wrong! please try again later']"));
		
		String Expectedtext=errortext.getText();
		
		System.out.println(Expectedtext );
		
		String actual="something went wrong! please try again later";
		
		if(Expectedtext .equals(actual))
		{
			System.out.println("form is sucessfully submitted ");
		}
		else {
			
			System.out.println("error ");
		
		}
		
		driver.close();

	}

}
