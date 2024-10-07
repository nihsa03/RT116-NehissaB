package Homework.M303_2;

import java.util.Scanner;

public class PA_303_2Scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read three integers
        System.out.println("Enter three integers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        // Print each integer on a new line
        System.out.println("Integers entered:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Read an integer, a double, and a string
        System.out.println("Enter an integer, a double, and a string:");
        int i = scan.nextInt();
        double d = scan.nextDouble();

        // Consume the newline character left by nextDouble()
        scan.nextLine();

        // Read the string
        String s = scan.nextLine();

        // Print the outputs in the required format
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        // Close the scanner
        scan.close();
    }
}


