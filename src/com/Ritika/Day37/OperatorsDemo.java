package com.Ritika.Day37;

public class OperatorsDemo {
    public static void main(String[] args) {
        // ---------------- Assignment Operators ----------------
        int a = 10;
        int b = 5;
        a += 15;
        b *= 20;
        int c = a - b;

        // Print values after assignment operations
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // ---------------- Logical Operators ----------------
        boolean cond1 = (a > b);
        boolean cond2 = (b > c);

        System.out.println("cond1 && cond2: " + (cond1 && cond2));
        System.out.println("cond1 || cond2: " + (cond1 || cond2));
        System.out.println("!cond1: " + (!cond1));


        // ---------------- Relational Operators ----------------
        System.out.println("a > b: " + (a < b));
        System.out.println("a < b: " + (a > b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // ---------------- Ternary Operator ----------------
        int max = (a > b) ? a : b;
        System.out.println("Maximum of a and b is: " + max);
    }
}
