package org.persholas;

public class WrappperClassesEx {


    public static void booleanAutoBox(boolean b) {
        System.out.println("Function of boolean" + b);
    }

    public static void autobox(Integer x) {
        System.out.println("Function of Integer" + x);
    }


    public static void main(String[] args) {
        int x = 5;

        Integer y = x;

        Integer z = Integer.valueOf(x);

        autobox(5);
        autobox(x);
        autobox(y);

        Integer value = null;

        //int v1=null;

        boolean b1= true;
        boolean b2= false;

        booleanAutoBox(b1);
        booleanAutoBox(b2);

    }
}