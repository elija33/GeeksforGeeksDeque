package ImplementationDeque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeTraversal {
    public static void main(String[] args) {
        Deque<Integer> number = new LinkedList<>();

        // Adding an element to at the front of Deqeu
        number.addFirst(5);
        number.addFirst(10);
        number.addFirst(20);
        number.addFirst(25);

        // Adding an element to at the last of Dequeue
        number.addLast(30);
        number.addLast(35);
        number.addLast(40);

        // Traversal the Dequeu using for each
        for (int num : number) {
            System.out.print(num + " ");
        }
    }
}
