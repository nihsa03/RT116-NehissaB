package Homework.M303.M303_2;

public class PA_303_2OPandNUM {
    public static void main(String[] args) {

        // Task 3: Bitwise AND and OR
        int y = 17;
        int z;
        int x = 7;
        z = x & y; // Bitwise AND
        System.out.println("\nBitwise AND: x = " + x + ", y = " + y + ", z = " + z + ", Binary: " + Integer.toBinaryString(z));

        z = x | y; // Bitwise OR
        System.out.println("Bitwise OR: x = " + x + ", y = " + y + ", z = " + z + ", Binary: " + Integer.toBinaryString(z));

        // Task 4: Postfix increment
        int incrementVar = 10;
        System.out.println("\nBefore increment: " + incrementVar);
        incrementVar++; // Increment
        System.out.println("After increment: " + incrementVar);

        // Task 5: Incrementing in different ways
        int incVar = 5;
        System.out.println("\nInitial value: " + incVar);
        incVar++; // Method 1
        System.out.println("After increment: " + incVar);
        ++incVar; // Method 2
        System.out.println("After increment: " + incVar);
        incVar += 1; // Method 3
        System.out.println("After increment: " + incVar);

        // Task 6: Prefix vs. Postfix increment
        int sum;
        x = 5;
        y = 8;

        sum = ++x + y; // Prefix increment
        System.out.println("\nUsing prefix increment: sum = " + sum + " (x = " + x + ", y = " + y + ")");

        x = 5; // Reset x
        sum = x++ + y; // Postfix increment
        System.out.println("Using postfix increment: sum = " + sum + " (x = " + x + ", y = " + y + ")");
    }
}


