package Homework.M303.M303_6;

import java.util.Scanner;

public class GLAB_303_6 {
    public static void main(String[] args) {
        // 1. Accessing Elements of an Array
        int[] age = {12, 4, 5, 2, 5};
        System.out.println("Accessing Elements of an Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);

        // 2. Using for Loop
        int[] ageLoop = {12, 4, 5};
        System.out.println("\nUsing for Loop:");
        for (int i = 0; i < ageLoop.length; i++) {
            System.out.println(ageLoop[i]);
        }

        // 3. Iterating Over an Array using Enhanced For Loop
        String[] names = {"New York", "Dallas", "Las Vegas", "Florida"};
        System.out.println("\nUsing Enhanced For Loop:");
        for (String name : names) {
            System.out.println(name);
        }

        // 4. Compute the Sum and Average of Array Elements
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        double average;
        for (int number : numbers) {
            sum += number;
        }
        int arrayLength = numbers.length;
        average = ((double) sum / arrayLength);
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);

        // 5. Mean and Standard Deviation
        int[] marks = {74, 43, 58, 60, 90, 64, 70};
        int sumMarks = 0;
        int sumSq = 0;
        double mean, stdDev;
        for (int i = 0; i < marks.length; ++i) {
            sumMarks += marks[i];
            sumSq += marks[i] * marks[i];
        }
        mean = (double) sumMarks / marks.length;
        stdDev = Math.sqrt((double) sumSq / marks.length - mean * mean);
        System.out.printf("\nMean is: %.2f%n", mean);
        System.out.printf("Standard deviation is: %.2f%n", stdDev);

        // 6. Insert an Element at the end of an Array
        int[] arr = new int[11];
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter 10 Elements: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter an Element to Insert: ");
        int element = scan.nextInt();
        arr[10] = element; // Insert element at the end

        System.out.println("\nNow the new array is: ");
        for (int i = 0; i < 11; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

