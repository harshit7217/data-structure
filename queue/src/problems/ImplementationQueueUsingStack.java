package problems;

import java.util.Stack;

public class ImplementationQueueUsingStack {
    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);

        System.out.println(dequeue());
        System.out.println( dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());
//        System.out.println(dequeue());
    }

    private static Stack<Integer> s1 = new Stack<>();
    private static Stack<Integer> s2 = new Stack<>();

    public static void enqueue(int data){
        s1.push(data);
    }

    public static int dequeue() throws IllegalStateException {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        if(s2.isEmpty())
            throw new IllegalStateException("Queue is Empty: Underflow");
        else {
            int data = s2.pop();

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return data;
        }
    }
}
