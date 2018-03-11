package com.test;

import java.util.Enumeration;
import java.util.Vector;

public class CollectionsTestProg {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		vec.add("one");
		vec.add("two");
		
		Enumeration<String> enumerator = vec.elements();
		while(enumerator.hasMoreElements()){
			System.out.println(enumerator.nextElement());
		}
	}

}
