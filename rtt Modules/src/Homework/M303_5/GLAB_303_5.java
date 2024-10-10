package Homework.M303_5;

import java.util.Scanner;

public class GLAB_303_5 {
    // 1. Program to print a text 5 times
    public static void printText() {
        int n = 5;
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }
    }

    // 2. Program to find the sum of natural numbers from 1 to 1000
    public static void sumNaturalNumbers() {
        int sum = 0;
        int n = 1000;
        for (int i = 1; i <= n; ++i) {
            sum += i; // sum = sum + i
        }
        System.out.println("Sum = " + sum);
    }

    // 3. Program to check if a string/number is a palindrome
    public static void checkPalindrome() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        String original = in.nextLine();
        String reverse = new StringBuilder(original).reverse().toString();
        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        } else {
            System.out.println("Entered string/number isn't a palindrome.");
        }
    }

    // 4. Program to print a pyramid of stars
    public static void printPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // new line
        }
    }
//303_5_2
    // 1. Guess the magic number
    public static void guessTheNumber() {
        int number = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
        int guess = -1;
        while (guess != number) {
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();
            if (guess == number) {
                System.out.println("Yes, the number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }
        }
    }

    // 2. Subtraction quiz
    public static void subtractionQuiz() {
        final int NUMBER_OF_QUESTIONS = 5; // Number of questions
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Count the number of questions
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();
            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong. " + number1 + " - " + number2 + " should be " + (number1 - number2));
            }
            count++;
        }
    }

    // 3. Sentinel value example
    public static void sentinelValueDemo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int value (the program exits if the input is 0): ");
        int data = input.nextInt();
        int sum = 0;
        while (data != 0) {
            sum += data;
            System.out.print("Enter an int value (the program exits if the input is 0): ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}

