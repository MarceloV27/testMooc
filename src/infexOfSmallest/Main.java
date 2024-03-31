package infexOfSmallest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> number = new ArrayList<>();

        while (true) {

            int input = scanner.nextInt();

            if (input == 9999) {
                break;
            }
            number.add(input);

            int small = number.get(0);
            int num = 0;

            for (int i =0; i < number.size(); i++){
                small = number.get(i);
                if (small < num){
                    num = small;
                }
            }
            System.out.println("Smallest number: " + small);

            for(int i =0; i < number.size(); i++){
                if(small == number.get(i)){
                 System.out.println("Found at index: " + i);
                }
            }
        }

    }

}
