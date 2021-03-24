package com.app.Streams.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.app.Streams.model.UserDto;

public class SortingCustomObjects {
	
	public static    List<UserDto> list=null;
	
	public static List<UserDto>  writingList(){
		
		list=new ArrayList<UserDto>();
		  UserDto dto=new UserDto(104, "stark", "60", 'M', "USA-12-09");
		  UserDto dto1=new UserDto(101, "wick", "55", 'M', "LOSANGLES-09");
		  UserDto dto2=new UserDto(102, "wilson", "57", 'M', "florida-09");
		  UserDto dto3=new UserDto(103, "bire larson", "35", 'F', "florida-58");
		  
		  list.add(dto);
		  list.add(dto1);
		  list.add(dto2);
		  list.add(dto3);
		return list;
	}
	
	private static List<UserDto> sortingListByUserAge(List<UserDto>  listDto){
		
		//List<UserDto> list2 = list;
		//list2.sort(Comparator.comparing(UserDto::getUserAge));
		
        List<UserDto> list2 = listDto.stream().sorted(Comparator.comparing(UserDto::getUserAge)).collect(Collectors.toList());
       // List<UserDto> list2 = listDto.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
    	return list2;
	}
	
	public static void main(String[] args) {
		 
		
		List<UserDto> listData = writingList();
		System.out.println("before sorting ::::   "+listData);
		
		/*
		 * Java 8 streams with map 
		 * Get the List<String>  from userdto object using map
		 * 
		 */
		List<String> collect = listData.stream().map(UserDto::getUserName).collect(Collectors.toList());
		
		//System.out.println(collect);
		
		// Sorting List data using java8 concept
		 List<UserDto> sortingList =  sortingListByUserAge(listData);
		 
		 System.out.println("after sorting the list:::  \n ");
		 
		sortingList.forEach(System.out::println);
	}

}
