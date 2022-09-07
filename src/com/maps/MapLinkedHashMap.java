package com.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class MapLinkedHashMap {
    public static void display(LinkedHashMap<String,Integer> str, String name){
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
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();

        map.put("-1",-1);
        map.put("-2",-2);
        map.put("-3",-3);
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("0",0);


        display(map,"Linked HasMap");
    }
}
