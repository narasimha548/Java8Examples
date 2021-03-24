package com.app.service;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.app.Streams.model.UserDto;

@Lazy
@Service
public class UserServiceImpl implements UserService {

	@Override
	public long getUserCount() {

		return 0;
	}

	@Override
	public String searchUser(String user) {
		//user = "tarak";

		String output = "";
		List<String> lst = Arrays.asList("mahesh babu", "pawan kalyan", "tarak");

		for (String s : lst) {
			if (s.equals("tarak")) {
				output = s;
			}
		}

		return output;
	}

	@Override
	public String addUser() {
		UserDto dto=new UserDto();
		dto.setUserId(1);
		dto.setUserName("gmail");
		dto.setUserAge("23");
		dto.setGender('M');
		dto.setUserAddress("serthhjjk");
		return null;
	}
	
	@PostConstruct
	public void initilize(){
		System.out.println("UsedrDto initalized:::: ");
	}
	

}
