package com.licious.app;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.licious.app.dto.Employee;
import com.licious.app.dto.Department;
import com.licious.app.service.DepartmentService;
import com.licious.app.service.EmployeeService;
import com.licious.app.serviceImpl.EmployeeServiceImpl;
import com.licious.app.serviceImpl.DepartmentServiceImpl;


public class Main {

    public static void main(String[] args) throws SQLException {
        System.out.println("Welcome to Employee Management Application");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // DepartmentServiceImpl departmentService = new DepartmentServiceImpl();
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        Employee emp = new Employee();
        emp.setFirstName("AB");
        emp.setLastName("CD");
        emp.setEmail("abcd@licious.com");
        emp.setDept_id(7);
        EmployeeServiceImpl empDto = new EmployeeServiceImpl();

        //add employee:
        empDto.addEmployee(emp);

        //read employee:
        Employee e = empDto.getEmployee(1);

        //read All
        List<Employee> employeeList = empDto.getEmployees();
        for(Employee allemp : employeeList)
            System.out.println(allemp);

        //update
        Employee tempEmpl = empDto.getEmployees(1);
        tempEmpl.setAddress("Someplace");
        empDto.updateEmployee(tempEmpl);

        //delete employee
        empDto.deleteEmployee(1);

        /*
        while(true)
        {
            System.out.println("PRESS 1 to ADD Employee");
            System.out.println("PRESS 2 to DELETE Employee");
            System.out.println("PRESS 3 to UPDATE Employee");
            System.out.println("PRESS 4 to DISPLAY Employees");
            System.out.println("PRESS 5 to DISPLAY Employee by ID");
            System.out.println("PRESS 5 to EXIT");

            int c = Integer.parseInt(br.readLine());



            switch (c) {
                case 1:
                    //add employee

                    //pass fields to method below?
                    int addOutput = EmployeeServiceImpl.addEmployee();
                    if(addOutput==0)
                        System.out.println("Added Employee succesfully");
                    else
                        System.out.println("Add Employee Unsuccessful");

                case 2:
                    //delete employee
                    int delOutput = EmployeeServiceImpl.deleteEmployee();
                    if(delOutput==0)
                        System.out.println("Deleted Employee succesfully");
                    else
                        System.out.println("Delete Employee Unsuccessful");
                case 3:
                    //update employee

                    //pass fields to method below?
                    int updateOutput = EmployeeServiceImpl.updateEmployee();
                    if(updateOutput==0)
                        System.out.println("Updated Employee succesfully");
                    else {
                        System.out.println("Update Employee Unsuccessful");
                    }

                case 4:
                    //display employees

                    //pass fields to method below?
                    boolean displayOutput = EmployeeServiceImpl.getEmployees();
                    if(displayOutput) {
                        System.out.println("Fetched Employees succesfully");
                    }
                    else {
                        System.out.println("Get Employees Unsuccessful");
                    }


                case 5:
                    //getEmployeeById
                    int id = Integer.parseInt(br.readLine());
                    int getOutput = EmployeeService.getEmployee(id);
                    if(getOutput!=0)
                        System.out.println("Fetched Employee succesfully");
                    else
                        System.out.println("Get Employee Unsuccessful");

                case 6:
                    //exit
                default:


            }



        }

         */
    }
}

