package com.licious.app.serviceImpl;

import com.licious.app.config.DbUtils;
import com.licious.app.dto.Employee;
import com.licious.app.service.EmployeeService;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class EmployeeServiceImpl implements EmployeeService<Employee> {
    //CRUD methods

    @Override
    public static int insert(Employee employee) {

        try{
            Connection conn = DbUtils.getConnection();
            PreparedStatement pps = connection.prepareStatement("INSERT INTO Employee VALUE(? ? ? ? ? ? ? ? ? ? ? ? ?)");
            pps.setInt(1, employee.getEmplID());
            pps.setString(2, employee.getFirstName());
            pps.setString(3, employee.getLastName());
            pps.setString(4, employee.getDesignation());
            pps.setDate(5, (Date) employee.getDob());
            pps.setDate(6, (Date) employee.getJoining_date());
            pps.setString(7, employee.getAddress());
            pps.setLong(8, employee.getMobile());
            pps.setString(9, employee.getEmail());
            pps.setDate(10, (Date) employee.getLast_updated_date());
            pps.setString(11, employee.getLast_updated_by());
            pps.setLong(12, employee.getSalary());
            pps.setInt(13, employee.getDept_id());
            return pps.executeUpdate();
        }catch(Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}
