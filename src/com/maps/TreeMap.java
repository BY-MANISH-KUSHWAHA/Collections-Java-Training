package com.maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

class MyTreeMap {
    public static void display(TreeMap<String,Integer> str, String name){
        System.out.println("-----------"+name+" Size="+str.size()+" -----------");
        Set<String> set = str.keySet();
        Iterator<String> itr = set.iterator();
        Iterator<Integer> itrv = str.values().iterator();
        while(itr.hasNext()){
            System.out.println("Key="+itr.next()+" : Value="+itrv.next());
        }
        System.out.println("------------ END ----------");

    }

    public static void main(String[] args) {
        // Keys are sorted
        TreeMap<String,Integer> map = new TreeMap<String,Integer>();
        map.put("-1",-1);
        map.put("-2",-2);
        map.put("-3",-3);
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("0",0);

        display(map,"Tree HasMap");
    }
}
