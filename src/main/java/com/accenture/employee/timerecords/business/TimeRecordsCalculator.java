/**
 * 
 */
package com.accenture.employee.timerecords.business;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.accenture.employee.timerecords.business.vo.DayAttendance;
import com.accenture.employee.timerecords.business.vo.Employee;
import com.accenture.employee.timerecords.business.vo.TimeRecord;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;



/**
 * @author j.venugopalan
 *
 */

@SpringBootApplication
@Service
@Component
public class TimeRecordsCalculator{
	
	public static final Logger log = LoggerFactory.getLogger(TimeRecordsCalculator.class);
	@Autowired RestTemplate restTemplate;
	@Autowired TimeRecordsEntityUtility timeRecordsEntityUtility;
	@Bean
	RestTemplate restTemaplate(){
		return new RestTemplate();
	}
	@Value("${microservice.employeedetails.url}")
	private String employeeDetailsURL;
	/**
	 * 
	 * @param employeeId
	 * @return Timerecords
	 */
	@HystrixCommand(fallbackMethod = "employeeServiceFalut")
	public List<TimeRecord> getTimeRecordsForanEmployee(Integer employeeId){
		log.info("Inside getTimeRecordsForanEmployee method:::: " + employeeId);
		log.info("employeeDetailsURL ::" + employeeDetailsURL);
		Employee employeeNull = new Employee();
		List<TimeRecord> timerecord = new ArrayList();
		Employee emp =  restTemplate.getForObject(employeeDetailsURL+employeeId, Employee.class);
		log.info("Employee details: "+emp.toString());
		if(emp.getEmployeeId()!= employeeId){
			System.out.println("In side if condition");
			timerecord = timeRecordsEntityUtility.getEmployeeTimeRecord(employeeId);
		}else{
			throw new RuntimeException();
		}
		
		return timerecord;
	}
	/**
	 * 
	 * @param employeeId
	 * @return TimeRecord
	 */
	public TimeRecord employeeServiceFalut(Integer employeeId){
		log.info("Inside employeeServiceFalut Method");
		TimeRecord timeRecords = new TimeRecord();
		timeRecords.setChargeCode(null);
		timeRecords.setDateStr(null);
		timeRecords.setHours(0);
		timeRecords.setEmployeeId(null);
		return timeRecords;
	}

}
