package com.company;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int graduationYear;
    private String studentID;
    private String courses="";
    private int tuitionBalane;
    private static int costOfCOurse=600;
    private static int id=1000;


    public Student() {

        Scanner in= new Scanner(System.in);
        System.out.print("Please Enter The First Name: ");
        this.firstName=in.nextLine();

        System.out.print("Please Enter The Last Name: ");
        this.lastName=in.nextLine();

        System.out.print("Please Enter The Student Class Level\n1-freshman\n2-sophermore\n3-junior\n4-senior\n");
        this.graduationYear=in.nextInt();
        setStudentID();
        System.out.println(firstName+" "+lastName+" "+graduationYear+" "+studentID);
    }

//the id genator
    private void setStudentID(){
        id++;
        this.studentID=graduationYear+""+id;


    }
//enroll the class
    public void enroll() {
        do {
            System.out.println("Please Enter Course to Enroll (Q to QUIT): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalane=tuitionBalane+costOfCOurse;
            } else {
                break;
            }

        }while (1==1);
    }

    //check the balance
    public void viewBalance(){
        System.out.println("YOUR CURRENT BALANCE IS: $"+tuitionBalane);
    }

    //payment method
    public void payTuition(){
        viewBalance();
        System.out.print("PLEASE ENTER YOUR PAYMENT: $");
        Scanner in=new Scanner(System.in);
        int payment=in.nextInt();
        tuitionBalane-=payment;
        System.out.println("THANK YOUR FOR THE PAYMENT: $"+payment);
        viewBalance();


    }

    @Override
    public String toString() {
        return "Name: "+firstName+" "+lastName +"\nGraduation Yeat: "+graduationYear+"\nStudent ID: " +studentID
                + "\nCourese: "+ courses+"\nBalance: " + tuitionBalane;
    }
}
