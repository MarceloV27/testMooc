package question4;

public class Main {
    public static void main(String[] args) {


        String string = "W3resource.com";

        int vari1 = string.codePointCount(1, string.length());

        System.out.println("Codepoint count = "+vari1);
    }
}
