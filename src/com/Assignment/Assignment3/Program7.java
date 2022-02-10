package com.Assignments.Assignment3;

/*
 * 7. Write a program with nested try blocks.
 */
public class Program7 {

    public static void main(String[] args) {

        try {

            try {
                int b = 39 / 0;
            }

            catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception: cannot divide by 0 "+e);
            }

            try {
                int a[] = new int[5];

                a[5] = 4;
            }

            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: cannot assign value to ArrayIndex is greater than or equal to size of the array "+e);
            }

            System.out.println("Outer try block statement");
        }

        catch (Exception e) {
            System.out.println("Outer catch handled the exception");
        }

        System.out.println("This line executed after all try - catch executed");

    }

}
