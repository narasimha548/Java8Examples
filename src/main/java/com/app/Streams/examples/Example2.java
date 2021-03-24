package com.app.Streams.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.app.Streams.entity.UserEntity;
import com.app.Streams.model.UserDto;


public class Example2 {

	public static List<UserDto> list = null;

	public static List<UserDto> writingList() {

		list = new ArrayList<UserDto>();
		UserDto dto = new UserDto(100, "stark", "60", 'M', "USA-12-09");
		UserDto dto1 = new UserDto(101, "wick", "55", 'M', "LOSANGLES-09");
		UserDto dto2 = new UserDto(102, "wilson", "57", 'M', "florida-09");
		UserDto dto3 = new UserDto(103, "bire larson", "35", 'F', "florida-58");

		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		return list;
	}

	/**
	 * Using Java 7
	 * 
	 * Convert one object to another object List of List<UserDto> objects - ->
	 * List of List<UserEntity> objects
	 * 
	 * @param listDto
	 * @return List<UserEntity> 
	 */
	public static List<UserEntity> convertUserDtoTouserEntity(List<UserDto> listDto) {

		 System.out.println("java7 impelementation ::::   ");
		
		List<UserEntity> userEntityList = new ArrayList<UserEntity>();

		for (UserDto dto : listDto) {
			UserEntity entity = new UserEntity();
			entity.setUserId(dto.getUserId());
			entity.setUserName(dto.getUserName());
			entity.setGender(dto.getGender());
			entity.setUserAge(dto.getUserAge());
			entity.setUserAddress(dto.getUserAddress());

			userEntityList.add(entity);

		}
		return userEntityList;
	}

	/**
	 * Using Java 8
	 * 
	 * Convert one object to another object List of List<UserDto> objects - ->
	 * List of List<UserEntity> objects
	 * 
	 * @param listDto
	 * @return List<UserEntity> 
	 */
	public static List<UserEntity> convertDtoToEntity(List<UserDto> listDto) {
		 System.out.println("java8 impelementation ::::   ");
		return listDto.stream().map(temp -> {
			UserEntity entity = new UserEntity();
			entity.setUserId(temp.getUserId());
			entity.setUserName(temp.getUserName());
			entity.setGender(temp.getGender());
			entity.setUserAge(temp.getUserAge());
			entity.setUserAddress(temp.getUserAddress());
			return entity;
		}).collect(Collectors.toList());
	}
	
	
	
	
	public static UserEntity convertDtoToEntity2(List<UserDto> listDto) {
		 System.out.println("java8 impelementation ::::   ");
		return (UserEntity) Optional.ofNullable(listDto.stream().map(temp->{
			UserEntity entity = new UserEntity();
			entity.setUserId(temp.getUserId());
			entity.setUserName(temp.getUserName());
			entity.setGender(temp.getGender());
			entity.setUserAge(temp.getUserAge());
			entity.setUserAddress(temp.getUserAddress());
			return entity;
		})).get();
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		List<UserDto> listData = writingList();
		//convertUserDtoTouserEntity(listData).forEach(System.out::println);
		
		convertDtoToEntity(listData).forEach(System.out::println);

	}

}
