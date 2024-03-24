package advancedAstrology;

public class Main {


    public static void main(String[] args) {
        printTriangle(4);
    }

    public static void printTriangle(int size) {


        for (int i = 1; i <= size; i++) {
            // Print spaces
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }



    }

}
