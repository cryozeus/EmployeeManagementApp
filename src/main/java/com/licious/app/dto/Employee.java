package com.licious.app.dto;
import java.util.Date;


public class Employee {
    /*INITIALIZING FIELDS*/
    private int emplID;
    private String firstName;
    private String lastName;
    private String designation;
    private Date dob;
    private Date joiningDate;
    private String address;
    private long mobile;
    private String email;
    private Date lastUpdatedDate;
    private String lastUpdatedBy;
    private long salary;
    private int deptID;




    /*INITIALIZE GETTER AND SETTER*/
    public int getEmplID() {
        return emplID;
    }

    public void setEmplID(int emplID) {
        this.emplID = emplID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
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
        this.lastUpdatedBy = this.lastUpdatedBy;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    //Constructors

    public Employee() {
    }

    public Employee(int emplID, String firstName, String lastName,
                    String designation, Date dob, Date joining_date,
                    String address, long mobile, String email,
                    Date lastUpdatedDate, String lastUpdatedBy,
                    long salary, int deptID) {
        this.emplID = emplID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
        this.dob = dob;
        this.joiningDate = joining_date;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.lastUpdatedDate = lastUpdatedDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.salary = salary;
        this.deptID = deptID;
    }

    public Employee(String firstName, String lastName, String designation,
                    Date dob, Date joiningDate, String address, int mobile,
                    String email, Date lastUpdatedDate, String lastUpdatedBy,
                    int salary, int deptID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
        this.dob = dob;
        this.joiningDate = joiningDate;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.lastUpdatedDate = lastUpdatedDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.salary = salary;
        this.deptID = deptID;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "emplID=" + emplID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", designation='" + designation + '\'' +
                ", dob=" + dob +
                ", joining_date=" + joiningDate +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                ", email='" + email + '\'' +
                ", last_updated_date=" + lastUpdatedDate +
                ", last_updated_by='" + lastUpdatedBy + '\'' +
                ", salary=" + salary +
                ", dept_id=" + deptID +
                '}';
    }
}