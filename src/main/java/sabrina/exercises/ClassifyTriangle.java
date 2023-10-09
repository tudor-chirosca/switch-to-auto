package sabrina.exercises;

import java.util.Scanner;

public class ClassifyTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the angle A: ");
        int angleA = scanner.nextInt();
        System.out.println("Please enter the angle B: ");
        int angleB = scanner.nextInt();
        System.out.println("Please enter the angle C: ");
        int angleC = scanner.nextInt();
        if ((angleA + angleB + angleC) == 180) {
            System.out.println("Triangle is valid and is " + classifyTriangle(5, 5, 8));
        } else {
            System.out.println("Ops! Triangle is invalid");
        }
    }

    public static String classifyTriangle(int side1, int side2, int side3) {
        String triangle;
        if (side1 == side2 && side2 == side3) {
            triangle ="equilateral";
        } else if (side1 == side2 || side1 == side3 || side3 == side2) {
            triangle = "isosceles";
        } else {
            triangle = "scalene";
        }
        return triangle;
    }
}

