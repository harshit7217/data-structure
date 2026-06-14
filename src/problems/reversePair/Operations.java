package problems.reversePair;

public class Operations {
    ListNode head;

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

        head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
    }
}
