package com.example.demo.rest;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpolyeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmpolyeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //getting all employees
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    //getting employee by ID
    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable  int id) {
        return employeeService.findById(id);
    }

    //creating new employee
    @PostMapping("/employees")
    public void save(@RequestBody Employee employee) {
        employeeService.save(employee);
    }

    //Updating an existing employee
    @PutMapping("/emplotees")

    //deleting employee
    @DeleteMapping("/employees/{id}")
    public List<Employee> delete(@PathVariable int id) {
        employeeService.delete(id);
        return employeeService.findAll();
    }

}
