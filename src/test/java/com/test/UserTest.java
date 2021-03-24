package com.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.app.controller.UserController;
import com.app.service.UserService;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UserController.class)
public class UserTest {
	
	private UserService mockService;
	private UserController userController;
	
	@Test
	public void testUserCount(){
		 
		//mocking service class
		mockService = PowerMockito.mock(UserService.class);
		PowerMockito.when(mockService.getUserCount()).thenReturn(200l);
		
		//Inject mocked service class into controller
		 userController=new UserController(mockService);
		
		//System.out.println("actual value is ::: "+userController.getUserCount());
		
		Assert.assertNotEquals(100l, userController.getUserCount().longValue());
		
	}
	
	@Test
	public void  userSearchTest(){
		mockService=PowerMockito.mock(UserService.class);
		PowerMockito.when(mockService.searchUser("tarak")).thenReturn("tarak");
		
		//injecting the mocked service 
		userController=new UserController(mockService);
		
		Assert.assertEquals("ravi", userController.searchUser());
	}
	

}
