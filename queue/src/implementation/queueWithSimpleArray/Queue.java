package implementation.queueWithSimpleArray;

public class Queue {
//    Array used to implement the queue
    private int[] A;
    private int size, front, rear;

//    Length of the array used to implement the queue
    private int capacity = 16; //Default Queue size

//    Initialize queue to use an array of given length
    public Queue(){
        A = new int[capacity];
        size = 0; front = 0; rear = 0;
    }

//    Initialize queue to use an array of given length
    public Queue(int capacity){
        A = new int[capacity];
        this.capacity = capacity;
        size = 0; front = 0; rear = 0;
    }

//    Insert an element at the rear of the queue. This method runs in O(1) time.
    public void enQueue(int data) throws NullPointerException, IllegalStateException{
        if(size == capacity){
            throw new IllegalStateException("Queue is full: Overflow");
        }else {
            size++;
            A[rear] = data;
            rear = (rear+1)%capacity;
        }
    }

//    Remove the front elements from the queue
    public int deQueue() throws IllegalStateException{
        if(size == 0){
            throw new IllegalStateException("Queue is empty: Underflow");
        }else {
            size--;
            int data = A[front];
            A[front] = Integer.MIN_VALUE;
            front = (front+1)%capacity;
            return data;
        }
    }

//    Check whether the queue is Empty
    public boolean isEmpty(){
        return (size == 0);
    }

//    Check whether the queue is Full
    public boolean isFull(){
        return (size == capacity);
    }

//    Return the number of elements in the queue.
    public int size(){
        return size;
    }

//    Return a string representation of the queue as a list of elements.
    public String toString() {
        String result = "[";
        for(int i=0; i<size; i++){
            result += Integer.toString(A[front+i % capacity]);
            if(i < size - 1){
                result += ',';
            }
        }
        result += ']';
        return result;
    }
}
