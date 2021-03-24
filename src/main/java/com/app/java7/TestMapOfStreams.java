package com.app.java7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.app.Streams.model.Staff;
import com.app.Streams.model.StaffPublic;

public class TestMapOfStreams {

	public static void main(String[] args) {

		List<Staff> list = Arrays.asList(new Staff("narasimha", 27, new BigDecimal(32000)),
				new Staff("prasad", 25, new BigDecimal(31000)), new Staff("th", 30, new BigDecimal(25000)));
		
		List<String> list12 = Arrays.asList("banana","mango","pine apple","apple");
	List<String> list2 =new ArrayList<>(list12);
/*		list2.add("banana");
		list2.add("mango");
		list2.add("apple");
		list2.add("pineapple");*/
     
	//concurrent modification exception
	   Iterator<String> iterator = list2.iterator();
		     
		     while (iterator.hasNext()) {
			String sf = (String) iterator.next();
				
				  if(sf.equals("mango")){
					list2.add("grapes");
				  }
			}
		
		

		List<StaffPublic> list3 = TestMapOfStreams.mapping(list);
		System.out.println("staff public  java7 ::::   " + list3);
		

		List<StaffPublic> list23= TestMapOfStreams.mappingUserDefinedObject(list);
		System.out.println("staff public  java8 ::::   " + list23);

	}
	/**
	 * Using Java 8  to map the user defined class
	 * 
	 * @param lst
	 * @return List<StaffPublic>
	 */
	private static List<StaffPublic> mappingUserDefinedObject(List<Staff> lst) {

		return lst.stream().map(temp -> {

			StaffPublic obj = new StaffPublic();
			obj.setAge(temp.getAge());
			obj.setName(temp.getName());
			if ("narasimha".equals(temp.getName())) {
				obj.setExtraFiled("Narasimha Prasad");
			}
			return obj;
		}).collect(Collectors.toList());

	}

	/**
	 * Using Java 7 to map the user defined class
	 * 
	 * @param lst
	 * @return List<StaffPublic>
	 */
	private static List<StaffPublic> mapping(List<Staff> lst) {

		List<StaffPublic> st = new ArrayList<StaffPublic>();

		for (Staff s : lst) {
			StaffPublic sp = new StaffPublic();
			sp.setName(s.getName());
			sp.setAge(s.getAge());

			if ("narasimha".equals(s.getName())) {
				sp.setExtraFiled("Narasimha Prasad");
			}

			st.add(sp);
		}

		return st;
	}

}
