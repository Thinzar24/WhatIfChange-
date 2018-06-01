package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fname, lname, status;
        double gpa;
        int credit, hours;


        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Student's First Name? " );
        fname = keyboard.next();

        System.out.print( "Student's Last Name? " );
        lname = keyboard.next();

        System.out.print( "Student's GPA? " );
        gpa = keyboard.nextDouble();

        System.out.print( "Student's Current Course Load? " );
        hours = keyboard.nextInt();


        if (hours >= 12)
        {
            System.out.println();
            System.out.println("Student Name :" + fname + " " + lname);
            System.out.println("Student GPA :" + gpa);
            System.out.println("Student is fulltime");
        }

    }
}