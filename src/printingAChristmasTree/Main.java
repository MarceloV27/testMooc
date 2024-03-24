package printingAChristmasTree;

public class Main {

    public static void main(String[] args) {
        chistmasTree(10);
    }

    public static void chistmasTree(int height){


        for (int i = 1; i <= height; i++) {
            // Print spaces
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // Calculate the width of the base
        int baseWidth = 2 * height - 1;

        // Calculate the left padding to center the base
        int leftPadding = (baseWidth - 3) / 2;

        // Print the base
        for (int i = 0; i < 2; i++) {
            // Print left padding
            for (int j = 0; j < leftPadding; j++) {
                System.out.print(" ");
            }
            // Print stars for the base
            System.out.println("***");
        }






    }


    }




