package com.collections;
import java.util.*;
public class CollectionHeshSet {
    public void display(HashSet<String> str, String name){
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
        CollectionHeshSet obj = new CollectionHeshSet();
        // Allows null values
        // Doesn't allow duplicated

        HashSet<String> hash = new HashSet<>();
        hash.add("-3");
        hash.add("-2");
        hash.add("-1");
        hash.add("0");
        hash.add("1");
        hash.add("2");
        hash.add("3");
        hash.add("4");
        hash.add("5");
        hash.add("6");


        obj.display(hash,"HashSet");



    }
}
