package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmployeeDTO;
import com.employee.service.EmployeeService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@RequestMapping("v1/employees")
public class EmployeeController
{

    @Autowired
    private EmployeeService employeeService;
    
    
    @ApiOperation(value="Get All Employees")
    @GetMapping("/")
    public List<EmployeeDTO> getEmployee() {
        
        return employeeService.fetchEmployees();
        
    }
    
    
    
    
}
