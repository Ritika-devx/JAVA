package com.Ritika.Day42;
import java.util.Scanner;
public class FirstLastRow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        System.out.println("Enter columns:");
        int cols=sc.nextInt();
        int[][] matrix=new int[rows][cols];
        System.out.println("Enter array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("First row:");
            for(int j=0;j<cols;j++){
            System.out.print("First row:" + matrix[0][j]);
        }
            System.out.println();

        System.out.println("Enter last row:");
            for(int j=0;j<cols;j++){
                System.out.print("Last row:" + matrix[rows-1][j]);
            }
            System.out.println();
    }
}
