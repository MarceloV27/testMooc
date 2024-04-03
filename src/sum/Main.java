package sum;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);

        System.out.println(sum(numbers));

         numbers.add(5);

        numbers.add(1);

        System.out.println(sum(numbers));

    }


    public static int sum(ArrayList<Integer> number) {

        int result = 0;
        for(int i = 0; i<number.size(); i++){
            int numberList = number.get(i);
             result += numberList;
        }

        return result;
    }




}
