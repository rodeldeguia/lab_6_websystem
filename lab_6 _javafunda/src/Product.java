import java.util.ArrayList;
import java.util.Scanner;

 public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

 class main{
        public static void main(String[] args) {
            ArrayList<Product> products = new ArrayList<Product>();
            products.add(new Product("Samsung", 11100));
            products.add(new Product("Huawie", 8200));
            products.add(new Product("Infinix", 10300));
            products.add(new Product("motorola", 12400));
            products.add(new Product("Myphone", 5500));

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the price of the product: ");
            double price = input.nextDouble();

            long count = products.stream().filter(p -> p.getPrice() > price).count();
            System.out.println("The product with the price of " + price + " is " + count);

        }
}



