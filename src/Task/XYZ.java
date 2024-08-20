package Task;

import java.util.Scanner;

public class XYZ {

    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0.0;
        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter PID for product " + (i + 1) + ": ");
            int pid = scanner.nextInt();
            System.out.print("Enter price for product " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            System.out.print("Enter quantity for product " + (i + 1) + ": ");
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        Product highestPriceProduct = products[0];
        for (Product product : products) {
            if (product.getPrice() > highestPriceProduct.getPrice()) {
                highestPriceProduct = product;
            }
        }
        System.out.println("Product with highest price has PID: " + highestPriceProduct.getPid());
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        scanner.close();
}
}
