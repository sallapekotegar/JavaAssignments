package com.Assignments.Assignment4;
import java.util.HashMap;
/*
 * 3. Check if a particular key exists in HashMap.
 */

public class Program3 {


    public static void main(String[] args) {

        String key = "Krishna";
        HashMap<String, Integer> hMap = new HashMap<>();
        hMap.put("Krishna", 26);
        hMap.put("Ram", 24);
        hMap.put("Abhilash", 20);
        hMap.put("Dileep", 28);
        System.out.println(hMap);
        if (hMap.containsKey(key))
            System.out.println("Does key "+ key + " exists: true");
        else
            System.out.println("Does key "+ key + " exists: false");
    }
}
