package com.test.abstractfactory;

public class FirmCourseFactoryImpl implements FirmCourseFactory {

	@Override
	public Course getCourses(String format) {
		Course course = null;
		if(format.equalsIgnoreCase("cd")){
			course = new Cdcourses();
		}else if(format.equalsIgnoreCase("live")){
			course = new LiveCourses();
		}else{
			return null;
		}
		return course;
	}
}
