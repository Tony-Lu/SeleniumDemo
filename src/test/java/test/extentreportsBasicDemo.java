package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreportsBasicDemo {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google search Test one", "this is a test to validate this functionality");
        
        String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();			
        
		test1.log(Status.INFO, "Starting test case");		
		
		driver.get("https://www.google.ca");
		test1.pass("Navigated to google.ca");
		
		driver.findElement(By.xpath("(//input[@name='q'])")).sendKeys("selenium");
		//driver.findElement(By.name("q")).sendKeys("selenium");
		test1.pass("test data entered to searchBox");
		
		driver.findElement(By.xpath("(//input[@name='btnK'])")).submit();
		//driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).submit();
		test1.pass("click the searchBtn");
		
		driver.close();
		driver.quit();
		test1.pass("Test completed");
		
		test1.info("test completed");
		
		// calling flush writes everything to the log file
        extent.flush();
	}

}
