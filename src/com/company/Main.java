package com.company;

public class Main {
    static double getUserFahrenheit() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("enter a fahrenheit temp.");
        String userInput = scanner.nextLine();
        return Double.parseDouble(userInput);
    }

    static double fToC(double fTemp) {
        return 5.0 / 9 * (fTemp - 32);
    }

    static void display(double cTemp) {
        System.out.println("the celsius temp is " + cTemp);
    }

    public static void main(String[] args) {
        double fTemp = getUserFahrenheit();
        while (fTemp >= -460) {
            double cTemp = fToC(fTemp);
            display(cTemp);
            fTemp = getUserFahrenheit();
        }
    }
}