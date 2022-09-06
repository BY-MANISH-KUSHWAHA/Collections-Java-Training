package com.collections;
import java.util.*;
public class CollectionArrayList {


    public static void main(String[] args) {
        // al Object of Class ArrayList
        ArrayList al = new ArrayList();
        // Appending /Adding to the Array List
        al.add("Manish");
        al.add("Hriti");
        al.add("Driti");
        al.add("Hriti");
        al.add("Ravi");
        boolean AlwaysTrue = al.add("Kusum");

        System.out.println(AlwaysTrue);

        al.add(2,"Kushwaha");

        //Interface itr = al.iterator()
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        int LastIndex = al.lastIndexOf("Hriti");
        System.out.println("Last Index of Hriti "+LastIndex);

        ArrayList clone = (ArrayList) al.clone();
        System.out.println(clone==al);

        Object[] copy = al.toArray();
        for (Object obj:
             copy) {
            System.out.println(obj+"---");
        }

        al.trimToSize();

        al.clear();
        System.out.println("Clear "+al.size());
        itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(int i=0; i< al.size(); i++){
            System.out.println(al.get(i));
        }
        //for(; itr.hasNext();){
        //
        //    System.out.println(itr.next());
        //}
    }

}
