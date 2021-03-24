package com.singleton;

/**
 *
 * This class represents Eager Initialization To write Singleton class, follow
 * below points 
 * 
 *  i) Make Constructor as private 
 * ii) Make private constant static instance(class-member) of this singleton class
 *  iiI) Write static factory  method,it should returns the object of singleton class that we have created  as class-member instance
 * 
 * 
 *  PROS:  
 *  i ) This class is easy to implement
 *  
 *   Cons:
 *    i) It may lead resource wastage. Because instance of a class always created whether it is required or not.
 *    ii) Exception handling not possible.
 * 
 * 
 * @author SCJP 
 * @version 1.0
 *
 */
public class SingletonExample {

	private static final SingletonExample SINGLETON_INSTANCE=new SingletonExample();
	
	private SingletonExample(){
		
	}
	
	public static SingletonExample getSingletonInstance(){
		System.out.println(" getSingletonInstance()    called ");
		return SINGLETON_INSTANCE;
	}
}


