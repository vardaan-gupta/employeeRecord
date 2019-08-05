package com.employee.service;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.domain.EmployeeDO;
import com.employee.dto.EmployeeDTO;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;


    public List<EmployeeDTO> fetchEmployees()
    {
      
        List<EmployeeDO> employeeList = employeeRepository.findAll();

        return employeeList.stream().map(e -> {
            
            StringBuilder name = new StringBuilder();
            name.append(e.getFirstName()).append(" ").append(e.getLastName());

            return new EmployeeDTO(
                Long.toString(e.getEmployeeId()),
                name.toString(), e.getSalary().toString(),
                e.getHireDate().toString(), e.getDateOfBirth().toString());

        }).collect(Collectors.toList());

    }


   

}
