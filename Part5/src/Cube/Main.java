package Cube;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Cube testOne = new Cube(50);
        System.out.println(testOne);

        System.out.println();

        Cube testTwo = new Cube(4);
        System.out.println(testTwo.volume());
        System.out.println(testTwo);

    }
}
