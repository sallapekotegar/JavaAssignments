package com.Assignments.Assignment4;

import java.util.TreeSet;

/*
 * 6. Get highest and lowest value stored in TreeSet
 */
public class Program6 {

    public static void main(String[] args) {

        TreeSet tSet = new TreeSet();

        tSet.add("1");
        tSet.add("3");
        tSet.add("2");
        tSet.add("5");
        tSet.add("4");
        System.out.println(tSet);
        System.out.println("Lowest value : " + tSet.first());

        System.out.println("Highest value : " + tSet.last());
    }

}
