package com.Ritika.Day42;
import java.util.Arrays;
import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows number:");
        int rows=sc.nextInt();
        System.out.println("Enter column number:");
        int cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=arr[0][0];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            System.out.println("Maximum element:" + max);
        }

    }
}
