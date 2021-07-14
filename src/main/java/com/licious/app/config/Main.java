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
            // use switch-case
            if(c == 1) {
                //add employee
                System.out.println("Enter Employee First Name: ");
                String firstName = br.readLine();
                System.out.println("Enter Employee Last Name: ");
                String lastName = br.readLine();
                System.out.println("Enter Employee Designation: ");
                String designation  = br.readLine();
                System.out.println("Enter Employee DOB: ");
                String dob = br.readLine();
                System.out.println("Enter Student Name: ");
                String firstName = br.readLine();

            }
            else if(c == 2) {
                //delete employee
            }
            else if(c == 3) {
                //update employee
            }
            else if(c == 4) {
                //display employee
            }
            else if(c == 5) {
                //exit
            }
            else{ }

        }
    }
}

