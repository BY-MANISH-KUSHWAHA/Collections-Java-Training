package com.cursors;

import java.util.Iterator;
import java.util.Vector;



public class IteratorCursor { // Read and Remove
    // Retrieve the data, remove some elements during traversing it.
    // iterator() method
    public static void main(String[] args) {
        Vector<String> empList = new Vector<>();
        empList.add("Manish");
        empList.add("Zoya");
        empList.add("Thor");
        empList.add("Iron Man");
        empList.add("Caption America");

        System.out.println("Before itr,"+empList);
        Iterator<String> itr = empList.iterator();

        while (itr.hasNext()){
            String employee = itr.next();
            if(employee.equals("Manish")){
                System.out.println(employee+" ,remove");
                itr.remove();
            }

        }

        System.out.println("After itr,"+empList);
    }
}
