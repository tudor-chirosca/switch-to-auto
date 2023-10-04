package sabrina.exercises;

import java.util.Scanner;

public class ProductDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price: ");
        double price = scanner.nextDouble();
        double finalPrice;
        if (price > 50) {
            finalPrice = price - (price * 0.10);
            System.out.println("You need to pay: " + finalPrice);
        } else {
            System.out.println("You don't have a discount and you need to pay: " + price);
        }
    }
}
