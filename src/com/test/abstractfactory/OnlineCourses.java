package com.test.abstractfactory;

public class OnlineCourses extends Course {

	@Override
	public void getCourseBasedOnFormat() {
		System.out.println("inside online format");
	}
}
