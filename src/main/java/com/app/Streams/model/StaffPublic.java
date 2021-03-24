package com.app.Streams.model;

public class StaffPublic {

	private String name;
	private int age;
	private String extraFiled;

	public StaffPublic() {
		super();
	}

	public StaffPublic(String name, int age, String extraFiled) {
		super();
		this.name = name;
		this.age = age;
		this.extraFiled = extraFiled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getExtraFiled() {
		return extraFiled;
	}

	public void setExtraFiled(String extraFiled) {
		this.extraFiled = extraFiled;
	}

	@Override
	public String toString() {
		return "StaffPublic [name=" + name + ", age=" + age + ", extraFiled=" + extraFiled + "]";
	}

}
