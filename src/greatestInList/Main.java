package greatestInList;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {

            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {

                int greater = list.get(0);

                for(int i = 0; i < list.size(); i++) {

                    int number = list.get(i);

                    if (greater < number) {
                        greater = number;
                    }
                }

                System.out.println("The greater number: " + greater);
                break;

            }

            list.add(input);
        }

        System.out.println("");

        // implement finding the greatest number in the list here




    }




}
