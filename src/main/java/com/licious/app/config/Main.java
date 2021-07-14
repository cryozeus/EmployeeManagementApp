package com.licious.app.config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Employee Management Application");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            System.out.println("PRESS 1 to ADD Employee");
            System.out.println("PRESS 2 to DELETE Employee");
            System.out.println("PRESS 3 to UPDATE Employee");
            System.out.println("PRESS 4 to DISPLAY Employee");
            System.out.println("PRESS 5 to EXIT");

            int c = Integer.parseInt(br.readLine());

            switch (c) {
                case 1:
                    //add employee
                    System.out.println("Enter Employee First Name: ");
                    String firstName = br.readLine();
                    System.out.println("Enter Employee Last Name: ");
                    String lastName = br.readLine();
                    System.out.println("Enter Employee Designation: ");
                    String designation  = br.readLine();
                    System.out.println("Enter Employee DOB: ");
                    String dob = br.readLine();
                    System.out.println("Enter Employee joining date: ");
                    String joining_date = br.readLine();
                    System.out.println("Enter Employee Address: ");
                    String address = br.readLine();
                    System.out.println("Enter Employee mobile: ");
                    String mobile = br.readLine();
                    System.out.println("Enter Employee email: ");
                    String email = br.readLine();
                    System.out.println("Enter last updated date: ");
                    String last_updated_date = br.readLine();
                    System.out.println("Enter last updated by: ");
                    String last_updated_by = br.readLine();
                    System.out.println("Enter Employee salary: ");
                    Integer salary = br.readLine();
                    System.out.println("Enter Employee's Dept. ID: ");
                    Integer dept_id = br.readLine();
                    break;

                case 2:
                    //delete employee
                case 3:
                    //update employee
                case 4:
                    //display employee
                case 5:
                    //exit
                default:


            }


        }
    }
}

