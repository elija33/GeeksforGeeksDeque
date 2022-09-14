package MaximumsSubarraysSize;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumsSubSize {
    public static void printMax(int number[], int k) {
        Deque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < k; ++i) {
            while (!numbers.isEmpty() && number[i] >= number[numbers.peekLast()]) {
                numbers.remove();

                numbers.addLast(i);
            }
        }

        for (int i = k; i < number.length - 1; ++i) {
            System.out.println(number[numbers.peek()] + " ");

            while ((!numbers.isEmpty()) && numbers.peek() <= i - k) {
                numbers.removeFirst();

                while ((!numbers.isEmpty()) && number[i] >= number[numbers.peekLast()]) {
                    numbers.removeLast();

                    numbers.addLast(i);
                }

            }
        }
        System.out.println(number[numbers.peek()]);
    }

    public static void main(String[] args) {
        int number[] = { 20, 40, 30, 10, 60 };
        int k = 3;
    }
}
