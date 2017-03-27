/**
 * 
 */
package com.accenture.employee.timerecords.business.vo;

/**
 * @author j.venugopalan
 *
 */
public class Employee {
	private Integer employeeId;
	private String employeeName;
	private String employeeAddress;
	public Employee(Integer employeeId, String employeeName, String empAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = empAddress;
	}
	public Employee() {
		super();
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmpAddress() {
		return employeeAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.employeeAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", empAddress=" + employeeAddress
				+ "]";
	}
	
	

}
