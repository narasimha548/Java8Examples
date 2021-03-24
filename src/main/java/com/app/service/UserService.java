package com.app.service;

import com.app.Streams.model.UserDto;

public interface UserService {
	  long getUserCount();
	  String searchUser(String user);
	  
	  String addUser();

}
