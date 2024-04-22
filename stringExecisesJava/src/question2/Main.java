package question2;

public class Main {
    public static void main(String[] args) {

        String string = "w3resource.com";

        System.out.println("Original String: " + string);

        int uniCode = string.codePointAt(1);

        int uniCode2 = string.codePointAt(2);

        System.out.println("Character(unicode point)" + uniCode);

        System.out.println("Character(unicode point)" + uniCode2);

    }
}
