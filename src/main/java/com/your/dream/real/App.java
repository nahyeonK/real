package com.your.dream.real;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private App()
	{
		// do not create App class directly
	}

	public static void main(String[] args) {
		final Logger logger = Logger.getLogger(App.class.getName());
    	for(String arg : args) {
    		logger.log(Level.FINE, "parameter: {}", arg);
    	}
    }
}
