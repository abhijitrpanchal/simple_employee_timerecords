/**
 * 
 */
package com.accenture.employee.timerecords.business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accenture.employee.timerecords.business.vo.DayAttendance;
import com.accenture.employee.timerecords.business.vo.TimeRecord;

/**
 * @author j.venugopalan
 *
 */
@SpringBootApplication
public class TimeRecordsEntityUtility {
	
	public TimeRecord getEmployeeTimeRecord(Integer empId){
		TimeRecord timeRecord = new TimeRecord();
		DayAttendance dayAttendance = new DayAttendance();
		Collection<DayAttendance> dayAttList = new ArrayList<>();
		timeRecord.setEmployeeId(empId);
		
		dayAttendance.setChargeCode("ASBOS05");
		dayAttendance.setDateStr("21-02-2017");
		dayAttendance.setHours((Integer)9);
		dayAttList.add(dayAttendance);
		timeRecord.setEmpAttendance(dayAttList);
		return timeRecord;
	}

}
