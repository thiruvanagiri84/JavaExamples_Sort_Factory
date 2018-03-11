package com.test.factory;

public class ThomsonCourseFactoryImpl implements ThomsonCourseFactory {

	@Override
	public Course getCourses(String format) {
		Course course = null;
		if(format.equalsIgnoreCase("online")){
			course = new OnlineCourses();
		}else if(format.equalsIgnoreCase("download")){
			course = new DownloadCourses();
		}else{
			return null;
		}
		return course;
	}

}
