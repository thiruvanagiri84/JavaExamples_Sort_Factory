package com.test.abstractfactory;

public class LiveCourses extends Course {

	@Override
	public void getCourseBasedOnFormat() {
		System.out.println("inside live format");
	}

}
