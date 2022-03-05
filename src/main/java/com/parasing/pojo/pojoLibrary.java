package com.parasing.pojo;

public class pojoLibrary 
{
public String name;
public String empId;
public String email;
public int phoneNo;

public pojoLibrary() {
	// TODO Auto-generated constructor stub
}

public pojoLibrary(String name, String empId, String email, int phoneNo)
{
	super();
	this.name = name;
	this.empId = empId;
	this.email = email;
	this.phoneNo = phoneNo;
}
public String getName() {
	return name;
}
public String getEmpId() {
	return empId;
}
public String getEmail() {
	return email;
}
public int getPhoneNo() {
	return phoneNo;
}

}
