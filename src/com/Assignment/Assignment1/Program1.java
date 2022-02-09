package com.Assignments.Assignment1;
/* 1. Write a program to calculate the factorial of a number using a while loop.
 *The factorial of a positive number n is given by:
 *factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n
 */
public class Program1 {

        int f=8;
        public int factorial(int n) {
            if (n==0)	return 1;
            else {
                while (n>0) {
                    f=f*n;
                    n=n-1;
                }
                return f;
            }
        }
        public static void main(String[] args) {
            // TODO Auto-generated method stub

            Program1 obj = new Program1();
            System.out.println(obj.factorial(3));
        }

}
