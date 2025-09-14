package com.Ritika.Day36;
public class SumOfThree {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Invalid: Please provide three numbers .");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int sum = num1 + num2 + num3;

        System.out.println("The sum of the three numbers is: " + sum);
    }
}
