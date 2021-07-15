package com.licious.app.service;

import com.licious.app.dto.Department;

import java.sql.SQLException;
import java.util.List;

public interface DepartmentService<D> {
    //abstract methods - implementation layer
    public int addDepartment(Department department)
            throws SQLException;
    public void deleteDepartment(int id)
            throws SQLException;
    public Department getDepartment(int id)
            throws SQLException;
    public List<Department> getDepartments()
            throws SQLException;
    public void updateDepartment(Department department)
            throws SQLException;
}







