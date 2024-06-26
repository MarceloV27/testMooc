package ageOfTheOldest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] parts = input.split(",");
            int age = Integer.parseInt(parts[1].trim());
            if (age > maxAge) {
                maxAge = age;
            }
        }

       System.out.println("Age of the oldest: " + maxAge);

        scanner.close();
    }
}
