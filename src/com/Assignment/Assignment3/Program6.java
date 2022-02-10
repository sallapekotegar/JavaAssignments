package com.Assignments.Assignment3;

import java.util.Scanner;

/*
 * 6. Write a program where a method declares that it throws ArithmeticException.
 */

public class Program6 {

    public static void divisionOperation(int a, int b) {
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception: cannot divide by 0");
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a & b value : ");
        int a,b;
        a=Integer.parseInt(s.next());
        b=Integer.parseInt(s.next());
        Program6.divisionOperation(a, b);

    }

}
