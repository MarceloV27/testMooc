package isItTrue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string");
        String input = scanner.nextLine();

        if(input.equals("true")){
            System.out.println("You got it right");
        }else{
            System.out.println("Try again!");
        }

    }
}
