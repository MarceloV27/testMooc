package test_RemoveFirst;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);

        System.out.println(numbers);

        removeFirst(numbers);

        System.out.println(numbers);

        removeFirst(numbers);
        removeFirst(numbers);
        removeFirst(numbers);

        System.out.println(numbers);
    }

    public static void removeFirst(ArrayList<Integer> numbers) {

        numbers.remove(0);
    }

}
