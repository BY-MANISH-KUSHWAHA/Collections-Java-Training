package com.maps;

import java.util.*;

public class MapInterface {
    // Object that maps with key value pairs
    // Duplicated keys are not allowed

    // Exceptions:
    //  1. Null pointer Exceptions => null object
    //  2. No Such element => get ans element which doesn't exist
    //  3. Class Cast Exception => object is incompatible
    //  4. unsupported Operation => unmodifiable map


    // HashMap
    //  Stores key and value pair =>  keys should always unique

    public static void display(HashMap<Integer,String> str, String name){
        System.out.println("-----------"+name+" Size="+str.size()+" -----------");
        Set<Integer> set = str.keySet();
        Iterator<Integer> itr = set.iterator();
        Iterator<String> itrv = str.values().iterator();
        while(itr.hasNext()){
            System.out.println("Key="+itr.next()+" : Value="+itrv.next());
        }
        System.out.println("------------ END ----------");

    }
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        // Adding Elements
        map.put(-1,"A");
        map.put(0,"B");
        map.put(1,"C");
        map.put(2,"D");
        map.put(3,"E");
        map.put(4,"F");

        // display
        display(map,"HASHMAP");



    }

}
