package DesignDataMinMax;

import java.util.ArrayDeque;
import java.util.Deque;

public class DesignMinMax {
    Deque<Integer> number;

    public DesignMinMax() {
        number = new ArrayDeque<Integer>();
    }

    public void insertMin(int num) {
        number.offerFirst(num);
    }

    public void insertMax(int num) {
        number.offerLast(num);
    }

    public int getMin() {
        return number.peekFirst();
    }

    public int getMax() {
        return number.peekLast();
    }

    public int extractMax() {
        return number.pollLast();
    }

    public int extractMin() {
        return number.pollFirst();
    }

    public static void main(String[] args) {
        DesignMinMax num = new DesignMinMax();
        num.insertMax(30);
        num.insertMin(5);
        num.insertMin(3);
        num.insertMin(7);
        num.insertMax(25);
        num.insertMax(40);
        num.insertMax(15);

        int numbe = num.extractMin();
        System.out.println(numbe);

        numbe = num.extractMax();
        System.out.println(numbe);

        num.insertMin(8);
    }
}
