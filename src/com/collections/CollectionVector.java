package com.collections;
import java.util.*;
public class CollectionVector {
    public void display(Vector<String> str, String name){
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
        CollectionVector obj = new CollectionVector();
        // Vector
        Vector<String> vec = new Vector<>();
        // add
        vec.add("1");
        vec.add("2");
        vec.add("3");
        vec.add("4");
        vec.add("5");
        vec.add("6");
        // display
        obj.display(vec,"Adding");
        // addindex
        vec.add(3,"9");
        // display
        obj.display(vec,"Adding by Index");
        // remove
        vec.remove("3");
        // display
        obj.display(vec,"Element 3 is removed");
        // contains
        System.out.println(vec.contains("5"));
        // display
        obj.display(vec,"Adding by Index");
        System.out.println("Index of element 2 "+vec.indexOf("6"));
        System.out.println("Size of vector "+vec.size());
        vec.add(3,"4");
        System.out.println("Last Index of element 4 "+vec.indexOf("4"));
        // display
        obj.display(vec,"Elements");
        vec.clear();
        // display
        obj.display(vec,"No Elements");









    }
}
