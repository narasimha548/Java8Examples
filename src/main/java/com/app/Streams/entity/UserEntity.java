package com.app.Streams.entity;

public class UserEntity {

	private Integer userId;
	private String userName;
	private String userAge;
	private char gender;
	private String userAddress;



	public UserEntity() {

	}
	public UserEntity(Integer userId, String userName, String userAge, char gender, String userAddress) {
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.gender = gender;
		this.userAddress = userAddress;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", gender=" + gender
				+ ", userAddress=" + userAddress + "]";
	}

	@Override
	public boolean equals(Object obj){

		if(obj==null)
			return false;

		if( ! (obj instanceof  UserEntity))
			return false;

		if(obj==this)
			return true;

		return this.getUserId()==((UserEntity)obj).getUserId();
	}


	public static void main(String[] args) {

		UserEntity usr=new UserEntity(12, "narasimha", "12", 'M', "HYD");
		UserEntity usr2=new UserEntity(12, "narasimha", "12", 'M', "HYD");

		System.out.println(" equals  ::::   "+usr.equals(usr2));
		System.out.println(" HashCode   ::::   "+usr.hashCode());
		System.out.println(" HashCode  ::::   "+usr.hashCode());


	}


}

