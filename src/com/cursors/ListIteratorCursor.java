package com.cursors;

import java.util.ListIterator;
import java.util.Vector;

// All CRUD Operation +> create read update delete
// Both Forward and Backward Direction
// Specify an Index position to target input stream element
public class ListIteratorCursor {

    public static void main(String[] args) {
        Vector<String> empList = new Vector<>();
        empList.add("Manish");
        empList.add("Zoya");
        empList.add("Thor");
        empList.add("Iron Man");
        empList.add("Caption America");

        ListIterator<String> listIterator= empList.listIterator();

        System.out.println("Checking the employee list forward direction ");
        while (listIterator.hasNext()){
            String empName = listIterator.next();
            System.out.println(empName);
        }
        // First Forward then backward as pointer go forward then we have a valid backward motion
        System.out.println("Checking the employee list backward direction ");
        while (listIterator.hasPrevious()){
            String empName = listIterator.previous();
            System.out.println(empName);
        }
        System.out.println();
        // Direct Backward
        ListIterator<String> listIteratorBack = empList.listIterator(empList.size());
        System.out.println("Checking the employee list backward direction with starting at last index");
        while (listIteratorBack.hasPrevious()){
            String empName = listIteratorBack.previous();
            System.out.println(empName);
        }



        // CRUD
        listIterator = empList.listIterator(); // Assign again index 0
        System.out.println("Before CURD Operation: "+empList);
        while (listIterator.hasNext()){
            String employee = listIterator.next();
            // Create/add
            if(employee.equals("Manish")){
                System.out.println(".......... Add Manish-2");
                listIterator.add("Manish-2");
            }
            // Delete/ remove
            if(employee.equals("Zoya")){
                System.out.println(".......... Remove Zoya");
                listIterator.remove();
            }
            // Update/remove
            if(employee.equals("Thor")){
                System.out.println(".......... Update Thor to She-Thor");
                listIterator.set("She-"+employee);
            }
        }
        System.out.println("After CURD Operation: "+empList);



        Vector<String> empListR = new Vector<>();
        empListR.add("Manish");
        empListR.add("Zoya");
        empListR.add("Thor");
        empListR.add("Iron Man");
        empListR.add("Caption America");

        System.out.println("----------- Backward ----------------------");
        // CRUD - Reverse
        listIteratorBack = empListR.listIterator(empListR.size()); // Assign again index 0
        System.out.println("Before CURD Operation: "+empListR);
        while (listIteratorBack.hasPrevious()){
            String employee = listIteratorBack.previous();
            // Create/add
            if(employee.equals("Manish")){
                System.out.println(".......... Add Manish-2");
                listIteratorBack.add("Manish-2");
            }
            // Delete/ remove
            if(employee.equals("Zoya")){
                System.out.println(".......... Remove Zoya");
                listIteratorBack.remove();
            }
            // Update/remove
            if(employee.equals("Thor")){
                System.out.println(".......... Update Thor to She-Thor");
                listIteratorBack.set("She-"+employee);
            }
        }
        System.out.println("After CURD Operation: "+empListR);
    }
}
