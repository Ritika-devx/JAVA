package com.Ritika.Day41;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayInsertion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        int n=5;
        System.out.println("Enter n Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter value you want to insert:");
        int value=sc.nextInt();
        int pos=2;
        for(int i=n;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=value;
        n++;
        System.out.println("Elements after insertion:"+ Arrays.toString(arr));
    }

}
