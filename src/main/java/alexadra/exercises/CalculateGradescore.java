package alexadra.exercises;

import java.util.Scanner;

public class CalculateGradescore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter student score: ");
        int score = scanner.nextInt();
        if (score <= 100 && score >= 90) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        scanner.close();
    }
}
