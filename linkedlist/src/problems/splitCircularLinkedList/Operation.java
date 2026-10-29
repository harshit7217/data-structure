package problems.splitCircularLinkedList;

import problems.findMiddleOfLinkedList.List;

public class Operation {
    ListNode head;

//    Traversing
    public void traversing(ListNode temp){
        ListNode curr = temp;
        do{
            System.out.print(curr.val+" ");
            curr = curr.next;
        }while(curr != temp);
        System.out.println();
    }

//    Split the circular linked list
    ListNode head1;
    ListNode head2;
    public void splitCircularLinkedList(){
        if(head == null) return;

//        Finding the middle the linked list in case of even or odd
        ListNode slow = head, fast = head;
        while(fast.next != head && fast.next.next != head){
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast.next.next == head) fast = fast.next;

//        Set head1
        head1 = head;

//        Set head2
        if(head.next != head){
            head2 = slow.next;
        }

        fast.next = slow.next;
        slow.next = head;
    }

    public ListNode getHead1(){
        return head1;
    }

    public ListNode getHead2(){
        return head2;
    }

//    Finding the length of the linked list
    public int getLength(){
        ListNode curr = head;
        int length = 0;
        do{
            length++;
            curr = curr.next;
        }while(curr != head);
        return length;
    }

//    inserting element
    public void insert(){
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(15);
        ListNode n3 = new ListNode(7);
        ListNode n4 = new ListNode(40);

        head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n1;
    }
}
