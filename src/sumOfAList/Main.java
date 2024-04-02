package sumOfAList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {

            int input = Integer.valueOf(scanner.nextLine());

            int result = 0;
            for(int i = 0; i<list.size(); i++){
                int sumList = list.get(i);
                result += sumList;
            }

            if (input == -1) {
                System.out.println("Sum: " + result);
                break;
            }


            list.add(input);
        }

        System.out.println("");

        // toteuta listan lukujen summan laskeminen tänne
    }


}
