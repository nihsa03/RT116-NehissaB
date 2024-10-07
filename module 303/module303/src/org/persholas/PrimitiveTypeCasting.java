package org.persholas;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {
        int x=5;

        int y = x/2;
        System.out.println(y);

        double z = 5/2;
        System.out.println(z);

        double d = 5.0/2.0;
        System.out.println(d);

        //intro to typecasting

        int j= 5;
        int k = 2;
        double l= (double) j / (double) k;
        double e = (double)5/(double)2;
        System.out.println(l);
        System.out.println(e);


    }
}
