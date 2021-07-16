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
    private Date last_updated_date;
    private String last_updated_by;
    private long salary;
    private int dept_id;

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

    public void setJoining_date(Date joining_date) {
        this.joining_date = joining_date;
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

    public long getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    //Constructors

    public Employee() {
    }

    public Employee(int emplID, String firstName, String lastName,
                    String designation, Date dob, Date joining_date,
                    String address, int mobile, String email,
                    Date last_updated_date, String last_updated_by,
                    int salary, int dept_id) {
        this.emplID = emplID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
        this.dob = dob;
        this.joining_date = joining_date;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.last_updated_date = last_updated_date;
        this.last_updated_by = last_updated_by;
        this.salary = salary;
        this.dept_id = dept_id;
    }

    public Employee(String firstName, String lastName, String designation,
                    Date dob, Date joining_date, String address, int mobile,
                    String email, Date last_updated_date, String last_updated_by,
                    int salary, int dept_id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
        this.dob = dob;
        this.joining_date = joining_date;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.last_updated_date = last_updated_date;
        this.last_updated_by = last_updated_by;
        this.salary = salary;
        this.dept_id = dept_id;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "emplID=" + emplID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", designation='" + designation + '\'' +
                ", dob=" + dob +
                ", joining_date=" + joining_date +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                ", email='" + email + '\'' +
                ", last_updated_date=" + last_updated_date +
                ", last_updated_by='" + last_updated_by + '\'' +
                ", salary=" + salary +
                ", dept_id=" + dept_id +
                '}';
    }
}