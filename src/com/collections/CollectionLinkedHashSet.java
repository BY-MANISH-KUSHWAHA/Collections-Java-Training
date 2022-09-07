package com.collections;
import java.util.*;
public class CollectionLinkedHashSet {
    public static void display(LinkedHashSet<String> str, String name){
        System.out.println("-----------"+name+"-----------");
        Iterator <String> itr = str.iterator();
        int index=0;
        while(itr.hasNext()){
            String var = itr.next();
            System.out.println(index+". -> value = "+var+"  , HashCode = "+var.hashCode());
            index++;
        }
        System.out.println("------------ END ----------");

    }
    public static void main(String[] args) {
        // Always maintains the sequence of Set.
        // Order of elements
        // Double linked list across all elements
        LinkedHashSet<String> dlset = new LinkedHashSet<>();

        // adding
        dlset.add("-3");
        dlset.add("-2");
        dlset.add("-1");
        dlset.add("0");
        //dlset.add(null); //error
        dlset.add("1");
        dlset.add("2");
        dlset.add("3");
        dlset.add("4");

        // display
        display(dlset,"LINKEDHASHSET");
        System.out.println("LinkedHashSet elements: "+dlset);

        System.out.println("isContains "+dlset.contains("0"));

        System.out.println("isEmpty() "+dlset.isEmpty() );

        System.out.println("size() " + dlset.size());

        dlset.clear();
        display(dlset,"CLEARED - LINKEDHASHSET");




    }
}
