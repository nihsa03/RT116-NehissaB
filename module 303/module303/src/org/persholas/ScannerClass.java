package org.persholas;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        System.out.print("Enter the radius of your circle: ");

        Scanner scanner= new Scanner(System.in);

        double x = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("You entered a radius of: "+x);

        double area = x * x * 3.14159;
        System.out.println("The area of the circle is : "+area);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}
