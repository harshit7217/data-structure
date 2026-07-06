package problems.reversePair;

public class Operations {
    ListNode head;

//    Reverse a linked list in k node group using recursion
    public ListNode reverseKNode(ListNode node, int k){
        ListNode prev = null, curr = node, next = null;
        int count = k;

        while(curr != null && count > 0){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count--;
        }

        if(next != null){
            node.next = reverseKNode(next, k);
        }
        return prev;
    }

//    Reverse a linked list in pairs by using without recursive
    public ListNode reversePairWithoutRecursive(){
        ListNode temp1 = null;
        ListNode temp2 = null;
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(temp1 != null){
                temp1.next.next = curr.next;
            }
            temp1 = curr.next;
            curr.next = curr.next.next;
            temp1.next = curr;
            if(temp2 == null){
                temp2 = temp1;
            }
            curr = curr.next;
        }
        return temp2;
    }

//    Display the linked list
    public void display(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val +" ");
            curr =curr.next;
        }
    }

//    Reverse a linked in to pairs
    public ListNode reversePairRecursive(ListNode head){
        ListNode temp;
        if(head == null || head.next == null){
            return null;
        }else{
            temp = head.next;
            head.next = temp.next;
            temp.next = head;
            head = temp;

            head.next.next = reversePairRecursive(head.next.next);
            return head;
        }
    }

    public ListNode getHead(){
        return head;
    }

//    Inserting a linkedlist
    public void insert(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(8);
        head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
    }
}
