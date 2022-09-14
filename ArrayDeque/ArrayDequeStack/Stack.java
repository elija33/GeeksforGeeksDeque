package ArrayDeque.ArrayDequeStack;

import java.util.ArrayDeque;

public class Stack {
    public static void main(String[] args) {
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        // Pushing items to the a useing add()
        numbers.push(5);
        numbers.push(10);
        numbers.push(15);
        numbers.push(20);
        numbers.push(25);
        numbers.push(30);

        System.out.println();
        System.out.println("Printing out the numbers Deque");
        System.out.println(numbers);
        System.out.println();

        // Returns the top of stack
        System.out.println("Returns the top of stack");
        System.out.println(numbers.peek());

        // Returns and removes the top of stack
        System.out.println();
        System.out.println("Returns and removes the top of stack");
        System.out.println(numbers.pop());

        // Adding an element to the stack
        numbers.push(40);

        // Returns the top of stack
        System.out.println();
        System.out.println("Return the top of stack");
        System.out.println(numbers.peek());
    }
}
