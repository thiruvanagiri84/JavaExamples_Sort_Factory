package com.test.factory;

import java.util.Scanner;

public class FactoryClient {

	public static void main(String[] args) {
		
		
		String format = null;
		Course course = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Format");
		if(scan.hasNextLine()){
			format = scan.nextLine();
		}
		System.out.println("Format: "+format);
		
		ThomsonCourseFactory factory = new ThomsonCourseFactoryImpl();
		course = factory.getCourses(format);
		course.getCourseBasedOnFormat();
		
		//Code without factory
		/*if(format.equalsIgnoreCase("online")){
			course = new OnlineCourses();
		}else if(format.equalsIgnoreCase("download")){
			course = new DownloadCourses();
		}
		course.getCourseBasedOnFormat();*/
	}	
}
