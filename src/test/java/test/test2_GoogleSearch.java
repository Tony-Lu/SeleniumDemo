package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googleSearchPage;

public class test2_GoogleSearch {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearch();
	}
	
	public static void googleSearch() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath: "+ projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//goto google.ca
		driver.get("https://www.google.ca");
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		googleSearchPage.textbox_search(driver).sendKeys("selenium");
				
		
		//below should be working, but it didnot:
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		//below xpath can be found by chropath, xpath generator, or Katalon Recorder, etc.,:
		//driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).submit();
		googleSearchPage.btn_search(driver).submit();
		driver.close();
		
		System.out.println("Test completed");
		
		
		
		
		
	}
	

}
