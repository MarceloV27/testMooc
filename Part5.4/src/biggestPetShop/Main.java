package biggestPetShop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet hulda = new Pet("Hulda", "(golden retriever)");
        Person leo = new Person("Leo", hulda);

        System.out.println(leo);
    }
}
