package problems;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementationStackUsingQueue {
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);

        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
    }

    private static Queue<Integer> q1 = new LinkedList<>();
    private static Queue<Integer> q2 = new LinkedList<>();

    public static void push(int data){
        if(q1.isEmpty()){
            q2.offer(data);
        }else {
            q1.offer(data);
        }
    }

    public static int pop() throws IllegalStateException {
        if(q1.isEmpty() && q2.isEmpty()) throw new IllegalStateException("Queue Empty: Underflow");
        int i=0, size;
        if(q1.isEmpty()) {
            size = q2.size();
            while(i < size - 1){
                q1.offer(q2.poll());
                i++;
            }
            return q2.poll();
        }else {
            size = q1.size();
            while(i < size - 1){
                q2.offer(q1.poll());
                i++;
            }
            return q1.poll();
        }
    }
}
