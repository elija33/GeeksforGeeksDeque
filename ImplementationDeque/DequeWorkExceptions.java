package ImplementationDeque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeWorkExceptions {
    public static void main(String[] args) {
        Deque<Integer> num = new LinkedList<>();

        // Adding element at the front of the Deque.
        num.addFirst(2);
        num.addFirst(4);
        num.addFirst(6);
        num.addFirst(8);

        // Adding element at the end of the Deque
        num.addLast(10);
        num.addLast(16);
        num.addLast(12);
        num.addLast(14);

        // Printing out the whole elements in the Deque
        System.out.println();
        System.out.println("Printing out all the elements in Deque");
        System.out.println(num);

        System.out.println();

        // Getting the first element in the Deque which is element 8
        System.out.println("Getting the first Element from Deque");
        System.out.println(num.getFirst());
        System.out.println();

        // Getting the last element in the Deque which is element 14
        System.out.println("Getting the last Element from the Deque");
        System.out.println(num.getLast());
        System.out.println();

        // Removing the first element from the front of the Deqeu
        num.removeFirst();
        System.out.println("Removing the first element at the front");
        System.err.println(num);
        System.out.println();

        // Removing the last element from the end of the Deqeu
        num.removeLast();
        System.out.println("Removing the last element at the end");
        System.out.println(num);
        System.out.println();

        // Printing out the list of elements after removing the first element from the
        // front of Deque
        System.out.println("Printing out the first element in the Deque which is 6");
        System.out.print(num.getFirst());
        System.out.println();

        // Printing out the list of elements after removing the last element from the
        // end of Deque
        System.out.println();
        System.out.println("Printing out the last element in the Deque which is 12");
        System.out.print(num.getLast());
    }
}