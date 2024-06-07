package Product;

public class Main {

    public static void main(String[] args) {


        Product product = new Product("Banana", 1.1, 13);
        Product product2 = new Product("Kiwis", 1.0, 20);

        product.printProduct();
        product2.printProduct();
    }
}
