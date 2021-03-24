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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gender;
		result = prime * result + ((userAddress == null) ? 0 : userAddress.hashCode());
		result = prime * result + ((userAge == null) ? 0 : userAge.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserEntity other = (UserEntity) obj;
		if (gender != other.gender)
			return false;
		if (userAddress == null) {
			if (other.userAddress != null)
				return false;
		} else if (!userAddress.equals(other.userAddress))
			return false;
		if (userAge == null) {
			if (other.userAge != null)
				return false;
		} else if (!userAge.equals(other.userAge))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}


	public static void main(String[] args) {

		UserEntity usr=new UserEntity(12, "narasimha", "12", 'M', "HYD");
		UserEntity usr2=new UserEntity(12, "narasimha", "12", 'M', "HYD");

		System.out.println(" equals  ::::   "+usr.equals(usr2));
		System.out.println(" HashCode   ::::   "+usr.hashCode());
		System.out.println(" HashCode  ::::   "+usr.hashCode());


	}


}

