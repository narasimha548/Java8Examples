package com.app.java7;

     final class  TestSingleton {
	
	private final  Integer number=10;
	private final  String name="djhbhj";
    private  final String email="test@gmail.com";
    
    
	  public  TestSingleton() {
	
	}


/*
	private  TestSingleton(Integer number, String name, String email) {
		this.number = number;
		this.name = name;
		this.email = email;
	}*/
	  
	  

	public Integer getNumber() {
		return number;
	}



	public String getName() {
		return name;
	}



	public String getEmail() {
		return email;
	}



	@Override
	public String toString() {
		return "TestSingleton [number=" + number + ", name=" + name + ", email=" + email + "]";
	}
    
    
	
	
}
