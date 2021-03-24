package com.singleton;

/**
 * This class Represents Singleton design  pattern creation with lazy initialization technique
 *  Following way to create  Singleton with lazy initialization
 *    i)  Make constructor  as private 
 *    ii)  Make private static constant instance (class-member), do nor instantiate 
 *    iii) Write static factory method, it will check the instance is null or not. 
 *         If instance is null it will create instance of singleton class , other wise it will return singleton class. 
 * 
 * 
 * 
 * 
 * @author SCJP
 *
 *
 *
 */
public class SingletonWithLazyIntialization {
	
	private static  SingletonWithLazyIntialization singletonInstance=null;
	
	private SingletonWithLazyIntialization(){
		
	}
	
	public static SingletonWithLazyIntialization getSingletonInstance(){
		
		   if(singletonInstance==null){
			        singletonInstance=new SingletonWithLazyIntialization();
			       
		   }
		return singletonInstance;
	}
	

}
