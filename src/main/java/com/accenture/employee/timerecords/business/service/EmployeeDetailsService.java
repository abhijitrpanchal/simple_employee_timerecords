/**
 * 
 */
package com.accenture.employee.timerecords.business.service;

/**
 * @author j.venugopalan
 *
 */
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.accenture.employee.timerecords.business.vo.Employee;



@SpringBootApplication
@FeignClient(name = "EMPLOYEEDETAILS")
public interface EmployeeDetailsService {
	/**
	 * 
	 * @param id
	 * @return Employee
	 */
	@RequestMapping(value = "/employees/{empId}",method = RequestMethod.GET)
	public Employee getEmployeeDetails(@PathVariable ("empId") long id);
}
