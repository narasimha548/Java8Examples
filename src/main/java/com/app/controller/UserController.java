package com.app.controller;

import com.app.service.UserService;

public class UserController {
	
	  UserController(){
		
	}
	
	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	public Long getUserCount(){
		return userService.getUserCount();
	}
	
	public String searchUser(){
		return userService.searchUser("tarak");
	}

}
