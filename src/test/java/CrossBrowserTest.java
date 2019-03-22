
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CrossBrowserTest {
	public static void main(String[] args) throws Exception {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath: "+ projectPath);
		
//		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		
		// below is for headless chrome
		//=============================================
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
//		WebDriver driver = new ChromeDriver(options);
		//=============================================
		
		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.ie.driver", projectPath+"\\drivers\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.ca");
		System.out.println(driver.getTitle());
		
		WebElement inputbox = driver.findElement(By.name("q"));
		inputbox.sendKeys("selenium");
		
		WebElement searchBtn = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));		
		searchBtn.submit();
		
//		FirefoxProfile profile = new FirefoxProfile()
//		profile.setAcceptUntrustedCertificates(true);
//		profile.setAssumeUntrustedCertificateIssuer(false);
		//driver = new FirefoxDriver(profile);
//		
//		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
//		int count = listOfInputElements.size();
//		
//		
//		System.out.println("Count of Input elements: " + count);
		
		//==============================================================
		//below is for demo: AutoIT : upload a .txt file:
//		driver.get("http://www.tinyupload.com/");
//		System.out.println(driver.getTitle());
//		
//		WebElement element = driver.findElement(By.name("uploaded_file"));
//		element.click();
//		Thread.sleep(2000);
		
		//========================================================
		//below step is for AutoIT execution file: uploadDemo.exe:
//		Runtime.getRuntime().exec("F:\\AutoIT\\uploadDemo.exe");
//		Thread.sleep(10000);
		//===================================================
		
//		WebElement uploadBtn = driver.findElement(By.xpath("//img[@alt='Upload']"));		
//		uploadBtn.submit();//Click();
		
		System.out.println("Test completed");
		
		
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		driver.close();
	}
	
//	public void waitForElementPresent(String element, int timeout) {
//		
//	}
	

}
