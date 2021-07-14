package com.licious.app.dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Department {
    private int id;
    private String dept_name;
    private Date created_date;
    private String email;
    private Date last_updated_date;
    private String last_updated_by;

    /*Constructor*/
    public Department(int id, String dept_name, Date created_date, String email, Date last_updated_date, String last_updated_by) {
        this.id = id;
        this.dept_name = dept_name;
        this.created_date = created_date;
        this.email = email;
        this.last_updated_date = last_updated_date;
        this.last_updated_by = last_updated_by;
    }

    /*Getter and Setter*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getLast_updated_date() {
        return last_updated_date;
    }

    public void setLast_updated_date(Date last_updated_date) {
        this.last_updated_date = last_updated_date;
    }

    public String getLast_updated_by() {
        return last_updated_by;
    }

    public void setLast_updated_by(String last_updated_by) {
        this.last_updated_by = last_updated_by;
    }
}