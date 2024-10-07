package Homework.M303_2;

public class GLAB_303_2 {


    public class AssignmentOperatorsDemo {
        public static void main(String args[]) {
            //   Assigning Primitive Values
            int j, k;
            j = 10; // j gets the value 10.
            j = 5; // j gets the value 5. The previous value is overwritten.
            k = j; // k gets the value 5.
            System.out.println("j is : " + j);
            System.out.println("k is : " + k);

            //              Multiple Assignments
            k = j = 10; // (k = (j = 10))
            System.out.println("j is : " + j);
            System.out.println("k is : " + k);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x, y = 10, z = 5;
        x = y + z;
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
        // Some examples of special Cases
        int tooBig = Integer.MAX_VALUE + 1; // -2147483648 which is
        // Integer.MIN_VALUE.
        int tooSmall = Integer.MIN_VALUE - 1; // 2147483647 which is
        // Integer.MAX_VALUE.
        System.out.println("tooBig becomes " + tooBig);
        System.out.println("tooSmall becomes " + tooSmall);
        System.out.println(4.0 / 0.0); // Prints: Infinity
        System.out.println(-4.0 / 0.0); // Prints: -Infinity
        System.out.println(0.0 / 0.0); // Prints: NaN
        double d1 = 12 / 8; // result: 1 by integer division. The value of d1 becomes 1.0.
        double d2 = 12.0F / 8; // result: 1.5
        System.out.println("d1 is " + d1);
        System.out.println("d2 is " + d2);
    }

    public class RelationalOperatorsDemo {
        public static void main(String[] args)
        {
            int x = 10, y = 5;
            System.out.println("x > y : "+(x > y));
            System.out.println("x < y : "+(x < y));
            System.out.println("x >= y : "+(x >= y));
            System.out.println("x <= y : "+(x <= y));
            System.out.println("x == y : "+(x == y));
            System.out.println("x != y : "+(x != y));

            int variable1 = 50, variable2 = 100, variable3 = 50;
            System.out.println("variable1 = " + variable1);
            System.out.println("variable2 = " + variable2);
            System.out.println("variable3 = " + variable3);
            System.out.println("variable1 == variable2: "
                    + (variable1 == variable2));

            System.out.println("variable1 == variable3: "
                    + (variable1 == variable3));
        }
    }

    public class LogicalOperatorsDemo {
        public static void main(String[] args)
        {
            boolean x = true;
            boolean y = false;
            System.out.println("x & y : " + (x & y));
            System.out.println("x && y : " + (x && y));
            System.out.println("x | y : " + (x | y));
            System.out.println("x || y: " + (x || y));
            System.out.println("x ^ y : " + (x ^ y));
            System.out.println("!x : " + (!x));
        }
    }


    public class TernaryOperatorDemo {
        public static void main(String[] args) {
            int age = 18;
            String result = age < 100 ?
                    "Less than 100" : "Greater than 100";
            System.out.println(result); //Less than 100
        }
    }

    public class UnaryOperator {
        public static void main(String[] args)
        {
            int sum = +1;
            // sum is now 1
            System.out.println(sum);

            sum--;
            // sum is now 0
            System.out.println(sum);

            sum++;
            // sum is now 1
            System.out.println(sum);

            sum = -sum;
            // sum is now -1
            System.out.println(sum);

            boolean result = false;
            // false
            System.out.println(result);
            // true
            System.out.println(!result);
        }
    }


    public class AutoTypeConversion {
        public static void main(String[] args) {
            int x = 20;
            double y = 40.5;
            long p = 30;
            float q = 10.60f;
            // int z = x + y; (1) // Error; cannot convert from double to int.
            double z = x + y;
            System.out.println("Sum of two numbers: " + z);

            // long r = p - q; // (2) // Error; cannot convert from float to long.
            float r = p - q;
            System.out.println("Subtraction of two numbers: " + r);
        }
    }


    public class AutoPromoteTest {
        public static void main(String[] args)
        {
            byte b = 42;
            char c = 'a';
            short s = 1024;
            int i = 50000;
            float f = 5.67f;
            double d = .1234;
// Expression:
            double result = (f * b) + (i / c) - (d * s);
//Result after all the promotions are done.
            System.out.println("result = " + result);
        }
    }


    public class ExplicitTest {
        public static void main(String[] args) {
            double d = 100.04;
            // explicit type casting
            long l = (long)d;
            int i = (int)l;
            System.out.println("Double value "+d);
            System.out.println("Long value "+l);
            System.out.println("Int value "+i);

            byte b;
            int z = 257;
            double dou = 323.142;
            System.out.println("Conversion of int to byte.");
            b = (byte) z;
            System.out.println("z = " + z + " b = " + b);
            System.out.println("Conversion of double to int.");

            z = (int) dou;
            System.out.println("dou = " + dou + " b = " + z);
            System.out.println("Conversion of double to byte.");

            b = (byte) dou;
            System.out.println("dou = " + dou + " b = " + b);

        }
    }








}


}
