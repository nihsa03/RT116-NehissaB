package Homework.M303_2;

import java.util.Scanner;

public class PA_303_2Scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read three integers
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        // Print each integer on a new line
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scan.close(); // Close the scanner
    }

    public class Solution {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            // Read the integer
            int i = scan.nextInt();

            // Read the double
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

}

