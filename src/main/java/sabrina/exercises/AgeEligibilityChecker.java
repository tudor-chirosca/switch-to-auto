package sabrina.exercises;

import java.util.Scanner;

public class AgeEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Is your license suspended (True/False): ");
        boolean status = scanner.nextBoolean();
        if (age >= 18 && !status) {
            System.out.println("Person is eligible for a driver's license");
        } else {
            System.out.println("Person is not eligible for a driver's license");
        }
    }
}
