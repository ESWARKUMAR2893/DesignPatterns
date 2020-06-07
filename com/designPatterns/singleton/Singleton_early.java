package com.designPatterns.singleton;

public class Singleton_early {

	
	private static Singleton_early instance = new Singleton_early(); //Early, instance will be created at load time  
	
	public Singleton_early() {
	  super();
	}
	
	public static Singleton_early getInstance() {
		return instance;		
	}
	
	//created to test either it is same or different 
	public static Singleton_early getInstance_dublicate() {
		Singleton_early instance_dublicate = new Singleton_early();
		return instance_dublicate;
	}
	
	
}
