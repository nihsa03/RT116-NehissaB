package Homework.M303.M303_7;

import java.util.Arrays;
import java.util.Scanner;

public class PA_303_7 {public static void main(String[] args) {
    // Task 1: Create an array of integers and print each element
    int[] array1 = {1, 2, 3};
    System.out.println("Task 1: ");
    for (int i = 0; i < array1.length; i++) {
        System.out.println("Element at index " + i + ": " + array1[i]);
    }

    // Task 2: Return the middle element in an array
    int[] array2 = {13, 5, 7, 68, 2};
    System.out.println("\nTask 2: ");
    System.out.println("Middle element: " + array2[array2.length / 2]);

    // Task 3: Create a String array, print its length, and clone it
    String[] colors = {"red", "green", "blue", "yellow"};
    System.out.println("\nTask 3: ");
    System.out.println("Array length: " + colors.length);
    String[] clonedColors = colors.clone();
    System.out.println("Cloned array: " + Arrays.toString(clonedColors));

    // Task 4: Create an integer array and demonstrate exception handling
    int[] array4 = {10, 20, 30, 40, 50};
    System.out.println("\nTask 4: ");
    System.out.println("First index value: " + array4[1]);
    System.out.println("Last index value: " + array4[array4.length - 1]);
    try {
        System.out.println("Trying to access index " + array4.length + ": " + array4[array4.length]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Exception: " + e);
    }
    try {
        array4[array4.length] = 60; // This will cause an exception
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Exception: " + e);
    }

    // Task 5: Create an integer array and assign loop control variable
    int[] array5 = new int[5];
    System.out.println("\nTask 5: ");
    for (int i = 0; i < array5.length; i++) {
        array5[i] = i;
        System.out.println("Value at index " + i + ": " + array5[i]);
    }

    // Task 6: Assign loop control variable multiplied by 2
    int[] array6 = new int[5];
    System.out.println("\nTask 6: ");
    for (int i = 0; i < array6.length; i++) {
        array6[i] = i * 2;
        System.out.println("Value at index " + i + ": " + array6[i]);
    }

    // Task 7: Print values except for the middle element
    int[] array7 = {0, 1, 2, 3, 4};
    System.out.println("\nTask 7: ");
    for (int i = 0; i < array7.length; i++) {
        if (i != 2) { // Skip the middle element
            System.out.println("Value at index " + i + ": " + array7[i]);
        }
    }

    // Task 8: Swap first element with the middle element
    String[] array8 = {"a", "b", "c", "d", "e"};
    System.out.println("\nTask 8: Before swapping: " + Arrays.toString(array8));
    String temp = array8[0];
    array8[0] = array8[2]; // Swap
    array8[2] = temp;
    System.out.println("After swapping: " + Arrays.toString(array8));

    // Task 9: Sort the array and find smallest and largest
    int[] array9 = {4, 2, 9, 13, 1, 0};
    Arrays.sort(array9);
    System.out.println("\nTask 9: ");
    System.out.println("Array in ascending order: " + Arrays.toString(array9));
    System.out.println("The smallest number is: " + array9[0]);
    System.out.println("The biggest number is: " + array9[array9.length - 1]);

    // Task 10: Create an array with mixed types and print it
    Object[] array10 = {42, "one", "two", "three", 3.14};
    System.out.println("\nTask 10: ");
    System.out.println("Array contents: " + Arrays.toString(array10));

    // Task 11: User input for favorite things
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nTask 11: How many favorite things do you have? ");
    int count = scanner.nextInt();
    scanner.nextLine(); // Consume the newline

    String[] favoriteThings = new String[count];
    for (int i = 0; i < count; i++) {
        System.out.print("Enter your thing: ");
        favoriteThings[i] = scanner.nextLine();
    }
    System.out.println("Your favorite things are: " + Arrays.toString(favoriteThings));
}
}

