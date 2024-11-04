package Homework.M303.M303_3;

import java.util.Arrays;
import java.util.Scanner;


public class GLAB_303_3 {
    public static void main(String[] args) {
        // Length Demo
        String str1 = "Java";
        String str2 = "";
        System.out.println("Length Demo:");
        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0
        System.out.println("Java".length());  // 4
        System.out.println("Java\n".length()); // 5
        System.out.println("Learn Java".length()); // 10

        // Is Empty Example
        System.out.println("\nIs Empty Example:");
        String s1 = "";
        String s2_ = "hello";
        System.out.println(s1.isEmpty());      // true
        System.out.println(s2_.isEmpty());      // false

        // String Trim Example
        System.out.println("\nString Trim Example:");
        String s3 = "  hello   ";
        System.out.println(s3 + "how are you");        // without trim()
        System.out.println(s3.trim() + "how are you"); // with trim()

        // String Lower Example
        System.out.println("\nString Lower Example:");
        String s4 = "HELLO HOW Are You?";
        String s4Lower = s4.toLowerCase();
        System.out.println(s4Lower);

        // String Upper Example
        System.out.println("\nString Upper Example:");
        String s5 = "hello how are you";
        String s5Upper = s5.toUpperCase();
        System.out.println(s5Upper);

        // Concat Demo
        System.out.println("\nConcat Demo:");
        String str3 = "Learn ";
        String str4 = "Java";
        System.out.println(str3.concat(str4)); // "Learn Java"
        System.out.println(str4.concat(str3)); // "JavaLearn "
        String s6 = "hello";
        String s7 = "Learners";
        String s8 = s6 + s7; // Concatenation using +
        System.out.println(s8);

        // Split Example
        System.out.println("\nSplit Example:");
        String vowels = "a::b::c::d:e";
        String[] result = vowels.split("::");
        System.out.println("result = " + Arrays.toString(result));

        // Char At Example
        System.out.println("\nChar At Example:");
        String message = "Welcome to Java";
        System.out.println("The first character in the message is " + message.charAt(0));

        // Compare To Example
        System.out.println("\nCompare To Example:");
        String s9 = "hello";
        String s10 = "hello";
        String s11 = "hemlo";
        String s12 = "flag";
        System.out.println(s9.compareTo(s10)); // 0
        System.out.println(s9.compareTo(s11)); // -1
        System.out.println(s9.compareTo(s12)); // 2

        // Substring Demo
        System.out.println("\nSubstring Demo:");
        String str5 = "java is fun";
        System.out.println(str5.substring(0, 4)); // "java"

        // Find String Example
        System.out.println("\nFind String Example:");
        String str6 = "Java is fun";
        System.out.println(str6.indexOf('s')); // 6
        System.out.println(str6.lastIndexOf('J')); // 0
        System.out.println(str6.lastIndexOf('a')); // 3
        System.out.println(str6.lastIndexOf('j')); // -1
        System.out.println(str6.lastIndexOf("ava")); // 1
        System.out.println(str6.lastIndexOf("java")); // -1

        // Contain Example
        System.out.println("\nContain Example:");
        String str7 = "Learn Java";
        System.out.println(str7.contains("Java"));  // true
        System.out.println(str7.contains("Python")); // false
        System.out.println(str7.contains(""));       // true

        // Replace Demo
        System.out.println("\nReplace Demo:");
        String str8 = "abc cba";
        System.out.println(str8.replace('a', 'z')); // "zbc czb"
        System.out.println("Lava".replace('L', 'J')); // "Java"
        System.out.println("Hello".replace('4', 'J')); // "Hello"
        System.out.println(str8.replace("C++", "Java")); // "abc cba"
        System.out.println("aa bb aa zz".replace("aa", "zz")); // "zz bb zz zz"

        // Replace All Demo
        System.out.println("\nReplace All Demo:");
        String str9 = "Java123is456fun";
        String regex = "\\d+";
        System.out.println(str9.replaceAll(regex, " ")); // "Java is fun"

        // Test String Comparison
        System.out.println("\nTest String Comparison:");
        String s13 = "PerScholas";
        String s14 = "PerScholas";
        String s15 = new String("PerScholas");
        String s16 = "Teksystem";
        System.out.println(s13.equals(s14)); // true
        System.out.println(s13.equals(s15)); // true
        System.out.println(s13.equals(s16)); // false

        // Test String Comparison with '=='
        System.out.println("\nTest String Comparison with '==':");
        String s17 = "Perscholas";
        String s18 = "Perscholas";
        String s19 = new String("Perscholas");
        System.out.println(s17 == s18); // true
        System.out.println(s17 == s19); // false

        // Compare To Example
        System.out.println("\nTest String Comparison with compareTo:");
        String s20 = "Perscholas";
        String s21 = "Perscholas";
        String s22 = "Perschola";
        String s23 = "PerscholasX";
        System.out.println(s20.compareTo(s21)); // 0
        System.out.println(s20.compareTo(s22)); // 1
        System.out.println(s20.compareTo(s23)); // -1

        // Reading Strings from Console
        Scanner input = new Scanner(System.in);

        // Read three words
        System.out.print("\nEnter three words separated by spaces: ");
        String input1 = input.next();
        String input2 = input.next();
        String input3 = input.next();
        System.out.println("First word: " + input1);
        System.out.println("Second word: " + input2);
        System.out.println("Third word: " + input3);

        // Read a character
        System.out.print("\nEnter a character: ");
        String s = input.next();
        char ch = s.charAt(0);
        System.out.println("The character entered is " + ch);

        input.close(); // Close the scanner
    }
}
