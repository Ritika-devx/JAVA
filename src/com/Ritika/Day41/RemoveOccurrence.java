package com.Ritika.Day41;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveOccurrence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter n elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value you want to remove:");
        int RemoveValue=sc.nextInt();
        int value=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=RemoveValue){
                arr[value]=arr[i];
                value++;
            }
        }
        int[] result=Arrays.copyOf(arr,value);
        System.out.println("Array after removing :"+ RemoveValue +"is" + Arrays.toString(result));
    }
}
