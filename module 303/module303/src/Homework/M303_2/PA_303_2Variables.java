package Homework.M303_2;

public class PA_303_2Variables {
    public static void main(String[] args) {
        // Exercise 1: Adding two integers
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("Sum of integers: " + sum);

        // Exercise 2: Adding two doubles
        double x = 5.5;
        double y = 10.5;
        double sumDouble = x + y;
        System.out.println("Sum of doubles: " + sumDouble);

        // Exercise 3: Adding an integer and a double
        int intVar = 5;
        double doubleVar = 10.5;
        double mixedSum = intVar + doubleVar; // Result is a double
        System.out.println("Sum of int and double: " + mixedSum);

        // Exercise 4: Dividing two integers
        int larger = 20;
        int smaller = 5;
        int divisionResult = larger / smaller;
        System.out.println("Division of two integers: " + divisionResult);

        // Change larger to a decimal
        double largerDecimal = 20.0;
        double decimalResult = largerDecimal / smaller; // Corrected to double division
        System.out.println("Decimal division result: " + decimalResult);

        // Exercise 5: Dividing two doubles
        double aDouble = 10.0;
        double bDouble = 3.0;
        double doubleDivisionResult = aDouble / bDouble;
        System.out.println("Double division result: " + doubleDivisionResult);
        int castedResult = (int) doubleDivisionResult; // Casting to int
        System.out.println("Casted division result to int: " + castedResult);

        // Exercise 6: Casting integer division to double
        int xInt = 5;
        int yInt = 6;
        double q = (double) yInt / xInt; // Cast y to double
        System.out.println("q after casting: " + q);

        // Exercise 7: Using a named constant
        final double SALES_TAX = 0.07; // 7% sales tax
        double priceBeforeTax = 100.00;
        double taxAmount = priceBeforeTax * SALES_TAX;
        double totalWithTax = priceBeforeTax + taxAmount;
        System.out.printf("Total price with tax: %.2f\n", totalWithTax);

        // Exercise 8: Calculating total sale for cafe products
        double coffeePrice = 3.50;
        double cappuccinoPrice = 4.50;
        double espressoPrice = 2.75;
        int coffeeQty = 3;
        int cappuccinoQty = 4;
        int espressoQty = 2;

        double subtotal = (coffeePrice * coffeeQty) + (cappuccinoPrice * cappuccinoQty) + (espressoPrice * espressoQty);
        double totalSale = subtotal + (subtotal * SALES_TAX);

        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.printf("Total sale (including tax): %.2f\n", totalSale);
    }
}


