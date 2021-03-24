package com.app.Streams.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_TABLE")
public class UserDto {
	
	@Id
	private Integer userId;
	private String userName;
	private String userAge;
	private char gender;
	private String userAddress;
	
	
	
	public UserDto() {
		
	}
	public UserDto(Integer userId, String userName, String userAge, char gender, String userAddress) {
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
	
	
	
	

}
