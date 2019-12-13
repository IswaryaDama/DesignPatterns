package com.designpatterns.DesignPatternsEx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonEx {
	 
			public static void main(String[] args) {
			Logger l1 = SingletonLoggerDemo.getLoggerObj();
			Logger l2 = SingletonLoggerDemo.getLoggerObj();
			if(l1==l2) {
				System.out.println("both objects are sme as its singleton pattern");
			}
				//logger.info("Logger Object Created");
			}
		
}
