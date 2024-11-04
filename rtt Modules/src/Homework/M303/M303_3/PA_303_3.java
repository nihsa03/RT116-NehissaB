package Homework.M303.M303_3;

import java.util.Scanner;


public class PA_303_3 {

    public class Solution {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            /* Enter your code here. Print output to STDOUT. */
            //String s= A + B;
            //System.out.println(s);
            int sum= (A.length()+B.length());
            System.out.println(sum);
            if(A.compareTo(B)>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            System.out.println((Character.toUpperCase(A.charAt(0))+ A.substring(1)) +" " + (Character.toUpperCase(B.charAt(0))+ B.substring(1)));

        }
    }

}
