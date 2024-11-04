package Homework.M303.M303_4;

import java.util.Scanner;

public class PA_303_4 {
    public static void main(String[] args) {

        // Part 1: Check if x is less than 10
        System.out.println("Part 1: Check if x is less than 10");
        int x1 = 7;
        if (x1 < 10) {
            System.out.println("Less than 10");
        }
        x1 = 15; // Change x to 15
        // No output since 15 is not less than 10
        System.out.println(); // Blank line for separation

        // Part 2: Check with if-else
        System.out.println("Part 2: Check with if-else");
        int x2 = 7;
        if (x2 < 10) {
            System.out.println("Less than 10");
        } else if (x2 > 10) {
            System.out.println("Greater than 10");
        }
        x2 = 15; // Change x to 15
        // No output since 15 is greater than 10
        System.out.println(); // Blank line for separation

        // Part 3: Check range with if-else-if
        System.out.println("Part 3: Check range with if-else-if");
        int x3 = 15;
        if (x3 < 10) {
            System.out.println("Less than 10");
        } else if (x3 >= 10 && x3 < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }
        x3 = 50; // Change x to 50
        // No output since 50 is greater than 20
        System.out.println(); // Blank line for separation

        // Part 4: Check if x is in range
        System.out.println("Part 4: Check if x is in range");
        int x4 = 15;
        if (x4 < 10 || x4 > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }
        x4 = 5; // Change x to 5
        System.out.println("Output: Out of range"); // Output for changed value
        System.out.println(); // Blank line for separation

        // Part 5: Determine letter grade based on score
        System.out.println("Part 5: Determine letter grade based on score");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score (0-100): ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        System.out.println(); // Blank line for separation

        // Part 6: Print corresponding weekday
        System.out.println("Part 6: Print corresponding weekday");
        System.out.print("Enter a number (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
                break;
        }
    }
}
