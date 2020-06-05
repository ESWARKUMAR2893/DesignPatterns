package com.designPatterns;


public class testSingleTon {

	public static void main(String[] args) {
 
		 
		singleTon single1 = singleTon.getInstance();
		singleTon single2 = singleTon.getInstance();
		
		if (single1 == single2) {
			System.out.println("singleton is clean");
		}
		
		
		
		
	}
	
	
}
