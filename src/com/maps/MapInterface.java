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

        // Adding Elements - Put
        map.put(-1,"A");
        map.put(0,"B");
        map.put(1,"C");
        map.put(2,"D");
        map.put(3,"E");
        map.put(4,"F");

        // display
        display(map,"HASHMAP");

        // display using mapper
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry pair = (Map.Entry) itr.next();
            System.out.println(pair.getKey()+" => "+pair.getValue());
        }

        // clone
        HashMap<Integer,String> clone = (HashMap<Integer, String>) map.clone();
        display(clone,"Clone");

        // isEmpty
        System.out.println("isEmpty = "+map.isEmpty());

        // size()
        System.out.println("Size = "+map.size());

        // remove
        map.remove(-1);
        display(map,"  -1 is removed");
        // putAll
        map.putAll(clone);

        // display
        display(map,"put All");

        // clear
        clone.clear();
        display(clone,"Clear");

        //merge
        map.merge(3," | R",(oldValue, newValue) -> oldValue + newValue);
        display(map, "Merge");

        // compute
        map.compute(1, (key, val) -> val.concat(" compute_added"));
        display(map, "compute");

        // computeifAbsent
        map.computeIfAbsent(2, k -> "No Value Present" + "-IfAbsent");
        map.computeIfAbsent(9, k -> "No Value Present" + "-IfAbsent");

        display(map,"computeIfAbsent");
        // computeIfPresent
        map.computeIfPresent(2, (key, val) -> val + "-IfPresent");
        map.computeIfPresent(11, (key, val) -> val + "-IfPresent");
        display(map,"computeIfPresent");







    }

}
