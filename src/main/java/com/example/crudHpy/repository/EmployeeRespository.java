package com.example.crudHpy.repository;

import com.example.crudHpy.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<Employee, Long> {
    //all crud database methods
}
