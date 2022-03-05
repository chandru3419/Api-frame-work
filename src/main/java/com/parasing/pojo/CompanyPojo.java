package com.parasing.pojo;

public class CompanyPojo
{
	public String companyname;
	public String empId;
	public String emailId;
	public int phoneNo;
	Object[] EmployeeDetails;
	
	public CompanyPojo(String companyname, String empId, String emailId, int phoneNo, Object[] employeeDetails) {
		super();
		this.companyname = companyname;
		this.empId = empId;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		EmployeeDetails = employeeDetails;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
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

	public Object getEmployeeDetails() {
		return EmployeeDetails;
	}

	public void setEmployeeDetails(Object[] employeeDetails) {
		EmployeeDetails = employeeDetails;
	}
	
}
