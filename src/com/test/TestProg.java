package com.test;

public class TestProg {
	public static void main(String[] args) {
		/*double x = 9.00;
		String y = String.valueOf(x);
		System.out.println(y);
		String h = "8";
		int z = Integer.parseInt(h);
		System.out.println(z);*/
		
		SingletonTestProg singletonTest1 = SingletonTestProg.getSingletonInstance();
		singletonTest1.testMethod();
		SingletonTestProg singletonTest2 = SingletonTestProg.getSingletonInstance();
		singletonTest2.testMethod();
		SingletonTestProg singletonTest3 = SingletonTestProg.getSingletonInstance();
		singletonTest3.testMethod();
		
	}

}
