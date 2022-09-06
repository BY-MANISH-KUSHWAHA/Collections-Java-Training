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





    }
}
