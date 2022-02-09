package com.Assignments.Assignment1;

public class Program2 {

    public int fib(int n) {
        if (n==1) {
            return 0;
        }
        else if(n==2)	return 1;

        else return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Program2 obj = new Program2();
        for(int i=1;i<=10;i++)
            System.out.println(obj.fib(i));
    }
}
