package com.Assignments.Assignment4;

import java.util.HashSet;
/*
 * 5. Copy all elements of a HashSet to an Object array.
 */


public class Program5 {

    public static void main(String[] args) {

        HashSet hSet = new HashSet();

        // add elements to HashSet object
        hSet.add(new Integer("3"));
        hSet.add(new Integer("1"));
        hSet.add(new Integer("2"));

        Object[] objArray = hSet.toArray();

        // display contents of Object array
        System.out.println("HashSet elements are copied into an Array.Now Array Contains..");
        for (int index = 0; index < objArray.length; index++)
            System.out.println(objArray[index]);
    }
}
