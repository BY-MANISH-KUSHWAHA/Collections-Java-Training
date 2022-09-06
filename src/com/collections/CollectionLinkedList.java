package com.collections;
import java.util.*;
public class CollectionLinkedList {

    class Node{
        Node next;
        int val;
        public Node(int val){
            this.val = val;
        }
        public void add(int val){
            Node head = this;
            while(head.next!=null){
                head = head.next;
            }
            head.next = new Node(val);
        }
    }
    public void display(LinkedList<String> str){
        Iterator <String> itr = str.iterator();
        int index=0;
        while(itr.hasNext()){
            System.out.println(index+". -> "+itr.next());
            index++;
        }
        System.out.println("----------------------");

    }


    public static void main(String[] args) {
        CollectionLinkedList obj = new CollectionLinkedList();
        LinkedList<String> ll = new LinkedList<String>();
        // Add
        ll.add("1 ");
        ll.add("2 ");
        ll.add("3 ");
        ll.add("4 ");
        ll.add("1 ");
        // Display
        obj.display(ll);
        // Contains
        System.out.println("iscontains 5 => "+ll.contains("5 "));
        System.out.println("iscontains 4 => "+ll.contains("4 "));
        // add by Index
        System.out.println("Add 5.5 in ll");
        ll.add(3,"5.5 ");
        // Display
        obj.display(ll);
        System.out.println("Add 1 at 0 and 6 at the end.");
        // Add first
        ll.addFirst("1 ");
        // Add Last
        ll.addLast("6 ");
        // Display
        obj.display(ll);
        System.out.println("Size of ll: "+ll.size());
        // remove 1
        System.out.println("Remove an element (1 )");
        ll.remove("1 ");
        System.out.println("Size of ll after removing: "+ll.size());
        obj.display(ll);
        // indexOf
        System.out.println("Index of 4 is "+ll.indexOf("4 "));
        // lastIndexOf
        System.out.println("Last index Of 1 is "+ll.lastIndexOf("1 "));



    }
}
