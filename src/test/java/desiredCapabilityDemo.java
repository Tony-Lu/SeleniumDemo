import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desiredCapabilityDemo {
	
	
	
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		System.setProperty("webdriver.ie.driver", projectPath+"\\drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(caps);
		
		driver.get("https://www.google.ca");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.xpath("(//input[@name='btnK'])")).submit();
		
		driver.close();
		driver.quit();
	}

}
