package averageOfAList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> number = new ArrayList<>();

        while (true){

            Double input = scanner.nextDouble();

            double resultSum = 0;
            for(int i =0; i<number.size(); i++){

                double numberList = number.get(i);
                resultSum += numberList;

            }

            double resultAver= 0;
            if (input == -1){
                resultAver = resultSum/ number.size();
                System.out.println(resultAver);
                break;
            }

            number.add(input);
        }
    }




}
