package com.collections;
import com.sun.source.tree.Tree;

import java.util.*;
public class CollectionTreeSet {
    public static void display(TreeSet<String> str, String name){
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
        TreeSet<String> hash = new TreeSet();
        hash.add("-3");
        hash.add("-2");
        hash.add("-1");
        hash.add("0");
        hash.add("1");
        //hash.add(null); // Error
        hash.add("1");
        hash.add("2");
        hash.add("3");
        hash.add("4");
        hash.add("5");
        hash.add("6");
        hash.addAll(List.of(new String[]{"99", "12"}));
        // display
        display(hash,"TreeSET");
        System.out.println(" Sorted TreeSet elements: "+hash);

        System.out.println("isContains "+hash.contains("0"));

        System.out.println("isEmpty() "+hash.isEmpty() );

        System.out.println("size() " + hash.size());

        hash.remove("2");
        display(hash,"removed 2 - TreeSET");

        //clone
        TreeSet<String> clone = (TreeSet<String>) hash.clone();
        display(clone,"CLONE - TreeSET");


        // first
        System.out.println("First -> "+hash.first());

        // last
        System.out.println("Last -> "+hash.last());

        hash.clear();
        display(hash,"CLEARED - TreeSET");
    }
}
