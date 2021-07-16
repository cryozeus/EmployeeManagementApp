package com.licious.app.service;

import java.sql.SQLException;
import java.util.List;

import com.licious.app.dto.Employee;

//Data Access Object
public interface EmployeeService {

    public int addEmployee(Employee emp)
        throws SQLException;
    public void deleteEmployee(int id)
        throws SQLException;
    public Employee getEmployee(int id)
        throws SQLException;
    public List<Employee> getEmployees()
        throws SQLException;
    public void updateEmployee(Employee emp)
        throws SQLException;
}

