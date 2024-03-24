package Question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number for display multiplication table");
        int numberMutil = scanner.nextInt();
        int result = 0;

        while(true) {

            if(numberMutil == 0){
                break;
            }

            for (int i = 1; i <= 10; i++) {

                result = numberMutil * i;

                System.out.println(result);
            }


        }

        System.out.println("Exit the program");

    }
}
