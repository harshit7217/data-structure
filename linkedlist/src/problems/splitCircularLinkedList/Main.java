package problems.splitCircularLinkedList;

import problems.findMiddleOfLinkedList.List;
import singlyLinkedList.insertedAndDeleteElements.LinkedList;

public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation();

        operation.insert();
//        int length = operation.getLength();
//        System.out.println(length);

//        Split LinkedList
        operation.splitCircularLinkedList();
        ListNode head1 = operation.getHead1();
        ListNode head2 = operation.getHead2();

        operation.traversing(head1);
        operation.traversing(head2);
    }
}
