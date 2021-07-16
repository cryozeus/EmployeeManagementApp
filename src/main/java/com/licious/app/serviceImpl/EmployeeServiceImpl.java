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

    @Override
    public int addEmployee(Employee emp) throws SQLException {
        try {
            Connection conn = DbUtils.getConnection();
            PreparedStatement pps = conn.prepareStatement("INSERT INTO Employee VALUE(? ? ? ? ? ? ? ? ? ? ? ? ?);");
            pps.setInt(1, emp.getEmplID());
            pps.setString(2, emp.getFirstName());
            pps.setString(3, emp.getLastName());
            pps.setString(4, emp.getDesignation());
            pps.setDate(5, new java.sql.Date(emp.getDob().getTime()) );
            pps.setDate(6, new java.sql.Date(emp.getJoiningDate().getTime()) );
            pps.setString(7, emp.getAddress());
            pps.setLong(8, emp.getMobile());
            pps.setString(9, emp.getEmail());
            pps.setDate(10, new java.sql.Date(emp.getLastUpdatedDate().getTime()));
            pps.setString(11, emp.getLastUpdatedBy());
            pps.setLong(12, emp.getSalary());
            pps.setInt(13, emp.getDeptID());
            DbUtils.closeConnection(conn);
            int i = pps.executeUpdate();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

    @Override
    public int deleteEmployee(int id) throws SQLException {
        try{
            String sqlIn = "DELETE FROM Employee WHERE dept_id=?;";
            Connection conn = DbUtils.getConnection();
            PreparedStatement pps = conn.prepareStatement(sqlIn);
            int i = pps.executeUpdate(sqlIn);
            return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return 1;
        }
    }

    @Override
    public Employee getEmployee(int id) throws SQLException {

        try{
            Connection conn = DbUtils.getConnection();
            PreparedStatement pps = null;
            String sqlIn = "SELECT * FROM Employee WHERE id="+id;
            pps = conn.prepareStatement(sqlIn);
            ResultSet rs = pps.executeQuery(sqlIn);

            while(rs.next()) {
                int emplID = rs.getInt(1);
                String firstName = rs.getString(2);
                String lastName = rs.getString(3);
                String designation = rs.getString(4);
                Date dob = rs.getDate(5);
                Date joiningDate = rs.getDate(6);
                String address = rs.getString(7);
                long mobile = rs.getLong(8);
                String email = rs.getString(9);
                Date lastUpdatedDate = rs.getDate(10);
                String lastUpdatedBy = rs.getString(11);
                long salary = rs.getLong(12);
                int deptID = rs.getInt(13);

                System.out.println(emplID);
                System.out.println(firstName);
                System.out.print(" "+lastName);
                System.out.println(designation);
                System.out.println(dob);
                System.out.println(joiningDate);
                System.out.println(address);
                System.out.println(mobile);
                System.out.println(email);
                System.out.println(lastUpdatedDate);
                System.out.println(lastUpdatedBy);
                System.out.println(salary);
                System.out.println(deptID);
                DbUtils.closeConnection(conn);
                return new Employee();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public int updateEmployee(Employee employee) throws SQLException {
        Connection conn=null;
        try {
            conn = DbUtils.getConnection();
            PreparedStatement pps = conn.prepareStatement("UPDATE Employee SET id=?, first_name=?, last_name=?, designation=?, " +
                    "dob=?, joining_date=?, address=?, mobile=?, email=?, last_updated_date=?, last_updated_by=?, salary=?, dept_id=?;");
            pps.setInt(1, employee.getEmplID());
            pps.setString(2, employee.getFirstName());
            pps.setString(3, employee.getLastName());
            pps.setString(4, employee.getDesignation());
            pps.setDate(5, new java.sql.Date(employee.getDob().getTime())) ;
            pps.setDate(6, new java.sql.Date(employee.getJoiningDate().getTime()));
            pps.setString(7, employee.getAddress());
            pps.setLong(8, employee.getMobile());
            pps.setString(9, employee.getEmail());
            pps.setDate(10, new java.sql.Date(employee.getLastUpdatedDate().getTime()));
            pps.setString(11, employee.getLastUpdatedBy());
            pps.setLong(12, employee.getSalary());
            pps.setInt(13, employee.getDeptID());;
            return pps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            DbUtils.closeConnection(conn);
        }

    }
    @Override
    public List<Employee> getEmployees() throws SQLException {
        List<Employee> employeeList = new ArrayList<>();
        Connection conn = null;
        try{
            String sqlIn = "SELECT * FROM Employee;";
            conn = DbUtils.getConnection();
            PreparedStatement pps = null;
            pps = conn.prepareStatement(sqlIn);
            ResultSet rs = pps.executeQuery(sqlIn);

            while(rs.next()) {
                int emplID = rs.getInt(1);
                String firstName = rs.getString(2);
                String lastName = rs.getString(3);
                String designation = rs.getString(4);
                Date dob = rs.getDate(5);
                Date joiningDate = rs.getDate(6);
                String address = rs.getString(7);
                long mobile = rs.getLong(8);
                String email = rs.getString(9);
                Date lastUpdatedDate = rs.getDate(10);
                String lastUpdatedBy = rs.getString(11);
                long salary = rs.getLong(12);
                int deptID = rs.getInt(13);
                //add fields below
                employeeList.add(new Employee(emplID, firstName, lastName, designation, dob, joiningDate, address, mobile, email, lastUpdatedDate, lastUpdatedBy, salary, deptID));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeConnection(conn);
        }
        return employeeList;
    }







}
