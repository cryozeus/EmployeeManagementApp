package com.licious.app.dto;

import java.util.Date;

public class Department {
    private int id;
    private String deptName;
    private Date createdDate;
    private String email;
    private Date lastUpdatedDate;
    private String lastUpdatedBy;

    /*Constructor*/
    public Department(int id, String deptName, Date createdDate, String email, Date lastUpdatedDate, String lastUpdatedBy) {
        this.id = id;
        this.deptName = deptName;
        this.createdDate = createdDate;
        this.email = email;
        this.lastUpdatedDate = lastUpdatedDate;
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /*Getter and Setter*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
}