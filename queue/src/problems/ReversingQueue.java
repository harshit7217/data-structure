package problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<100; i*=2){
            queue.offer(i);
        }
        System.out.println(queue);

        System.out.println(reverseQueue(queue));
    }

    public static Queue reverseQueue(Queue queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push((Integer) queue.poll());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        return queue;
    }
}
