package alexadra.exercises;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature");
        double temperature = scanner.nextDouble();
        System.out.println("Enter C for Celsius or F for Fahrenheit");
        char scale = scanner.next().charAt(0);
        double convertedTemperature = 0;
        if (scale == 'C' || scale == 'c') {
            convertedTemperature = (temperature * 5 / 9) + 39;
        } else if (scale == 'F' || scale == 'f') {
            convertedTemperature = (temperature - 32) * 5 / 9;
        } else {
            System.out.println("The error is displayed");
        }
        System.out.println("Your result is: " + convertedTemperature);
    }
}
