package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Please Enter The Number of Students: ");
        Scanner in= new Scanner(System.in);
        int numberOfStudents= in.nextInt();
        Student[] students=new Student[numberOfStudents];

        for (int i=0; i<numberOfStudents; i++){
           students[i] = new Student();
           students[i].enroll();
           students[i].payTuition();
            System.out.println(students[i].toString());

        }



    }
}
