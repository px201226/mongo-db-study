package com.example.mongodb.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeService {

	private final EmployeeRepository employeeRepository;

	public Mono<Employee> save(final Employee employee){
		return employeeRepository.save(employee);
	}

	public Mono<Employee> findById(final String employeeId){
		return employeeRepository.findById(employeeId);
	}

	public Flux<Employee> findAll(){
		return employeeRepository.findAll();
	}
}
