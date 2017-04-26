package com.accenture.employee.timerecords.business.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.accenture.employee.timerecords.business.vo.DayAttendance;

public interface DayAttendanceRepository extends MongoRepository<DayAttendance, Integer>{
		
	 
	public List<DayAttendance> findByEmployeeId(Integer empId);

}
