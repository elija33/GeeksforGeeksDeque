package ArrayDeque;

// ArrayDeque in Java
import java.util.ArrayDeque;

public class ArrayDeques {
    public static void main(String[] args) {
        ArrayDeque<Integer> number = new ArrayDeque<Integer>();

        // Adding items to the ad using add()
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(35);
        number.add(40);

        System.out.println(number);
    }
}
