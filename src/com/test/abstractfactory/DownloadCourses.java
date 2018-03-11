package com.test.abstractfactory;

public class DownloadCourses extends Course {

	@Override
	public void getCourseBasedOnFormat() {
		System.out.println("inside download");
	}

}
