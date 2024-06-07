package Cubes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){

                String inputVariable = scanner.nextLine();

                if (inputVariable.equals("end")) {
                    break;
                }

                int inputConverInt = Integer.parseInt(inputVariable);
                double power3 = Math.pow(inputConverInt, 3);
                System.out.println((int)power3);
        }
    }
}
