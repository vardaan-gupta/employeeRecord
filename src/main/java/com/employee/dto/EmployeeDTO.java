package com.employee.dto;

public class EmployeeDTO
{

    
    private String employeeId;
    private String name;
    private String salary;
    private String dateOfHire;
    private String dateOfBirth;
    private String department;
    
    
    public EmployeeDTO(String employeeId, String name, String salary, String dateOfHire, String dateOfBirth)
    {
        super();
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.dateOfHire = dateOfHire;
        this.dateOfBirth = dateOfBirth;
    }


    public String getEmployeeId()
    {
        return employeeId;
    }


    public String getName()
    {
        return name;
    }


    public String getSalary()
    {
        return salary;
    }


    public String getDateOfHire()
    {
        return dateOfHire;
    }


    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    
}
