package test_base_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import home_page.form;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test_base_class {
	
	public static WebDriver driver ;
	public String browser = "chrome";

	public static form form;
	
	
	
	/*
	 * @BeforeClass public void start() {
	 * 
	 * }
	 */
	
	@BeforeMethod
	public void setup()
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else 
		{
			System.out.println("Please Provied Correct Browser Name");
		}
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		form = new form();
		
		
	}
	
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
	/*
	 * @AfterClass public void end() {
	 * 
	 * }
	 */



}
