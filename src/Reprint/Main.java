package Reprint;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

try{
        int variableInput = 0;

        while (true) {

            System.out.println("How many times?");
            variableInput = scanner.nextInt();

            for (int i = 0; i < variableInput; i++) {
                printText();

            }

            break;
        }

    }catch(InputMismatchException e){
    System.out.println("Invalid Input, Enter a number");
    scanner.next();
}
    scanner.close();

    }

    public static void printText() {
        // write some code here

        System.out.println("In a hole in the ground there lived a method ");

    }



}
