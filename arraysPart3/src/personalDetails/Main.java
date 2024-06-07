package personalDetails;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name ="";
        int sum = 0, count = 0, birthYear = 0, nameLength = 0, temp =0;

        while(true){
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }

            String[] array = input.split(",");

            sum += Integer.valueOf(array[0]);
            count ++;
            nameLength = array[0].length();

            if( temp < nameLength){
                temp = nameLength;
                name = array[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0*sum/count);

    }



}














