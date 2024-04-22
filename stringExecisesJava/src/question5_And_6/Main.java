package question5_And_6;

public class Main {

    public static void main(String[] args) {

        String string = "This is Exercise 1";
        String string1 = "This is Exercise 1";

        int result = string.compareTo(string1);

        if(result < 0){
            System.out.println("The string 1 is less than string 2");
        }else if (result == 0){
            System.out.println("The string 1 is equal to string 2");
        }else{
            System.out.println("The string 1 is greater than string 2");
        }


     /*   if(string.equals(string1)){
            System.out.println( string+ "is less than " + string1);
        }else{
            System.out.println( string+ "is equal to " + string1);
        }
*/






    }
}
