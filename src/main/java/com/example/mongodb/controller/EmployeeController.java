package com.example.mongodb.controller;

import com.example.mongodb.domain.Employee;
import com.example.mongodb.domain.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/employees")
public class EmployeeController {

	private final EmployeeService employeeService;

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public Mono<Employee> saveEmployee(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}

	@GetMapping("{id}")
	public Mono<Employee> getEmployee(@PathVariable("id") String employeeId) {
		return employeeService.findById(employeeId);
	}

	@GetMapping
	public Flux<Employee> findAll() {
		return employeeService.findAll();
	}
}
