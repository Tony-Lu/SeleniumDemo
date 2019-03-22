package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class googleSearchPageObj {
	
	WebDriver driver = null;
	
	By txtBox_search = By.name("q");
	By btnSearch = By.xpath("(//input[@name='btnK'])[2]");
	
	public googleSearchPageObj(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setTxtBoxSearch(String text) {
		
		driver.findElement(txtBox_search).sendKeys(text);
		
	}
	
	public void clickSearchBtn() {
		driver.findElement(btnSearch).submit();
	}

}
