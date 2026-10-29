package problems.palindrome;

public class Operations {
    ListNode head;

    public boolean isPalindrome(){
//       Finding the middle of the linked list
        ListNode slow = head, fast = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

//        Reverse a half linked list
        ListNode prev = null, curr = slow;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        ListNode temp = head;
        while(prev != null && temp != null){
            if(prev.val != temp.val){
                return false;
            }
//            System.out.println(prev.val +" "+ temp.val);
            prev = prev.next;
            temp = temp.next;
        }

        return true;
    }

    public void insert(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(5);
        ListNode n7 = new ListNode(4);
        ListNode n8 = new ListNode(3);
        ListNode n9 = new ListNode(2);
        ListNode n10 = new ListNode(1);
        head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;
    }
}
