package implementation.queueWithLinkedList;

public class Queue {
    private int length;
    private Node front, rear;

//    Create an empty queue
    public Queue(){
        length = 0;
        front = rear = null;
    }

//    Add the specific data to the rear of the queue
    public void enQueue(int data){
        Node node = new Node(data);
        if(isEmpty()){
            front = node;
        }else {
            rear.next = node;
        }
        length++;
        rear = node;
    }

//    Remove the data from the front of the queue
    public int deQueue() throws Exception {
        if(isEmpty()){
            throw new Exception("Empty Queue");
        }
        int result = front.data;
        front = front.next;
        length--;
        if(isEmpty()){
            rear = null;
        }
        return result;
    }

//    Check whether the queue is empty
    public boolean isEmpty(){
        return (length == 0);
    }

//    Return the size of the queue
    public int size() {
        return length;
    }

//    Returns a string representation of the queue.
    public String toString(){
        String result = "[";
        Node curr = front;
        while(curr.next != null){
            result += curr.data + ", ";
            curr = curr.next;
        }
        result += curr.data + "]";
        return result;
    }
}
