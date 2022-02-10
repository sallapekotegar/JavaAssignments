package com.Assignments.Assignment4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 2. Reverse an Arraylist.
 */

public class Program2 {

    public static void main(String[] args) {

        List<Integer> aList = Arrays.asList(10, 45, 19, 35, 29);

        System.out.println("Before Reversing a ArrayList:");
        System.out.println(aList);
        Collections.reverse(aList);
        System.out.println("After Reversing a ArrayList:");
        System.out.println(aList);

    }
}
