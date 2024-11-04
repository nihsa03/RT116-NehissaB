package Homework.M303.M303_5;

import java.util.Scanner;

public class PA_303_5 {
    // 1. Print a Multiplication Table
    public static void printMultiplicationTable() {
        System.out.println("Multiplication Table:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j); // Formatting for better alignment
            }
            System.out.println(); // New line after each row
        }
    }

    // 2. Find the Greatest Common Divisor (GCD)
    public static void findGCD() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two positive integers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int gcd = 1; // Start with the minimum GCD possible
        for (int k = 1; k <= Math.min(n1, n2); k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k; // Update GCD
            }
        }
        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd + ".");
    }

    // 3. Predict Future Tuition
    public static void predictTuition() {
        double tuition = 10000; // Current tuition
        int years = 0;

        while (tuition < 20000) {
            tuition *= 1.07; // Increase tuition by 7%
            years++;
        }
        System.out.println("It will take " + years + " years for the tuition to double.");
    }

    // Main method to run all tasks
    public static void main(String[] args) {
        printMultiplicationTable();
        findGCD();
        predictTuition();
    }
}

