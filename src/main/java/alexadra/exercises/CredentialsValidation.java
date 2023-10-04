package alexadra.exercises;

import java.util.Scanner;

public class CredentialsValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your username: ");
        String username = scanner.nextLine();

        System.out.println("enter you password: ");
        String password = scanner.nextLine();
        if (username.equals("admin") && password.length() >= 8) {
            System.out.println("inputs are valid");
        } else {
            System.out.println("input is not valid");
        }
    }
}
