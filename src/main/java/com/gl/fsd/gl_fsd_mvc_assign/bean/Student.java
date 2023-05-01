package com.gl.fsd.gl_fsd_mvc_assign.bean;

public class Student {
	private int studentId;
	private String name;
	private String department;
	private String country;
	public Student() {
		super();
	}
	public Student(int studentId, String name, String department, String country) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.department = department;
		this.country = country;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", department=" + department + ", country="
				+ country + "]";
	}
	
	

}
