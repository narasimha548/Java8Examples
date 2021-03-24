package org.springframework.application.context.lazyloading;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.service.UserService;
import com.app.service.UserServiceImpl;

public class LazyLoadExampleWithApplicationContext {
	
	//private static AnnotationConfigApplicationContext annotationConfigApplicationContext;

	public static void main(String[] args) {
		
		ApplicationContext ctx  = new AnnotationConfigApplicationContext(UserServiceImpl.class);
	    UserService bean = ctx.getBean(UserServiceImpl.class);
		
	    // bean.addUser();
		
	}

}
