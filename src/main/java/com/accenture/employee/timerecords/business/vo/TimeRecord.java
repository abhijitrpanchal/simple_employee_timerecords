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
	private BigInteger id;
	private Integer employeeId;
	private String dateStr;
	private String chargeCode;
	private Integer hours;
	
	
	public TimeRecord(Integer employeeId, String dateStr, String chargeCode, Integer hours) {
		super();
		this.employeeId = employeeId;
		this.dateStr = dateStr;
		this.chargeCode = chargeCode;
		this.hours = hours;
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
	public String getDateStr() {
		return dateStr;
	}
	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}
	public String getChargeCode() {
		return chargeCode;
	}
	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	@Override
	public String toString() {
		return "TimeRecord [EmployeeId = " + employeeId +", dateStr=" + dateStr + ", chargeCode=" + chargeCode + ", hours=" + hours + "]";
	}
	

}
