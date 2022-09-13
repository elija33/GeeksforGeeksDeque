package ImplementationDeque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeWorking {
    public static void main(String[] args) {
        Deque<Integer> number = new LinkedList<Integer>();

        // Adding element at the end of Deque
        number.offerLast(20);
        number.offerLast(25);
        number.offerLast(30);

        // Adding element at the front of Dqque
        number.offerFirst(5);
        number.offerFirst(10);
        number.offerFirst(15);

        // Retrieve the head element
        System.out.println("");
        System.out.println(number.peekFirst());

        System.out.println();

        // Retrieve the end element
        System.out.println(number.peekLast());

        // Retrieve and removing the first element
        number.pollFirst();

        // Retrieve and removing the tail element
        number.pollLast();

        System.out.println(number.peekFirst());

        // printing out the last element in dseque
        System.out.println(number.peekLast());
    }
}
