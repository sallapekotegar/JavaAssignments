package com.Assignments.Assignment1;

/*
 * 6. Write a program to calculate the area of a triangle. Users will enter the values for
base and height of the triangle.
 */

public class Program6 {

    public double triangleArea(double base, double height) {

        return (0.5)*(base)*(height);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Program6 obj = new Program6();
        System.out.println(obj.triangleArea(10.0, 10.0));
    }
}
