package com.Assignments.Assignment1;
/*
 * 4. Write a program to check whether the current year is leap year or not. Users will
enter a year value.
 */


public class Program4 {

    public void leapyear(int year) {
        if ((year % 100!= 0))
        {if((year % 4 == 0))
            System.out.println("Non - Century year is prime");
        }
        else if((year % 400 == 0))
            System.out.println("Century year is prime");

        else System.out.println("Century year/Non-century year is not prime");
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Program4 obj = new Program4();
        obj.leapyear(2100);

    }

}
