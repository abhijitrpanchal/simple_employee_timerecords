/**
 * 
 */
package com.accenture.employee.timerecords.business.vo;

import java.math.BigInteger;
import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * @author j.venugopalan
 *
 */
@Document (collection="dayattendance")
public class TimeRecord {
	
	@Id
	private Integer employeeId;
	private Collection<DayAttendance> empAttendance;
	
	
	
	public TimeRecord(Integer employeeId, Collection<DayAttendance> empAttendance) {
		super();
		this.employeeId = employeeId;
		this.empAttendance = empAttendance;
	}
	public TimeRecord() {
		super();
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Collection<DayAttendance> getEmpAttendance() {
		return empAttendance;
	}
	public void setEmpAttendance(Collection<DayAttendance> empAttendance) {
		this.empAttendance = empAttendance;
	}
	@Override
	public String toString() {
		return "TimeRecord [employeeId=" + employeeId + ", empAttendance=" + empAttendance + "]";
	}
	

}
