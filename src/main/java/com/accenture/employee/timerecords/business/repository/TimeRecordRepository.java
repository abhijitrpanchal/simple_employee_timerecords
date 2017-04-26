package com.accenture.employee.timerecords.business.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.accenture.employee.timerecords.business.vo.TimeRecord;

public interface TimeRecordRepository extends MongoRepository<TimeRecord, Integer>{
		
	 
	public TimeRecord findByEmployeeId(Integer empId);

}
