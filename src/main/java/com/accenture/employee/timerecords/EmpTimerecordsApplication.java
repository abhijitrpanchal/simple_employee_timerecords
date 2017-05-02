package com.accenture.employee.timerecords;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
//import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@SpringBootApplication
@SpringBootApplication(scanBasePackages = { "com.accenture.employee" })
//@EnableDiscoveryClient
@EnableCircuitBreaker
//@EnableTurbine
@EnableHystrixDashboard 
@Component
@Service
@EnableAutoConfiguration

public class EmpTimerecordsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpTimerecordsApplication.class, args);
	}
}
