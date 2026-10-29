package implementation.dynamicCicularArray;

public class Queue {
//    Array used to implement the queue.
    private int[] A;
    private int size, front, rear;

//    Length of the array used to implementation the queue.
    private int capacity = 16; //default length
    private int minCapacity = 1<<15;

//    Initialize the queue to use an default length
    public Queue(){
        A = new int[capacity];
        size = 0; front=0; rear=0;
    }

//    Initialize the queue to use an given length
    public Queue(int capacity){
        this.capacity = capacity;
        minCapacity = capacity;
        A = new int[capacity];
        size = 0; front = 0; rear = 0;
    }

//    Insert an element at rear of the queue.
    public void enQueue(int data) throws IllegalStateException {
        if(size == capacity){
            expand();
        }
        size++;
        A[rear] = data;
        rear = (rear + 1) % capacity;
    }

//    Removes the front element of the queue
    public int deQueue() throws IllegalStateException{
        if(size == 0){
            throw new IllegalStateException("Queue is Empty: Underflow");
        }
        size--;
        int data = A[front];
        A[front] = Integer.MIN_VALUE;
        front = (front+1) % capacity;
        return data;
    }

//    Check whether the queue isEmpty
    public boolean isEmpty(){
        return (size == 0);
    }

//    Check whether the queue is Full
    public boolean isFull() {
        return (size == capacity);
    }

//    Return the size of the queue.
    public int size() {
        return size;
    }

//    Increase the queue size by double
    private void expand(){
        int length = size();
        int[] newQueue = new int[length << 1];

//        copy element
        for(int i=0; i<size; i++){
            newQueue[i] = A[(i+front)%capacity];
        }
        A = newQueue;
        front = 0;
        rear = length;
        capacity *= 2;
    }

//    dynamic array operation shrink.
    private void shrink() {
        int length = size();
        if(length <= minCapacity || length << 2 >= length){
            return;
        }

        if(length<minCapacity) length = minCapacity;
        int[] newQueue = new int[length];
        System.arraycopy(A, 0, newQueue, 0, length + 1);
        A = newQueue;
    }

//    Return a string representation of the queue.
    public String toString(){
        String result = "[";
        for(int i=0; i<size; i++){
            result += Integer.toString(A[(front + i) % capacity]);
            if(i < size - 1){
                result += ",";
            }
        }
        result += "]";
        return result;
    }
}
