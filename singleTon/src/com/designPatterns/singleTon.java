package com.designPatterns;

public class singleTon {

	private static singleTon instance;

	public singleTon() {
		super();
	}
	
	
	public static singleTon getInstance() {
		
		
		if (null == instance) {
			
			synchronized (singleTon.class) {
				
				if(null == instance) {
					
					instance = new singleTon();
				}
			}
			
			
		}
		
		return instance;
		
	}
	
	
	
}
