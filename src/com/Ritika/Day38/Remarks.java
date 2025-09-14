package com.Ritika.Day38;

import java.util.Scanner;
public class Remarks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks(0-100):" );
        int marks =sc.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("Excellent");
        } else if (marks >= 75) {
            System.out.println("Good");
        } else if (marks >= 50) {
            System.out.println("Average");
        } else if (marks >= 0) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks");

            return;

        }

        switch(marks/10){
            case 10:
            case 9:
                System.out.println("Excellent");
                break;
            case 8:
            case 7:
                System.out.println("Good");
                break;
            case 6:
            case 5:
                System.out.println("Average");
                break;
            case 4: case 3: case 2: case 1:
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Input");

        }
    }
}
