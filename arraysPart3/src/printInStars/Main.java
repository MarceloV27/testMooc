package printInStars;

public class Main {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {


        int index = 0;

        while(index < array.length){
           int numberList = array[index];

           for(int i = 0; i< numberList; i++){
               System.out.print("*");
           }

           System.out.println("");
           index++;
        }




    }

}
