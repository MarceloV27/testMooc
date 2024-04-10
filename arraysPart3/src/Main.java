import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            String input = reader.nextLine();
            if (input.equals("0")) {
                break;
            }

            String[] pieces = input.split(",");
            System.out.println("Name: " + pieces[0] + ", age: " + pieces[1]);
        }



    }
}