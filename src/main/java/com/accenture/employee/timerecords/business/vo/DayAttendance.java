/**
 * 
 */
package com.accenture.employee.timerecords.business.vo;

/**
 * @author j.venugopalan
 *
 */
public class DayAttendance {

	private String dateStr;
	private String chargeCode;
	private Integer hours;
	public DayAttendance(String dateStr, String chargeCode, Integer hours) {
		super();
		this.dateStr = dateStr;
		this.chargeCode = chargeCode;
		this.hours = hours;
	}
	public DayAttendance() {
		super();
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
		return "DayAttendance [dateStr=" + dateStr + ", chargeCode=" + chargeCode + ", hours=" + hours + "]";
	}
	
	
}
