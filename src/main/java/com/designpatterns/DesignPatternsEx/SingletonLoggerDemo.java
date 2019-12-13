package com.designpatterns.DesignPatternsEx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonLoggerDemo {
	private static Logger logger;
	private SingletonLoggerDemo() {
		
	}
	
	public static Logger getLoggerObj() {
		if(logger==null) {
			logger= LoggerFactory.getLogger(SingletonEx.class);
			//logger.info("Logger Object Created");
		}
		return logger;	
	}
}
