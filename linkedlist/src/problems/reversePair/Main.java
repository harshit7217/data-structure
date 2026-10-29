package problems.reversePair;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();

        operations.insert();
        ListNode head = operations.getHead();
//        head = operations.reversePairRecursive(head);
//        operations.display(head);


//        Pair Reverse
//        head = operations.reversePairWithoutRecursive();
        operations.display(head);

        System.out.println();

//        Reverse a K node
        head = operations.reverseKNode(head, 5);
        operations.display(head);
    }
}
