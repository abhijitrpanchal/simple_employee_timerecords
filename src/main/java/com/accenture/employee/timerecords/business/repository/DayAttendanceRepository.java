package com.accenture.employee.timerecords.business.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.accenture.employee.timerecords.business.vo.TimeRecord;

public interface DayAttendanceRepository extends MongoRepository<TimeRecord, Integer>{
		
	 
	public List<TimeRecord> findByEmployeeId(Integer empId);

}
