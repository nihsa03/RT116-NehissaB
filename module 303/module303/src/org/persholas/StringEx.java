package org.persholas;

public class StringEx {
    public static void main(String[] args){

        String s="abcdef";


        System.out.println("The length of the string is " + s.length());

        System.out.println("Uppercase= " + s.toUpperCase());

        String concat= s.concat("ghijk");
        System.out.println("The concatenated string is " + concat);

        System.out.println(s.charAt(0));
        ;
        System.out.println(s.charAt(5));

        //System.out.println(s.charAt(6));

        String r= "abc123abc";
        System.out.println(r);
        System.out.println(r.replace("a" , "z"));
        System.out.println(r.replace("abc", "xyz"));
        System.out.println(r.replaceAll("\\d","9" ));




    }
}
