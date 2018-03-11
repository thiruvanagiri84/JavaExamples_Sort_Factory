package com.test.abstractfactory;

public class TrtaOrFirmFactoryImpl implements TrtaOrFirmFactory {

	@Override
	public TestInterface getTrtaOrFirmFactory(String collegeType) {
		TestInterface thomsonOrFirmFactory = null;
		if(collegeType.equalsIgnoreCase("trta")){
			thomsonOrFirmFactory = new ThomsonCourseFactoryImpl();
		}else if(collegeType.equalsIgnoreCase("firm")){
			thomsonOrFirmFactory = new FirmCourseFactoryImpl();
		}else{
			System.out.println("Not a valid input");
		}
		return thomsonOrFirmFactory;
	}

}
