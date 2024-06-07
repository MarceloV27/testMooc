package question3;

public class Main {
    public static void main(String[] args) {

        String[] array = {"-","_","-","-","-"};

        for (String s : array) {

            for (int j = 0; j < array.length; j++) {
                System.out.print(s);
            }

            System.out.println(" ");
        }
    }
}
