/**
 * 
 */
package com.accenture.employee.timerecords.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.employee.timerecords.business.TimeRecordsCalculator;
import com.accenture.employee.timerecords.business.vo.TimeRecord;

/**
 * @author j.venugopalan
 *
 */

@SpringBootApplication
@RestController
public class TimerecordsController {
	
	@Autowired
	TimeRecordsCalculator timerecordsCalculator;
	
	
	@RequestMapping(value="/timerecords/{empId}", method = RequestMethod.GET)
	public TimeRecord getEmployeeTimerecords(@PathVariable("empId") Integer id){
		TimeRecord timeRecord = this.timerecordsCalculator.getTimeRecordsForanEmployee(id);
		return timeRecord;
	}

}
