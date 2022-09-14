package ArrayDeque.ArrayDequeAsDeque;

import java.util.ArrayDeque;

public class DequeDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> num = new ArrayDeque<>();

        System.out.println();
        num.offerFirst(5);
        num.offerLast(10);
        num.offerFirst(15);
        num.offerFirst(20);
        num.offerLast(25);

        // Print out the num in Deque
        System.out.println();
        System.out.println("Printing out all the num in the deque");
        System.out.println(num);

        System.err.println();
        System.out.println("Return the fist element in the Deque");
        System.out.println(num.peekFirst());

        System.out.println();
        System.out.println("Returns the last element in the Deque");
        System.out.println(num.peekLast());

        System.out.println();
        System.out.println(num.pollFirst());

        System.out.println();
        System.out.println(num.peekFirst());

        System.out.println();
        System.out.println(num.pollLast());

        System.out.println();
        System.out.println(num.peekLast());
    }
}
