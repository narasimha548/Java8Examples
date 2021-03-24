package com.app.Streams.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("BMW","AUDI","SUZUKI","ROYAL ENFILED","JAGUVAR","MARUTHI","FORD","TATA","TOYOTA");
		
		List<String> list2 = list.stream().filter(s->!"".equals("ROYAL ENFILED")).collect(Collectors.toList());
		
		System.out.println(list2);
		
		list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
	}

	
	public static List<String> processListOfCars(List<String>  listOfCars){
		
		return listOfCars.stream().filter(s->!"SUZUKI".equals(s)).collect(Collectors.toList());
	}
	
	
public  List<String> sort(List<String>  listOfCars){
		
		return listOfCars.stream().sorted().collect(Collectors.toList());
	}
}
