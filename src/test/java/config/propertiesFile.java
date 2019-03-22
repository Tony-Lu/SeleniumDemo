package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.testNG_test2_GoogleSearch2;

public class propertiesFile {

	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getProperties();
		setProperties();
		getProperties();

	}

	public static void getProperties() {

		try {			

			InputStream input = new FileInputStream(projectPath + "\\src\\test\\java\\config\\config.properties");

			prop.load(input);
			String browser =  prop.getProperty("browser");
			System.out.println(browser);
			testNG_test2_GoogleSearch2.browserName = browser;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}		

	}	

	public static void setProperties() {

		try {
			OutputStream output = new FileOutputStream(projectPath + "\\src\\test\\java\\config\\config.properties");
			
			prop.setProperty("result", "pass");
			try {
				prop.store(output, null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}

}
