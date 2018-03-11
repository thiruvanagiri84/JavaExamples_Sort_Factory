package com.test.abstractfactory;

public class AbstractFactoryClient {

	public static void main(String[] args) {
		
		TestInterface test = null;
		Course course = null;
		TrtaOrFirmFactory thomsonOrFirmFactory = new TrtaOrFirmFactoryImpl();
		test = thomsonOrFirmFactory.getTrtaOrFirmFactory("firm");
		
		course = test.getCourses("live");
		course.getCourseBasedOnFormat();
		
	}	
}
