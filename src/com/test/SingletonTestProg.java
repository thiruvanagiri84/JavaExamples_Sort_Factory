package com.test;

public class SingletonTestProg {
	
	private static SingletonTestProg singletonInstance = null;
	
	private SingletonTestProg(){
		
	}
	
	public  static SingletonTestProg getSingletonInstance(){
		
		if(singletonInstance == null){
			singletonInstance = new SingletonTestProg();
			System.out.println("Creating object");
		}
		return singletonInstance;
		
	}
	
	public void testMethod(){
		System.out.println("in test method");
	}
	
}
