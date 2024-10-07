package Homework.M303_2;

public class GLAB_303_2 {
    public static void main(String[] args) {
        // Assignment Operators Demo
        int j, k;
        j = 10; // j gets the value 10.
        j = 5; // j gets the value 5. The previous value is overwritten.
        k = j; // k gets the value 5.
        System.out.println("Assignment Operators Demo:");
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);

        // Multiple Assignments
        k = j = 10; // (k = (j = 10))
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);

        // Arithmetic Operators Demo
        int x, y = 10, z = 5;
        x = y + z;
        System.out.println("\nArithmetic Operators Demo:");
        System.out.println("+ operator resulted in " + x);
        x = y - z;
        System.out.println("- operator resulted in " + x);
        x = y * z;
        System.out.println("* operator resulted in " + x);
        x = y / z;
        System.out.println("/ operator resulted in " + x);
        x = y % z;
        System.out.println("% operator resulted in " + x);
        x = y++;
        System.out.println("Postfix ++ operator resulted in " + x);
        x = ++z;
        System.out.println("Prefix ++ operator resulted in " + x);
        x = -y;
        System.out.println("Unary operator resulted in " + x);

        // Special Cases
        int tooBig = Integer.MAX_VALUE + 1; // -2147483648
        int tooSmall = Integer.MIN_VALUE - 1; // 2147483647
        System.out.println("tooBig becomes " + tooBig);
        System.out.println("tooSmall becomes " + tooSmall);
        System.out.println(4.0 / 0.0); // Prints: Infinity
        System.out.println(-4.0 / 0.0); // Prints: -Infinity
        System.out.println(0.0 / 0.0); // Prints: NaN
        double d1 = 12 / 8; // result: 1
        double d2 = 12.0F / 8; // result: 1.5
        System.out.println("d1 is " + d1);
        System.out.println("d2 is " + d2);

        // Relational Operators Demo
        x = 10;
        y = 5;
        System.out.println("\nRelational Operators Demo:");
        System.out.println("x > y : " + (x > y));
        System.out.println("x < y : " + (x < y));
        System.out.println("x >= y : " + (x >= y));
        System.out.println("x <= y : " + (x <= y));
        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y));

        int variable1 = 50, variable2 = 100, variable3 = 50;
        System.out.println("variable1 = " + variable1);
        System.out.println("variable2 = " + variable2);
        System.out.println("variable3 = " + variable3);
        System.out.println("variable1 == variable2: " + (variable1 == variable2));
        System.out.println("variable1 == variable3: " + (variable1 == variable3));

        // Logical Operators Demo
        boolean a = true, b = false;
        System.out.println("\nLogical Operators Demo:");
        System.out.println("x & y : " + (a & b));
        System.out.println("x && y : " + (a && b));
        System.out.println("x | y : " + (a | b));
        System.out.println("x || y: " + (a || b));
        System.out.println("x ^ y : " + (a ^ b));
        System.out.println("!x : " + (!a));

        // Ternary Operator Demo
        int age = 18;
        String result = age < 100 ? "Less than 100" : "Greater than 100";
        System.out.println("\nTernary Operator Demo:");
        System.out.println(result); // Less than 100

        // Unary Operators Demo
        int sum = +1;
        System.out.println("\nUnary Operators Demo:");
        System.out.println(sum); // 1
        sum--;
        System.out.println(sum); // 0
        sum++;
        System.out.println(sum); // 1
        sum = -sum;
        System.out.println(sum); // -1

        boolean resultBool = false;
        System.out.println(resultBool); // false
        System.out.println(!resultBool); // true

        // Auto Type Conversion Demo
        int a1 = 20;
        double a2 = 40.5;
        long p = 30;
        float q = 10.60f;
        double z = a1 + a2;
        System.out.println("\nAuto Type Conversion Demo:");
        System.out.println("Sum of two numbers: " + z);

        float r = p - q;
        System.out.println("Subtraction of two numbers: " + r);

        // Auto Promote Test Demo
        byte b1 = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        double finalResult = (f * b1) + (i / c) - (d * s);
        System.out.println("\nAuto Promote Test Demo:");
        System.out.println("result = " + finalResult);

        // Explicit Test Demo
        double dVal = 100.04;
        long l = (long) dVal;
        int iVal = (int) l;
        System.out.println("\nExplicit Type Casting Demo:");
        System.out.println("Double value " + dVal);
        System.out.println("Long value " + l);
        System.out.println("Int value " + iVal);

        byte bVal;
        int zVal = 257;
        double dou = 323.142;
        System.out.println("Conversion of int to byte.");
        bVal = (byte) zVal;
        System.out.println("z = " + zVal + " b = " + bVal);
        System.out.println("Conversion of double to int.");
        zVal = (int) dou;
        System.out.println("dou = " + dou + " b = " + zVal);
        System.out.println("Conversion of double to byte.");
        bVal = (byte) dou;
        System.out.println("dou = " + dou + " b = " + bVal);
    }
}



