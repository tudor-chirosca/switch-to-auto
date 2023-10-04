package sabrina.exercises;

import java.util.Scanner;

public class CalculateTriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of side A of triangle: ");
        double a = scanner.nextDouble();
        System.out.println("Enter length of side B of triangle: ");
        double b = scanner.nextDouble();
        System.out.println("Enter length of side C of triangle: ");
        double c = scanner.nextDouble();
        if (a == b && b == c) {
            System.out.println("The triangle is equilateral");
        } else if (a == b || a == c || c == b) {
            System.out.println("The triangle is isosceles");
        } else {
            System.out.println("The triangle is scalene");
        }
    }
}
