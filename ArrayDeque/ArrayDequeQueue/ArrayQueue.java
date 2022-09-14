package ArrayDeque.ArrayDequeQueue;

import java.util.ArrayDeque;

public class ArrayQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> number = new ArrayDeque<Integer>();
        number.offer(10);
        number.offer(20);

        // Returns and Removes the front of queue, 10
        System.out.println(number.peek());

        // Return the front of queue, 20
        System.out.println(number.poll());

        // Add 40 to last of queue
        number.offer(40);

        // Returns the front of queue, 20
        System.out.println(number.peek());
    }
}
