package com.collections;

public class MyLinkedList {
    public MyLinkedList next;
    public int val;
    public MyLinkedList(int val){
        this.val = val;
    }

    public void add(int val){
        MyLinkedList head = this;
        while(head.next!=null){
            head = head.next;
        }
        head.next = new MyLinkedList(val);
    }
}
