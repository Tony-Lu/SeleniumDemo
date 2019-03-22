package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class htmlUnitDriverDemo {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup(); 
		
		// adding browser version: WebDriverManager.chromedriver().version("2.36").setup();
		//WebDriver driver = new ChromeDriver();	
		
		WebDriver driver = new HtmlUnitDriver();   // not working for unknown reason
		driver.manage().window().maximize();
		/////////driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("before login , title is: " +driver.getTitle());
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("after login , title is: " + driver.getTitle());
		driver.close();
		

	}

}
