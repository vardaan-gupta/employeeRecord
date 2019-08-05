package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.domain.EmployeeDO;

public interface EmployeeRepository extends JpaRepository<EmployeeDO, String>
{

}
