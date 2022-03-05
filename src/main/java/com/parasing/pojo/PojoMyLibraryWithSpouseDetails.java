package com.parasing.pojo;

public class PojoMyLibraryWithSpouseDetails
{
	public String name;
	public String empId;
	public String emailId;
	public int phoneNo;
	Object spouse;
	public PojoMyLibraryWithSpouseDetails(String name, String empId, String emailId, int phoneNo, Object spouse) {
		super();
		this.name = name;
		this.empId = empId;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.spouse = spouse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Object getSpouse() {
		return spouse;
	}
	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}
}
