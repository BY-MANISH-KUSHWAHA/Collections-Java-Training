package Collection.Framework.Assessment;

import java.util.LinkedList;

public class Question_4 {
    public static void Swap(int p1,int p2,LinkedList<Integer> ll){
        int temp = ll.get(p1);
        ll.set(p1,ll.get(p2));
        ll.set(p2,temp);
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(-3);
        ll.add(-1);
        ll.add(-1);
        ll.add(0);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        int position1=1;
        int position2=6;

        System.out.println("Original LinkedList: "+ll);
        Swap(position1,position2,ll);
        System.out.println("Modified LinkedList: "+ll);

    }
}
