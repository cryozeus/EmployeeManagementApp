package com.licious.app.serviceImpl;

import com.licious.app.config.DbUtils;
import com.licious.app.dto.Department;
import com.licious.app.service.DepartmentService;

import java.sql.*;
import java.util.List;

public class DepartmentServiceImpl implements DepartmentService<Department> {
    //Queries

    public static int insert(Department department) {

        try{
            Connection conn = DbUtils.getConnection();
            PreparedStatement pps = conn.prepareStatement("INSERT INTO dept VALUE(? ? ? ? ? ?);");
            pps.setInt(1, department.getId());
            pps.setString(2, department.getDept_name());
            pps.setDate(3, (Date) department.getCreated_date());
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

    public static int update(Department department) {

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

        }catch(Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}

