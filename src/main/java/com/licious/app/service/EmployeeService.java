package com.licious.app.service;

import java.sql.SQLException;
import java.util.List;

import com.licious.app.dto.Employee;

//Data Access Object
public interface EmployeeService {

    public int addEmployee(Employee emp)
        throws SQLException;
    public int deleteEmployee(int id)
        throws SQLException;
    public Employee getEmployee(int id)
        throws SQLException;
    public List<Employee> getEmployees()
        throws SQLException;
    public int updateEmployee(Employee emp)
        throws SQLException;
}

