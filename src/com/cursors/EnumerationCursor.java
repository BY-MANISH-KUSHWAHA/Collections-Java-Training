package com.cursors;

import java.util.Enumeration;
import java.util.Objects;
import java.util.Vector;

public class EnumerationCursor { // Read Only
    // 1. retrieve Elements one by one from a collection
    // 2. Enums specifying input stream =>  sequence input stream
    // 3. elements() method enumeration

    // Limitation
    // 1. only elements are of vector

    public static void main(String[] args) {
        Vector<String> empList = new Vector<>();
        empList.add("Manish");
        empList.add("Zoya");
        empList.add("Thor");
        empList.add("Iron Man");
        empList.add("Caption America");

        // Synchronous and Only forward direction is allowed
        // we can't change data while traversing but in forEach we can edit.
        Enumeration<String> enm = empList.elements();

        while (enm.hasMoreElements()){
            String employee = enm.nextElement();
            System.out.println(employee);
        }


    }
}
