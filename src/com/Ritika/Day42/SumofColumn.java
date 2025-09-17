package com.Ritika.Day42;
import java.util.Arrays;
import java.util.Scanner;
public class SumofColumn {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][4];
        System.out.print("Enter array:");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sum of columns are: ");
        for(int j=0;j<4;j++){
            int sum=0;
            for(int i=0;i<4;i++){
                sum+=arr[i][j];
            }
            System.out.println("Column " + (j+1) + " sum = " + sum);
        }
    }
}
