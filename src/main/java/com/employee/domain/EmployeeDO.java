package com.employee.domain;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class EmployeeDO
{

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
    
    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;

    @Column(name="hire_date")
    private ZonedDateTime hireDate;
    
    @Column(name="salary")
    private Double salary;
    
    @Column(name="date_of_birth")
    private ZonedDateTime dateOfBirth;
    
    @Column(name="department")
    private String department;


    public long getEmployeeId()
    {
        return employeeId;
    }


    public void setEmployeeId(long employeeId)
    {
        this.employeeId = employeeId;
    }


    public String getFirstName()
    {
        return firstName;
    }


    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }


    public String getLastName()
    {
        return lastName;
    }


    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }


    public ZonedDateTime getHireDate()
    {
        return hireDate;
    }


    public void setHireDate(ZonedDateTime hireDate)
    {
        this.hireDate = hireDate;
    }


    public Double getSalary()
    {
        return salary;
    }


    public void setSalary(Double salary)
    {
        this.salary = salary;
    }


    public ZonedDateTime getDateOfBirth()
    {
        return dateOfBirth;
    }


    public void setDateOfBirth(ZonedDateTime dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }


    public String getDepartment()
    {
        return department;
    }


    public void setDepartment(String department)
    {
        this.department = department;
    }

}
