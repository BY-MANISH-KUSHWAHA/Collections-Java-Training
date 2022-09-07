public class main {
    public static void main(String[] args) {
        Collections_Java obj  = new Collections_Java();
        obj.CheckFirst();


        MyLinkedList linedList = new MyLinkedList(5);
        MyLinkedList head = linedList;
        head.add(6);
        head.add(7);
        head.add(8);
        head.add(9);
        while(linedList!=null){
            System.out.println(linedList.val);
            linedList = linedList.next;
        }

    }
}
