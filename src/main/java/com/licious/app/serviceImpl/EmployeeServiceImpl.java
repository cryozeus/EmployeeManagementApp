package com.licious.app.serviceImpl;

import com.licious.app.config.DbUtils;
import com.licious.app.dto.Employee;
import com.licious.app.service.EmployeeService;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    //CRUD methods

    public static int addEmployee() {

        try {
            Connection conn = DbUtils.getConnection();
            PreparedStatement pps = conn.prepareStatement("INSERT INTO Employee VALUE(? ? ? ? ? ? ? ? ? ? ? ? ?);");
            pps.setInt(1, employee.getEmplID());
            pps.setString(2, employee.getFirstName());
            pps.setString(3, employee.getLastName());
            pps.setString(4, employee.getDesignation());
            pps.setDate(5, new java.sql.Date(employee.getDob().getTime());
            pps.setDate(6, new java.sql.Date(employee.getJoiningDate().getTime());
            pps.setString(7, employee.getAddress());
            pps.setLong(8, employee.getMobile());
            pps.setString(9, employee.getEmail());
            pps.setDate(10, new java.sql.Date(employee.getLastUpdatedDate().getTime()));
            pps.setString(11, employee.getLast_updated_by());
            pps.setLong(12, employee.getSalary());
            pps.setInt(13, employee.getDept_id());
            return pps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public void deleteEmployee(int id) throws SQLException {

    }

    @Override
    public Employee getEmployee(int id) throws SQLException {
        return null;
    }

    @Override
    public static int updateEmployee(Employee employee) {

        try {
            Connection conn = DbUtils.getConnection();
            PreparedStatement pps = conn.prepareStatement("UPDATE Employee SET id=?, first_name=?, last_name=?, designation=?, " +
                    "dob=?, joining_date=?, address=?, mobile=?, email=?, last_updated_date=?, last_updated_by=?, salary=?, dept_id=?;");
            pps.setInt(1, employee.getEmplID());
            pps.setString(2, employee.getFirstName());
            pps.setString(3, employee.getLastName());
            pps.setString(4, employee.getDesignation());
            pps.setDate(5, new java.sql.Date(employee.getDob().getTime());
            pps.setDate(6, new java.sql.Date(employee.getJoiningDate().getTime());
            pps.setString(7, employee.getAddress());
            pps.setLong(8, employee.getMobile());
            pps.setString(9, employee.getEmail());
            pps.setDate(10, new java.sql.Date(employee.getLast_updated_date().getTime());
            pps.setString(11, employee.getLast_updated_by());
            pps.setLong(12, employee.getSalary());
            pps.setInt(13, employee.getDept_id());
            return pps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

    @Override
    public static void getEmployee(int id, Connection conn) {
        PreparedStatement pps = null;
        String sqlIn = "SELECT * FROM Employee WHERE id="+id;

        try{
            pps = conn.prepareStatement(sqlIn);
            ResultSet rs = pps.executeQuery(sqlIn);

            while(rs.next()) {
                int emplID = rs.getInt(1);
                String firstName = rs.getString(2);
                String lastName = rs.getString(3);
                String designation = rs.getString(4);
                Date dob = rs.getDate(5);
                Date joining_date = rs.getDate(6);
                String address = rs.getString(7);
                long mobile = rs.getLong(8);
                String email = rs.getString(9);
                Date last_updated_date = rs.getDate(10);
                String last_updated_by = rs.getString(11);
                long salary = rs.getLong(12);
                int dept_id = rs.getInt(13);
            }



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public List<Employee> getEmployees() throws SQLException {

        String sqlIn = "SELECT * FROM Employee;";
        Connection conn = DbUtils.getConnection();
        PreparedStatement pps = conn.prepareStatement(sqlIn);
        ResultSet rs = pps.executeQuery();
        List<Employee> employeeList = new ArrayList<>();

    }

}
