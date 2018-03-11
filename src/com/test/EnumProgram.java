package com.test;

public class EnumProgram {
 
	public enum Company {
		EBAY, PAYPAL, GOOGLE, YAHOO, ATT
	}
 
	Company cName;
 
	public EnumProgram(Company cName) {
		this.cName = cName;
	}
 
	public void companyDetails() {
		switch (cName) {
		case EBAY:
			System.out.println("Biggest Market Place in the World.");
			break;
 
		case PAYPAL:
			System.out.println("Simplest way to manage Money.");
			break;
 
		case GOOGLE:
		case YAHOO:
			System.out.println("1st Web 2.0 Company.");
			break;
 
		default:
			System.out.println("Google - biggest search giant.. ATT - my carrier provider..");
			break;
		}
	}
 
	public static void main(String[] args) {
		EnumProgram ebay = new EnumProgram(Company.EBAY);
		ebay.companyDetails();
		EnumProgram paypal = new EnumProgram(Company.PAYPAL);
		paypal.companyDetails();
		EnumProgram google = new EnumProgram(Company.GOOGLE);
		google.companyDetails();
		EnumProgram yahoo = new EnumProgram(Company.YAHOO);
		yahoo.companyDetails();
		EnumProgram att = new EnumProgram(Company.ATT);
		att.companyDetails(); // Default will be executed here since there is no case for ATT
		Company[] s = Company.values();
		System.out.println(s[2]);
	}
}