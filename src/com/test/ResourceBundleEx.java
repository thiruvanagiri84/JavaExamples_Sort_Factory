package com.test;

import java.util.ResourceBundle;
import java.util.*;

public class ResourceBundleEx {
	public static void main(String[] x){
		Locale defaultLocale = Locale.getDefault(); // Optional
		ResourceBundle rb = ResourceBundle.getBundle("test",defaultLocale);
		String list = rb.getString("comp.bundle.list");
		System.out.println("Value of key 'comp.bundle.list' is: "+list);
		
		//Using Java.util.enumeration - equalent to Iterator
		Enumeration<String> e = rb.getKeys();
		System.out.println("-------------");
		System.out.println("Displaying all Keys & values");
		while(e.hasMoreElements()){
			String key = e.nextElement();
			if(key != null){
				String value = rb.getString(key);
				System.out.println("Key: "+key+" ,value: "+value);
			}
		}
		
	}
}
