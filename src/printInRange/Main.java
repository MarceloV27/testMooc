package printInRange;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("The numbers in the range [0, 5]");
        ArrayList<Integer> numbers = new ArrayList<>();

        printNumbersInRange(numbers,0,5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers ,3,10);
    }
    public static void printNumbersInRange( ArrayList<Integer> numbers, int lowerLimit, int upperLimit){



        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        for(int i = 0; i < numbers.size(); i++){
            int numberList = numbers.get(i);

            if( numberList >= lowerLimit && numberList <= upperLimit){

                System.out.println(numberList);

            }
        }



    }



}