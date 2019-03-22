package test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.propertiesFile;
import pages.googleSearchPage;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;



public class testNG_test2_GoogleSearch2 {
	

	
	
	//private static WebDriver driver = null;
	WebDriver driver = null;
	public static String browserName = null;
//	public static void main(String[] args) {
//		
//		googleSearch();
//	}
	@BeforeTest	
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		propertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

	}
	
	//below removed "static" 
	@Test
	public void googleSearch() {
	//public static void googleSearch() {
		
		
		//goto google.ca
		driver.get("https://www.google.ca");
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		googleSearchPage.textbox_search(driver).sendKeys("selenium");
				
		
		//below should be working, but it didnot:
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		//below xpath can be found by chropath, xpath generator, or Katalon Recorder, etc.,:
		//driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).submit();
		googleSearchPage.btn_search(driver).submit();
		
				
	}
	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		//driver.quit();
		System.out.println("Test completed");
		propertiesFile.setProperties();
		
	}

}
