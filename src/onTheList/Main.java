package onTheList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while (true) {


            String input = scanner.nextLine();


            if (input.equals("")) {

                System.out.println("Search for?");
                String name = scanner.nextLine();

                boolean found = list.contains(name);
                if (found){
                    System.out.println(name + " was found!");
                }else {
                    System.out.println(name + " was not found!");
                }

                break;
            }

            list.add(input);
        }

    }

}
