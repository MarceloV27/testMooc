package onlyTheseNumbers;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {


            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {

                System.out.println("From where?");
                int startPositionItem = scanner.nextInt();

                System.out.println("To where?");
                int lastPositionItem = scanner.nextInt();

                for(int i =startPositionItem; i <= lastPositionItem; i++ ){

                    System.out.println(numbers.get(i));

                }


                break;
            }

            numbers.add(number);
        }

    }


}
