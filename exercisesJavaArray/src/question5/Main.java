package question5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] arraySpecificValue = {"Dog", "Cat","Elephant", "Crocodile"};

        String displayArray= " ";

        for (String s : arraySpecificValue) displayArray = s;

        if("Crocodile".equals(displayArray)){
            System.out.println(Arrays.toString(arraySpecificValue));
        }else{
            System.out.println("Try again!");
        }



    }
}
