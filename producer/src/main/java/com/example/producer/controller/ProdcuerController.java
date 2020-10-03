package com.example.producer.controller;

import com.example.producer.modal.Employee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/prodcucer")
public class ProdcuerController {
    public ArrayList<Employee> createEmployeeList() {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee("12", "venu");
        Employee e2 = new Employee("23", "Challa1");
        Employee e3 = new Employee("234", "Challa2");
        Employee e4 = new Employee("235", "Challa3");
        Employee e5 = new Employee("236", "Challa4");
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        return employees;
    }

    @GetMapping(value="/employees/{id}" ,produces= MediaType.APPLICATION_JSON_VALUE)
    Employee  findEmployee(@PathVariable String id) {
        ArrayList<Employee> employees=createEmployeeList();
        List<Employee> employeeListWithmatchedId=employees.stream().filter(employee -> employee.getId().equalsIgnoreCase(id)).collect(Collectors.toList());
        if(employeeListWithmatchedId!=null){
            return employeeListWithmatchedId.get(0);
        }
       return new Employee("235","not found");
    }
}
