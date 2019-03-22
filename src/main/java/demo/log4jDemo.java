package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class log4jDemo {
	
	private static Logger logger = LogManager.getLogger(log4jDemo.class);
	

	public static void main(String[] args) {
		
		System.out.println("Hello World... !    \n");
		
		logger.trace("This is trace msg");
		logger.info("this is a info msg");
		logger.error("this is error msg");
		logger.warn("This is warn msg");
		logger.fatal("This is warn msg");
		
		System.out.println("\n Completed");
		
	}

}
