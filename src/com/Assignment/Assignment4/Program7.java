package com.Assignments.Assignment4;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 7. Sort ArrayList of Strings alphabetically.
 */

public class Program7 {

    public static void main(String[] args) {

        ArrayList<String> aList = new ArrayList<String>();
        aList.add("India");
        aList.add("Canada");
        aList.add("Singapore");
        aList.add("SouthAfrica");

        System.out.println("********Before Sorting:");
        for(String counter: aList){
            System.out.println(counter);
        }


        Collections.sort(aList);
        System.out.println("********After Sorting:");
        for(String counter: aList){
            System.out.println(counter);
        }
    }

}
