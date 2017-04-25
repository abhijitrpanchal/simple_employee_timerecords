package com.accenture.employee.timerecords.business.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.accenture.employee.timerecords.business.vo.TimeRecord;

public interface TimeRecordsRepository extends MongoRepository<TimeRecord, Integer>{
		
	@Query ("{employeeId : ?0}") 
	public TimeRecord getEmployeeTimeRecord(Integer empId);

}
