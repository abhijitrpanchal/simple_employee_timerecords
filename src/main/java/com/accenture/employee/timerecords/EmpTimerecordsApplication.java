package com.accenture.employee.timerecords;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@SpringBootApplication
@SpringBootApplication(scanBasePackages = { "com.accenture.employee" })
//@EnableDiscoveryClient
//@EnableCircuitBreaker
@EnableHystrixDashboard 
@Component
@Service
@EnableAutoConfiguration

public class EmpTimerecordsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpTimerecordsApplication.class, args);
	}
}
