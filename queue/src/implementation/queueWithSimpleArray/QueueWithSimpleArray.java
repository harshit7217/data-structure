package implementation.queueWithSimpleArray;

public class QueueWithSimpleArray {
    public static void main(String[] args) {
        Queue Q = new Queue();
        Q.enQueue(4);
        System.out.println("Queue Elements: "+ Q.toString());
        System.out.println("Dequeue operation done! removed: "+ Q.deQueue());
        Q.enQueue(56);
        Q.enQueue(2);
        Q.enQueue(67);
        System.out.println("Queue Elements: "+ Q.toString());
        System.out.println("Dequeue operation done! removed: "+ Q.deQueue());
        System.out.println("Dequeue operation done! removed: "+ Q.deQueue());
        Q.enQueue(24);
        System.out.println("Queue Elements: "+ Q.toString());
        System.out.println("Dequeue operation done! removed: "+ Q.deQueue());
        Q.enQueue(98);
        Q.enQueue(45);
        Q.enQueue(23);
        Q.enQueue(435);
        System.out.println("Queue Elements: "+ Q.toString());
    }
}
