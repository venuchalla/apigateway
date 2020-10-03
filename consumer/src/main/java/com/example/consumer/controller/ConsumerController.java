package com.example.consumer.controller;

import com.example.consumer.modal.Employee;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@ComponentScan
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    List<Employee> employeeList = new ArrayList<>();

    @PostMapping(value = "/createemployee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> createEmployee(@RequestBody Employee employee) {
        employeeList.add(employee);
        return employeeList;
    }

}
