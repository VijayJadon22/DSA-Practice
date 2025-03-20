package MyQueue;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // MyQueue queue = new MyQueue(5);
        // queue.enqueue(1);
        // queue.enqueue(2);
        // queue.enqueue(3);
        // queue.enqueue(4);
        // queue.enqueue(5);
        // System.out.println(queue.toString());
        // System.out.println(queue.dequeue());
        // System.out.println(queue.dequeue());
        // System.out.println(queue.dequeue());
        // System.out.println(queue.dequeue());
        // System.out.println(queue.dequeue());
        // System.out.println(queue.toString());


        // // queue using stacks
        // QueueUsingStack queue = new QueueUsingStack();
        // queue.enqueue(1);
        // queue.enqueue(2);
        // queue.enqueue(3);
        // queue.enqueue(4);

        // System.out.println(queue.dequeue());
        // System.out.println(queue.dequeue());

        // queue.enqueue(7);
        // queue.enqueue(8);
        // System.out.println(queue.dequeue());
        // System.out.println(queue.dequeue());
        // System.out.println(queue.dequeue());

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(-1);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
