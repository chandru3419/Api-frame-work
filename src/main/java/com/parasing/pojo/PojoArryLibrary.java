package com.parasing.pojo;

public class PojoArryLibrary 
{
	public String name;
	public String empId;
	public String emailId;
	public long[] phoneNo;
	
	public PojoArryLibrary(String name, String empId, String emailId, long[] phoneNo) 
	{
		super();
		this.name = name;
		this.empId = empId;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmp() {
		return emailId;
	}

	public long[] getPhoneNo() {
		return phoneNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setEmp(String emp) {
		this.emailId = emailId;
	}

	public void setPhoneNo(long[] phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
