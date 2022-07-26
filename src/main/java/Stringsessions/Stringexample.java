package Stringsessions;

public class Stringexample {
    static String s1 = "lalitha";
    static String s2 = "sri";
    static String s3=new String("i love srinivas");
    static String firstname="ambica";
    static String lastname="rani";
    static String fullname;

    public static void main(String[] args) {
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        String result=s1.toUpperCase();
        int len=s1.length();
        System.out.println(len);
        System.out.println(s3.length());
        System.out.println(s3.contains("srinivas"));
       //fullname=firstname+lastname;
        fullname=firstname.concat(lastname);
        System.out.println(fullname);
        System.out.println("fullname of the String is :"+fullname );
    }
}

