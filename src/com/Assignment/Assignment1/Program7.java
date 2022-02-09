package com.Assignments.Assignment1;

/*
 * 7. Write a program to print the sum of the first 20 natural numbers.
 */
public class Program7 {

    public double printSum(long n) {
        return n*(n+1)*(0.5);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Program7 obj = new Program7();
        System.out.println(obj.printSum(20));
    }
}
