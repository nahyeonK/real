package com.your.dream.real;

import static com.sun.activation.registries.LogSupport.log;

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
	
    public static void main( String[] args ) {
    	for(String arg : args) {
    		log("parameter: " + arg);
    	}
    }
}
