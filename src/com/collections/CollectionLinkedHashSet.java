package com.collections;
import java.util.*;
public class CollectionLinkedHashSet {
    public void display(LinkedHashSet<String> str, String name){
        System.out.println("-----------"+name+"-----------");
        Iterator <String> itr = str.iterator();
        int index=0;
        while(itr.hasNext()){
            System.out.println(index+". -> "+itr.next());
            index++;
        }
        System.out.println("------------ END ----------");

    }
    public static void main(String[] args) {
        CollectionLinkedHashSet obj = new CollectionLinkedHashSet();
        // Always maintains the sequence of Set.
        // Order of elements
        // Double linked list across all elements
        LinkedHashSet<String> dlset = new LinkedHashSet<>();

        // adding
        dlset.add("1");
        dlset.add("2");
        dlset.add("3");
        dlset.add("4");

        // display
        obj.display(dlset,"LinkedHashSet");
        System.out.println("LinkedHashSet elements: "+dlset);




    }
}
