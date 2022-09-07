package com.collections;
import java.util.*;
public class CollectionHashTable {
    public void display(Hashtable<Integer,String> str, String name){
        System.out.println("-----------"+name+" Size="+str.size()+" -----------");
        Enumeration<Integer> itr = str.keys();
        Iterator<String> itrv = str.values().iterator();
        while(itr.hasMoreElements()){
            System.out.println("Key="+itr.nextElement()+" : Value="+itrv.next());
        }
        System.out.println("------------ END ----------");

    }
    public static void main(String[] args) {
        CollectionHashTable dis = new CollectionHashTable();
        Hashtable<Integer,String> hash = new Hashtable<>();


        // add
        hash.put(1,"A");
        hash.put(2,"B");
        hash.put(3,"C");
        hash.put(4,"D");
        hash.put(5,"E");
        //hash.put(null,"#"); //Cannot invoke "Object.hashCode()" because "key" is null

        //hash.put(6,null);
        //Exception in thread "main" java.lang.NullPointerException
        //at java.base/java.util.Hashtable.put(Hashtable.java:476)
        //at com.collections.CollectionHashTable.main(CollectionHashTable.java:26)

        // display
        dis.display(hash," Adding some elements");

        // Contains
        System.out.println("is Contains value(Element) "+hash.contains("D"));

        // isEmpty
        System.out.println("isEmpty() "+hash.isEmpty());

        // remove "A"
        System.out.println("remove by key 1 "+hash.remove(1));

        // display
        dis.display(hash," key 1 and value A both are removed from HT");

        // clone
        Hashtable<Integer,String> copy = (Hashtable<Integer, String>) hash.clone();

        // display
        dis.display(copy," Copy ");

        // Size
        System.out.println("Size of HT "+hash.size());

        // clear
        copy.clear();

        // display
        dis.display(copy," Clear ");





        


    }



}
