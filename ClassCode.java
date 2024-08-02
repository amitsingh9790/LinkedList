package LinkedList;

import java.util.LinkedList;

public class ClassCode {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addFirst(10);
        linkedList.addLast(20);
        linkedList.addFirst(30);
        for (Integer l:linkedList) {
            System.out.println(l);
        }

    }
}
