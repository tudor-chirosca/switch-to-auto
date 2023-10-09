package sabrina.exercises;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter item's price: ");
        double initialPrice = scanner.nextDouble();
        System.out.println("Is your loyalty card active (true/false)?: ");
        boolean loyaltyCard = scanner.nextBoolean();
        double finalPrice;
        if (initialPrice >= 100 && loyaltyCard) {
            finalPrice = (initialPrice - (initialPrice * 0.2));
        } else if (initialPrice >= 100) {
            finalPrice = (initialPrice - (initialPrice * 0.1));
        } else {
            finalPrice = initialPrice;
        }
        System.out.println("You need to pay: " + finalPrice);
    }
}
