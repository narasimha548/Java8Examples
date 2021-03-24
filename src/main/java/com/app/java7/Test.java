package com.app.java7;

import java.util.ArrayList;
import java.util.List;
import com.app.Streams.model.Staff;

public class Test {

	public static void main(String[] args) {

		/*
		 * TestSingleton s=new TestSingleton();
		 * 
		 * System.out.println("s :::  "+s);
		 * 
		 */
		String s1CurrencyCode="";
		String split[]={"840"};
		
		System.out.println(split[0].isEmpty());
	//	s1CurrencyCode=!split[0].isEmpty()? split[0]:s1CurrencyCode;
		
		s1CurrencyCode=!split[0].isEmpty()? getBranchCodeBasedT24Branch(split[0]):s1CurrencyCode;
		
		System.out.println(s1CurrencyCode);
		
		
		
		int batch=100;
		int records=200;
		
		
		if(records%batch==0){
			System.out.println("first batch ");
		}
		
		String s3="PROP.5816931017154278";
		
		String data="";
		
		 String  b= data.isEmpty() ?"EMPTY":"Not empty";
		 
		 System.out.println(b);
		
		System.out.println(s3.length());
		System.out.println(s3.substring(5, 21).substring(0, 6));
		
		Staff s = new Staff();
		s.setAge(12);
		s.setName("test");
		// s.se

		List de = new ArrayList<>();
		de.add(null);
		de.add("test");
		de.add("TEST");

		List l = new ArrayList<>();
		l.add(12);
		l.add("test");
		l.add(s);
		l.add(de);
		
		int count1=0;

		Staff s1 = (Staff) l.get(2);
		List le = (List) l.get(3);
		
		if(le.contains(s1.getName())){
			System.out.println("true condtions"+count1);
			count1++;
		}
		
/*
		int batchSize = 100;
		int count = 0;

		for (int i = 0; i < 1502; i++) {

			count++;

			if (count % batchSize == 0) {
				System.out.println(" count value is " + count);
			}

			if (i == 1501) {
				System.out.println(" i values is more than 1500 " + i);
			}

		}*/

		/*
		 * int size=0; String bs=""; String string = bs==null ? "NULL" : bs;
		 * System.out.println(string);
		 * 
		 * int[] updateCounts = new int[size]; System.out.println(
		 * "update counts size ::::   "+updateCounts.length);
		 * 
		 * List<String> lst=new ArrayList<String>(); lst.add("20303006");
		 * lst.add("20303007"); lst.add(""); lst.add(""); lst.add("");
		 * lst.add(""); lst.add(""); lst.add(""); lst.add(""); lst.add("");
		 * lst.add(""); lst.add("");
		 * 
		 * 
		 * 
		 * String acct = "595620"; System.out.println("s :::  " +
		 * acct.length()); if ( acct.isEmpty() || "".equals(acct) &&
		 * acct.length() != 9 && acct.length() != 10) { System.out.println(
		 * " Account number Empty ::::: "); } else { System.out.println(
		 * " true condition length ::::  " + acct.length()); }
		 */

	}
	
	public static String getBranchCodeBasedT24Branch(String departmentAcctOfficer){
		System.out.println("depart acct officer ::: "+departmentAcctOfficer);
		return departmentAcctOfficer;
	}

}
