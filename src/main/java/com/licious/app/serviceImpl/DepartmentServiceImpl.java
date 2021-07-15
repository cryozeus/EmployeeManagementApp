package com.licious.app.serviceImpl;

import com.licious.app.config.DbUtils;
import com.licious.app.dto.Department;
import com.licious.app.service.DepartmentService;

import java.sql.*;
import java.util.Date;

public abstract class DepartmentServiceImpl implements DepartmentService<Department> {
    //Queries

    public static int insertDepartment(Department department) {

        try{
            Connection conn = DbUtils.getConnection();
            PreparedStatement pps = conn.prepareStatement("INSERT INTO dept VALUE(? ? ? ? ? ?);");
            pps.setInt(1, department.getId());
            pps.setString(2, department.getDept_name());
            pps.setDate(3, department.getCreated_date());
            pps.setString(4, department.getEmail());
            pps.setDate(5, (Date) department.getLast_updated_date());
            pps.setString(6, department.getLast_updated_by());
            return pps.executeUpdate();
            // WHERE TO close connection?
            // DbUtils.closeConnection();
        }catch(Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static ResultSet updateDepartment(Department department) {

        try{
            Connection conn = DbUtils.getConnection();
            PreparedStatement pps = conn.prepareStatement("UPDATE dept SET id=?, dept_name=?, created_date=?, email=?, last_updated_date=?, last_updated_by=?;");
            pps.setInt(1, department.getId());
            pps.setString(2, department.getDept_name());
            pps.setDate(3, (Date) department.getCreated_date());
            pps.setString(4, department.getEmail());
            pps.setDate(5, (Date) department.getLast_updated_date());
            pps.setString(6, department.getLast_updated_by());
            return pps.executeUpdate();
            // conn.close(); ???


        }catch(Exception e) {
            e.printStackTrace();
            return 0;
        }
    }


    public static void getDepartmentById(int id, Connection conn) {
        PreparedStatement pps = null;
        String sqlIn = "SELECT * FROM dept WHERE id="+id;

        try{
            pps = conn.prepareStatement(sqlIn);
            ResultSet rs = pps.executeQuery(sqlIn);

            while(rs.next()){
                int id = rs.getInt(1);
                String dept_name = rs.getString(2);
                Date created_date = rs.getDate(3);
                String email = rs.getString(4);
                Date last_updated_date = rs.getDate(5);
                String last_updated_by = rs.getString(6);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}

