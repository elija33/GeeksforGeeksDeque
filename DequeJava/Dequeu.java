package DequeJava;

public class Dequeu {
    int size;
    int cap;
    int[] numbers;

    public Dequeu(int num) {
        cap = num;
        size = 0;
        numbers = new int[cap];
    }

    public boolean isFull() {
        return (size == cap);
    }

    // cheching to find out if the dqueu is empty or not
    public boolean isEmpty() {
        return (size == 0);
    }

    // insert an element at the front of dqueu
    public void insertFront(int num) {
        if (isFull()) {
            return;
        }
        for (int i = size - 1; i >= 0; i++) {
            numbers[i + 1] = numbers[i];
            numbers[0] = num;
            size++;
        }
    }

    // Inseting an element at the end of deque
    public void isertEnd(int nums) {
        if (isFull()) {
            return;
        }
        numbers[size] = nums;
        size++;
    }

    // Deleting an element from the end
    public void deleteEnd() {
        if (isEmpty()) {
            return;
        }
        size--;
    }

    // Deleting an element at the front of deque
    public void deleteFront() {
        if (isEmpty()) {
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            numbers[i] = numbers[i + 1];
            size--;
        }
    }

    // Cheching the first element at the end of Deque
    public int getEnd() {
        if (isEmpty()) {
            return -1;
        } else {
            return (size - 1);
        }
    }

    public static void main(String[] args) {

    }
}