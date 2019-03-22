package test;

import java.sql.DriverManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googleSearchPageObj;

public class test2_1_GoogleSearch {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearchObj();
		
		
	}
	
	public static void googleSearchObj() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		googleSearchPageObj searchPageObj = new googleSearchPageObj(driver);
		
		driver.get("https://www.google.ca");
		
		searchPageObj.setTxtBoxSearch("selenium");
		searchPageObj.clickSearchBtn();
		driver.close();
		
		System.out.println("Test completed");
		
	}

}
